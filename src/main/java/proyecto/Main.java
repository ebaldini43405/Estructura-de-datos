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
        
        
//        PilaDeck deck1  = new PilaDeck();
//        PilaDeck deck2 = new PilaDeck();
//        PilaDeck deck3 = new PilaDeck();
//        PilaDeck deck4 = new PilaDeck();
//        PilaDeck deck5 = new PilaDeck();
//
//        for(int i=0;i<7;i++)
//        {
//            deck1.repartir(deckDesordenado);
//            deck2.repartir(deckDesordenado);
//            deck3.repartir(deckDesordenado);
//            deck4.repartir(deckDesordenado);
//            deck5.repartir(deckDesordenado);
//        }
        
//        Jugador jugador1 = new Jugador(deck1);
//        Jugador jugador2 = new Jugador(deck2);
//        Jugador jugador3 = new Jugador(deck3);
//        Jugador jugador4 = new Jugador(deck4);
//        Jugador jugador5 = new Jugador(deck5);

        int numeroJugadores = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de jugadores en la mesa"));
        Mesa mesa = new Mesa();
        for(int i = 0; i<numeroJugadores; i++){

            PilaDeck deck = new PilaDeck();

            for(int m=0;m<7;m++)
            {
                deck.repartir(deckDesordenado);

            }

            Jugador jugador1 = new Jugador(deck);

            mesa.agregarJugadorMesa(jugador1);
        }
        mesa.mostrarMesa();
//        System.out.println("DECK JUGADOR 1:\n");
//        deck1.imprimirDeck();
//        System.out.println("\nDECK JUGADOR 2:\n");
//        deck2.imprimirDeck();
//        System.out.println("\nDECK JUGADOR 3:\n");
//        deck3.imprimirDeck();
//        System.out.println("\nDECK JUGADOR 4:\n");
//        deck4.imprimirDeck();
//        System.out.println("\nDECK JUGADOR 5:");
//        deck5.imprimirDeck();
        
            
        }
        
        
    }
