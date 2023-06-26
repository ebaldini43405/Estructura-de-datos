package proyectoColas;

import java.util.Random;

public class ColaDeck {
    //como cualquier cola tiene inicio y fin como atributos, perosnlamente le anadi
    //uno mas "tama" el cual es el tamano
    //tambien hay una funcion que nos devuelve el tamano(como un getter)
    NodoCarta inicio, fin;
    int tama;

    //este es el constructor del deck
    public ColaDeck() {
        inicio = fin = null;
        tama = 0;
    }

    //funcion que determina si esta vacia
    public boolean estaVacia() {
        return inicio == null;
    }

    //este metodo simplemnte saca los elementos de el deck arrgelado al ser introducidos al deck desordenado
    public void extraeColaDeck(NodoCarta carta) {

        if (inicio.id == carta.id && inicio.fam == carta.fam) {
            quitar();
        }

        NodoCarta aux = inicio;

        for (int b = 0; b < tamanoDeck() - 1; b++) {
            if (aux.siguiente.fam == carta.fam && aux.siguiente.id == carta.id) {
                aux.siguiente = aux.siguiente.siguiente;
                tama--;
                break;
            }
            aux = aux.siguiente;
        }
    }

    //este metodo lo que hace es desordenar el deck arreglado tomando como paramero al deck que le iremos introduciendo las cartas random
    public ColaDeck desordenarDeck(ColaDeck deckDesordenado) {
        //ColaDeck deckDesordenado = new ColaDeck();
        Random rand = new Random();
        int number = 0;
        for (int i = 0; i < 52; i++) {
            number = rand.nextInt(tamanoDeck());
            NodoCarta aux = inicio;
            for (int n = 0; n < number; n++) {
                aux = aux.siguiente;
            }
            deckDesordenado.insertar(aux.fam, aux.id);
            extraeColaDeck(aux);
        }

        return deckDesordenado;
    }

    //este metodo genera las cartas para nuestro deck, recuerden se componen de string familia, y int identidad(1,2,3,rey,reina y asi)
    public void generarDeck() {
        for (int i = 1; i < 14; i++) {
            insertar("Corazones", i);
        }
        for (int i = 1; i < 14; i++) {
            insertar("Espadas", i);
        }
        for (int i = 1; i < 14; i++) {
            insertar("Diamantes", i);
        }
        for (int i = 1; i < 14; i++) {
            insertar("Trebol", i);
        }
    }

    //este metodo simplemente inserta cartas a el deck deseado, se usa tanto para el deck original como para el desodenado
    public void insertar(String fam, int id) {
        NodoCarta nuevo = new NodoCarta(fam, id);
        if (estaVacia()) {
            inicio = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tama++;
    }

    //este metodo se usa para ir quitando elementos de la cola, en el codigo del profe se llama(atender) funciona exactaemnte igual, usenlo
    //cuando tengan que repartir las cartas
    public void quitar() {
        NodoCarta aux = inicio;
        inicio = inicio.siguiente;
        tama--;
    }

    //este metodo solo regresa el inicio de la cola
    public NodoCarta inicioCola() {
        return inicio;
    }

    //como leyeron antes estes metodo regresa el tamano, es util para llevar registro de cuantas cartas quedan
    public int tamanoDeck() {
        return tama;
    }

    //como el identificador es un int, siempre imprimira un numero, pero que pasa con los que son "reina" o "As" esta funcion corrige esos casos para que en la impresion
    //se impriman losm nombres correctos, en otras palabras en vez de un corazones 1 saldra corazones As
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

    //finalemnte este metodo imprime todos los elemntos del deck deseado, usenlo para saber cuales cartas quedan.
    public void imprimirDeck() {
        NodoCarta aux = inicio;
        while (aux != null) {
            System.out.print(aux.fam + " ");
            imprimirIdentificador(aux);
            System.out.print(" - ");
            aux = aux.siguiente;
        }
    }

}
