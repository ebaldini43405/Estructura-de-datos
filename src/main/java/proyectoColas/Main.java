package proyectoColas;

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
        Jugador jugador = new Jugador();
        jugador.AgregarJugadores();
        jugador.AgregarJugadores();
        System.out.println(jugador.imprimirPila());
        
    }
}