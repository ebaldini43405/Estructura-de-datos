package proyectoColas;

import javax.swing.JOptionPane;

public class PilaDeck {

    private NodoCarta cima;
    int tama;
    private Jugador jugador;

    public PilaDeck() {
        cima = null;
        tama = 0;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public NodoCarta sacar() {
        NodoCarta auxiliar = cima;
        cima = cima.siguiente;
        tama--;
        return auxiliar;
    }

    public NodoCarta cima() {
        return cima;
    }

    public int tamanoPila() {
        return tama;
    }

    public void limpiarPila() {
        while (!estaVacia()) {
            sacar();
        }
    }

    public void imprimirIdentificador(NodoCarta aux) {
        if (aux.id == 13) {
            System.out.print("Rey");
        } else if (aux.id == 12) {
            System.out.print("Reina");
        } else if (aux.id == 11) {
            System.out.print("Jota");
        } else if (aux.id == 1) {
            System.out.print("As");
        } else {
            System.out.print(aux.id);
        }
    }

    /*public void imprimirDeck() {
        NodoCarta aux = cima;
        while (aux != null) {
            System.out.print(aux.fam + " ");
            imprimirIdentificador(aux);
            System.out.print(" - ");
            aux = aux.siguiente;
        }
    }*/
    public void imprimirDeck() {
        NodoCarta aux = cima;
        imprimirDeckRecursivo(aux);
    }

    public void imprimirDeckRecursivo(NodoCarta aux) {

        if (aux == null) {
            return;
        }
        System.out.print(aux.fam + " ");
        imprimirIdentificador(aux);
        System.out.print(" - ");
        imprimirDeckRecursivo(aux.siguiente);
    }

    public void insertar(NodoCarta elem) {
        NodoCarta nuevo = new NodoCarta(elem.fam, elem.id);
        nuevo.siguiente = cima;
        cima = nuevo;
        tama++;
    }

    public void repartir(ColaDeck deckDesordenado) {
        insertar(deckDesordenado.inicio);
        deckDesordenado.quitar();
    }

}
