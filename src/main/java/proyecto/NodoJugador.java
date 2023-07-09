/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author estefania baldini
 */
public class NodoJugador {
    private Dato elemento;
    private NodoJugador siguiente;
    private Jugador jugador;

    public NodoJugador() 
    {
        this.siguiente = null;
    }
    
    public NodoJugador getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoJugador siguiente) {
        this.siguiente = siguiente;
    }

    public Dato getElemento() {
        return elemento;
    }

    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

   
    @Override
    public String toString() {
        return "NodoPila{" + "elemento=" + elemento + ", siguiente=" + siguiente + ", producto=" + jugador + '}';
    }

    
}
