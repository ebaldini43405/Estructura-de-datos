package proyecto;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean juego = true;
        int opcion;
        ListasCD listaMesas = new ListasCD();

        while(juego){
             opcion = Integer.parseInt(JOptionPane.showInputDialog("1 Para crear nueva mesa\n2 Para mostar todas las mesas\n3 Para elegir ganador\n6 Para salir"));

            //crear nueva mesa
            if (opcion == 1){
                Mesa mesa = new Mesa();
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


                int numJugadores = Integer.parseInt(JOptionPane.showInputDialog("Cuantos jugadores?"));
                for(int i = 0; i<numJugadores; i++){

                    PilaDeck deck = new PilaDeck();

                    for(int m=0;m<7;m++)
                    {
                        deck.repartir(deckDesordenado);
                    }

                    Jugador jugador1 = new Jugador(deck);

                    mesa.agregarJugadorMesa(jugador1);
                }
                listaMesas.insertar(mesa);
                JOptionPane.showMessageDialog(null, "Mesa creada correctamente");
            } else if (opcion == 2) {
                listaMesas.imprimirListaDC();
            } else if (opcion == 6) {
                juego = false;
                JOptionPane.showMessageDialog(null,"Fin del juego de cartas, gracias por jugar");
            }
        }

//        //se crean dos decks uno original y otro desordenado
//        ColaDeck deckOriginal = new ColaDeck();
//        ColaDeck deckDesordenado = new ColaDeck();
//        //se genera el deckOriginal original
//        deckOriginal.generarDeck();
//
//        System.out.println("DECK ARRGLADO(ORIGINAL)");
//        deckOriginal.imprimirDeck();
//        System.out.println("\nTAMANO DE DECK ARREGLADO = " + deckOriginal.tamanoDeck());
//
//        // se genera el deckOriginal desordenado, usen este deckOriginal para repartir las cartas
//        deckDesordenado = deckOriginal.desordenarDeck(deckDesordenado);
//        System.out.println("\nDECK DESORDENADO");
//        deckDesordenado.imprimirDeck();
//        System.out.println("\nTAMANO DE DECK DESARREGLADO = " + deckDesordenado.tamanoDeck());
//        PilaDeck pila = new PilaDeck();

        
        








        }
        
        
    }
