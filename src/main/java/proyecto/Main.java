package proyecto;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //se crean dos decks uno original y otro desordenado
        ColaDeck deckOriginal = new ColaDeck();
        ColaDeck deckDesordenado = new ColaDeck();
        //se genera el deckOriginal original
        deckOriginal.generarDeck();
        
        System.out.println("DECK ARRGLADO(ORIGINAL)");
        deckOriginal.imprimirDeck();
        System.out.println("\nTAMANO DE DECK ARREGLADO = " + deckOriginal.tamanoDeck());

        // se genera el deckOriginal desordenado, usen este deckOriginal para repartir las cartas
        deckDesordenado = deckOriginal.desordenarDeck(deckDesordenado);
        System.out.println("\nDECK DESORDENADO");
        deckDesordenado.imprimirDeck();
        System.out.println("\nTAMANO DE DECK DESARREGLADO = " + deckDesordenado.tamanoDeck());
        PilaDeck pila = new PilaDeck();
        System.out.println("\nTAMANO DE DECK DESARREGLADO = " + pila.tamanoPila());
        
        



        Mesa mesa = new Mesa();
        Mesa mesa1 = new Mesa();
        for(int i = 0; i<3; i++){

            PilaDeck deck = new PilaDeck();

            for(int m=0;m<7;m++)
            {
                deck.repartir(deckDesordenado);
            }

            Jugador jugador1 = new Jugador(deck);

            mesa.agregarJugadorMesa(jugador1);
        }
        for(int i = 0; i<4; i++){

            PilaDeck deck = new PilaDeck();

            for(int m=0;m<7;m++)
            {
                deck.repartir(deckDesordenado);
            }

            Jugador jugador1 = new Jugador(deck);

            mesa1.agregarJugadorMesa(jugador1);
        }
        ListasCD listaMesas = new ListasCD();
        listaMesas.insertar(mesa);
        listaMesas.insertar(mesa1);
        listaMesas.imprimirListaDC();
        }
        
        
    }
