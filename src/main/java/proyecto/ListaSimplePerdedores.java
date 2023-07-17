/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author estef
 */
public class ListaSimplePerdedores {
   NodoJugador inicio, fin;

    public ListaSimplePerdedores(){
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
    public void agregarJugadorPerdedor(Jugador jugador, int numJugador, int numMesa){
        if(!esVacia()){
            fin.siguiente = new NodoJugador(jugador,  numJugador, numMesa);
            fin = fin.siguiente;
        }else{
            inicio = fin = new NodoJugador(jugador, numJugador, numMesa);
        }

    }

    public void mostrarListaPerdedores(){
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
