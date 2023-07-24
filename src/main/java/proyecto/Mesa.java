package proyecto;

public class Mesa {
    NodoMesa inicio,fin;


    public Mesa(){
        inicio = null;
        fin = null;
    }
    public boolean mesaVacia(){
        if(inicio == null){
            return true;
        }else{
            return false;
        }
    }
    public void agregarJugadorMesa(Jugador jugador){
        if(!mesaVacia()){
            fin.siguiente = new NodoMesa(jugador);
            fin = fin.siguiente;
        }else{
            inicio = fin = new NodoMesa(jugador);
        }

    }

    public void mostrarMesa(){
        NodoMesa recorrer = inicio;
        int numeroJugador = 1;
        while (recorrer != null){

            System.out.println("\nJugador #"+numeroJugador+" ");

            recorrer.jugador.deck.imprimirDeck();
            recorrer = recorrer.siguiente;
            numeroJugador++;
        }
        System.out.println();
    }
    
}
