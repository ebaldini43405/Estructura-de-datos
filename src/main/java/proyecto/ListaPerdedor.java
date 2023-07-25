/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author justi
 */
public class ListaPerdedor 
{
    private NodoP cabeza;
    
    public void insertar(Jugador jugador)
    {
        if(cabeza == null)
        {
            //Lista está vacía
            cabeza = new NodoP(jugador);
        }
        else
        {
            if(jugador.id > cabeza.jugador.id)
            {
                NodoP auxiliar = new NodoP (jugador);
                auxiliar.siguiente = cabeza;
                cabeza = auxiliar;
            }
            else
            {
                if(cabeza.siguiente == null)
                {
                    cabeza.siguiente = new NodoP(jugador);
                }
                else
                {
                    NodoP auxiliar = cabeza;
                    while(auxiliar.siguiente != null && 
                          auxiliar.siguiente.jugador.id > jugador.id)
                        {
                            auxiliar = auxiliar.siguiente;
                        }
                    NodoP nuevo = new NodoP(jugador);
                    nuevo.siguiente = auxiliar.siguiente;
                    auxiliar.siguiente = nuevo;
                }
            }
        }
    }
            
    public void mostrarJugadoresPerdedores(){
        NodoP recorrer = cabeza;
        System.out.println("\n"+"Jugadores Perdedores: ");
        while (recorrer != null){
            System.out.println("\nJugador #"+recorrer.jugador.id +" "); 
            recorrer.jugador.deck.imprimirDeck();
            System.out.println("\n");
            recorrer = recorrer.siguiente;
        }
        System.out.println();
    }
}
