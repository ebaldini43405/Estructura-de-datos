/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author estef
 */
public class NodoJugador {
    NodoJugador siguiente;
    Jugador jugador;
    int numJugador;
    int numMesa;

    public NodoJugador(Jugador jugador, int numJugador, int numMesa) {
        this.jugador = jugador;
        this.numJugador = numJugador;
        this.numMesa = numMesa;
    }
  
}
