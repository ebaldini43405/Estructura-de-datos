/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author justi
 */
public class ListaGanador 
{
    private NodoG cabeza;
    
    public void insertar(Jugador jugador)
    {
        if(cabeza == null)
        {
            //Lista está vacía
            cabeza = new NodoG(jugador);
        }
        else
        {
            if(jugador.id < cabeza.jugador.id)
            {
                NodoG auxiliar = new NodoG (jugador);
                auxiliar.siguiente = cabeza;
                cabeza = auxiliar;
            }
            else
            {
                if(cabeza.siguiente == null)
                {
                    cabeza.siguiente = new NodoG(jugador);
                }
                else
                {
                    NodoG auxiliar = cabeza;
                    while(auxiliar.siguiente != null && 
                          auxiliar.siguiente.jugador.id < jugador.id)
                        {
                            auxiliar = auxiliar.siguiente;
                        }
                    NodoG nuevo = new NodoG(jugador);
                    nuevo.siguiente = auxiliar.siguiente;
                    auxiliar.siguiente = nuevo;
                }
            }
        }
    }
             
    public void mostrarJugadoresGanadores(){
        NodoG recorrer = cabeza;
        System.out.println("\n"+"Jugadores Ganadores: ");
        while (recorrer != null){
             
            recorrer.jugador.deck.imprimirDeck();
            System.out.println("\n");
            recorrer = recorrer.siguiente;
        }
        System.out.println();
    }
      
}
