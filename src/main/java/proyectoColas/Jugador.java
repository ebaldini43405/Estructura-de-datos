package proyectoColas;

import javax.swing.JOptionPane;

public class Jugador 
{
    ColaDeck mano = new ColaDeck();
    PilaDeck jugador = new PilaDeck();
    NodoJugador cima;
       
    public void AgregarJugadores() 
    {
        Dato d = new Dato();

        d.setNombre(JOptionPane.showInputDialog(null, "jugador:"));

        NodoJugador nuevo = new NodoJugador();

        nuevo.setElemento(d);

        if (jugador.estaVacia()) 
        {
            cima = nuevo;
            System.out.println("prueba");
            
        } 
        else 
        {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
    }
    public String imprimirPila()
    {
        String respuesta = "";
        if(!jugador.estaVacia())
        {
            NodoJugador temp = cima; 
            while(temp != null) 
            {
                System.out.println("La mano de cartas del jugador es: ");
                respuesta += temp.getElemento().getNombre() + "\n"; 
                temp = temp.getSiguiente();
                
            }
        }
        else
        {
            respuesta = "La pila está vacía";
        }
        
        return respuesta;
    }      
}
