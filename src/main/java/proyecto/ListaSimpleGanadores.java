/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author estef
 */
public class ListaSimpleGanadores {
    NodoJugador inicio, fin;

    public ListaSimpleGanadores(){
        inicio = null;
        fin = null;
    }
    public boolean esVacia(){
        if(inicio == null){
            return true;
        }else{
            return false;
        }
    }
    public void agregarJugadorGanador(Jugador jugador, int numJugador, int numMesa){
        if(!esVacia()){
            fin.siguiente = new NodoJugador(jugador, numJugador, numMesa);
            fin = fin.siguiente;
        }else{
            inicio = fin = new NodoJugador(jugador,  numJugador, numMesa);
        }

    }

    public void mostrarListaGanadores(){
        NodoJugador recorrer = inicio;
        int numeroJugador = 1;
        while (recorrer != null){

            System.out.println("\nJugador #"+numeroJugador+" ");

            recorrer.jugador.deck.imprimirDeck();
            recorrer = recorrer.siguiente;
            numeroJugador++;
        }
        System.out.println();
    }
    
}
