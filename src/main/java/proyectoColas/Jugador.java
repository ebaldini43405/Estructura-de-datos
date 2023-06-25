package proyectoColas;

import javax.swing.JOptionPane;

public class Jugador {

        PilaDeck jugador = new PilaDeck();
        NodoJugador cima;
       
        public void Jugadores() {
        Dato d = new Dato();

        d.setNombre(JOptionPane.showInputDialog(null, "jugador:"));

        NodoJugador nuevo = new NodoJugador();

        nuevo.setElemento(d);

        if (jugador.estaVacia()) {
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
    }
}
