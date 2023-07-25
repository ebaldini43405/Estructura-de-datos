package proyecto;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean juego = true;
        int opcion;
        ListasCD listaMesas = new ListasCD();
        ListaGanador listaG = new ListaGanador();
        ListaPerdedor listaP = new ListaPerdedor();
        while(juego){
             opcion = Integer.parseInt(JOptionPane.showInputDialog("1 Para crear nueva mesa\n2 Para mostar todas las mesas"
                                                                    +"\n3 Para mostrar jugadores ganadores\n4 Para mostrar jugadores perdedores"
                                                                    + "\n6 Para salir"));
                                                                            
                                                                            

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
                while(numJugadores>7 || numJugadores < 3){
                    numJugadores = Integer.parseInt(JOptionPane.showInputDialog("Numero de jugadores incorrecto, digite un numero del 3 al 7"));
                }
                PilaDeck deck1 = new PilaDeck();PilaDeck deck2 = new PilaDeck();PilaDeck deck3 = new PilaDeck();
                PilaDeck deck4 = new PilaDeck();PilaDeck deck5 = new PilaDeck();PilaDeck deck6 = new PilaDeck();
                PilaDeck deck7 = new PilaDeck();



                    for(int m=0;m<7;m++)
                    {
                        deck1.repartir(deckDesordenado);deck2.repartir(deckDesordenado);deck3.repartir(deckDesordenado);
                        if(numJugadores >= 4){
                            deck4.repartir(deckDesordenado);}
                        
                        if (numJugadores >= 5) {
                            deck5.repartir(deckDesordenado);
                        }
                        if (numJugadores >= 6) {
                            deck6.repartir(deckDesordenado);}
                        if (numJugadores == 7) {
                            deck7.repartir(deckDesordenado);
                        }
                    }

                    //darle a cada jugador su deck y meterlos a la mesa
                    Jugador jugador1 = new Jugador(1,deck1);mesa.agregarJugadorMesa(jugador1);
                    Jugador jugador2 = new Jugador(2,deck2);mesa.agregarJugadorMesa(jugador2);
                    Jugador jugador3 = new Jugador(3,deck3);mesa.agregarJugadorMesa(jugador3);
                    if(numJugadores >= 4){
                        Jugador jugador4 = new Jugador(4,deck4);
                        mesa.agregarJugadorMesa(jugador4);
                    }
                    if (numJugadores >= 5) {
                        Jugador jugador5 = new Jugador(5,deck5);
                        mesa.agregarJugadorMesa(jugador5);
                    }
                    if (numJugadores >= 6) {
                        Jugador jugador6 = new Jugador(6,deck6);
                        mesa.agregarJugadorMesa(jugador6);
                    }
                    if (numJugadores == 7) {
                        Jugador jugador7 = new Jugador(7,deck7);
                        mesa.agregarJugadorMesa(jugador7);
                    }

                listaMesas.insertar(mesa);
                JOptionPane.showMessageDialog(null, "Mesa creada correctamente");
                int jugadorGanador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de jugador que ganó en esta mesa"));
                if (jugadorGanador == 1)
                {
                    listaG.insertar(jugador1);
                    listaP.insertar(jugador2);
                    listaP.insertar(jugador3);
                    if(numJugadores >= 4){
                        Jugador jugador4 = new Jugador(4,deck4);
                        listaP.insertar(jugador4);
                    }
                    if (numJugadores >= 5) {
                        Jugador jugador5 = new Jugador(5,deck5);
                        listaP.insertar(jugador5);
                    }
                    if (numJugadores >= 6) {
                        Jugador jugador6 = new Jugador(6,deck6);
                        listaP.insertar(jugador6);
                    }
                    if (numJugadores == 7) {
                         Jugador jugador7 = new Jugador(7,deck7);
                         listaP.insertar(jugador7);
                    }
                }
                if (jugadorGanador == 2)
                {
                    listaG.insertar(jugador2);
                    listaP.insertar(jugador1);
                    listaP.insertar(jugador3);
                    if(numJugadores >= 4){
                        Jugador jugador4 = new Jugador(4,deck4);
                        listaP.insertar(jugador4);
                    }
                    if (numJugadores >= 5) {
                        Jugador jugador5 = new Jugador(5,deck5);
                        listaP.insertar(jugador5);
                    }
                    if (numJugadores >= 6) {
                        Jugador jugador6 = new Jugador(6,deck6);
                        listaP.insertar(jugador6);
                    }
                    if (numJugadores == 7) {
                         Jugador jugador7 = new Jugador(7,deck7);
                         listaP.insertar(jugador7);
                    }
                }
                if (jugadorGanador == 3)
                {
                    
                    listaP.insertar(jugador3);
                    listaP.insertar(jugador2);
                    listaP.insertar(jugador1);
                    if(numJugadores >= 4){
                        Jugador jugador4 = new Jugador(4,deck4);
                        listaP.insertar(jugador4);
                    }
                    if (numJugadores >= 5) {
                        Jugador jugador5 = new Jugador(5,deck5);
                        listaG.insertar(jugador5);
                    }
                    if (numJugadores >= 6) {
                        Jugador jugador6 = new Jugador(6,deck6);
                        listaP.insertar(jugador6);
                    }
                    if (numJugadores == 7) {
                         Jugador jugador7 = new Jugador(7,deck7);
                         listaP.insertar(jugador7);
                    }
                }
                if (jugadorGanador == 4)
                {
                    listaP.insertar(jugador1);
                    listaP.insertar(jugador2);
                    listaP.insertar(jugador3);
                    if(numJugadores >= 4){
                        Jugador jugador4 = new Jugador(4,deck4);
                        listaG.insertar(jugador4);
                    }
                    if (numJugadores >= 5) {
                        Jugador jugador5 = new Jugador(5,deck5);
                        listaP.insertar(jugador5);
                    }
                    if (numJugadores >= 6) {
                        Jugador jugador6 = new Jugador(6,deck6);
                        listaP.insertar(jugador6);
                    }
                    if (numJugadores == 7) {
                         Jugador jugador7 = new Jugador(7,deck7);
                         listaP.insertar(jugador7);
                    }
                }
                if (jugadorGanador == 5)
                {
                    listaP.insertar(jugador1);
                    listaP.insertar(jugador2);
                    listaP.insertar(jugador3);
                    if(numJugadores >= 4){
                        Jugador jugador4 = new Jugador(4,deck4);
                        listaP.insertar(jugador4);
                    }
                    if (numJugadores >= 5) {
                        Jugador jugador5 = new Jugador(5,deck5);
                        listaG.insertar(jugador5);
                    }
                    if (numJugadores >= 6) {
                        Jugador jugador6 = new Jugador(6,deck6);
                        listaP.insertar(jugador6);
                    }
                    if (numJugadores == 7) {
                         Jugador jugador7 = new Jugador(7,deck7);
                         listaP.insertar(jugador7);
                    }
                }
                if (jugadorGanador == 6)
                {
                    listaP.insertar(jugador1);
                    listaP.insertar(jugador2);
                    listaP.insertar(jugador3);
                    if(numJugadores >= 4){
                        Jugador jugador4 = new Jugador(4,deck4);
                        listaP.insertar(jugador4);
                    }
                    if (numJugadores >= 5) {
                        Jugador jugador5 = new Jugador(5,deck5);
                        listaP.insertar(jugador5);
                    }
                    if (numJugadores >= 6) {
                        Jugador jugador6 = new Jugador(6,deck6);
                        listaG.insertar(jugador6);
                    }
                    if (numJugadores == 7) {
                         Jugador jugador7 = new Jugador(7,deck7);
                         listaP.insertar(jugador7);
                    }
                }
                if (jugadorGanador == 7)
                {
                    listaP.insertar(jugador1);
                    listaP.insertar(jugador2);
                    listaP.insertar(jugador3);
                    if(numJugadores >= 4){
                        Jugador jugador4 = new Jugador(4,deck4);
                        listaP.insertar(jugador4);
                    }
                    if (numJugadores >= 5) {
                        Jugador jugador5 = new Jugador(5,deck5);
                        listaP.insertar(jugador5);
                    }
                    if (numJugadores >= 6) {
                        Jugador jugador6 = new Jugador(6,deck6);
                        listaP.insertar(jugador6);
                    }
                    if (numJugadores == 7) {
                         Jugador jugador7 = new Jugador(7,deck7);
                         listaG.insertar(jugador7);
                    }
                }
            } else if (opcion == 2) {
                listaMesas.imprimirListaDC();


             
            } else if (opcion == 3) {
                listaG.mostrarJugadoresGanadores();
                


            }else if (opcion == 4) {
                listaP.mostrarJugadoresPerdedores();
            
            }else if (opcion == 6) {
                juego = false;
                JOptionPane.showMessageDialog(null,"Fin del juego de cartas, gracias por jugar");
            }
        }
    }
}
