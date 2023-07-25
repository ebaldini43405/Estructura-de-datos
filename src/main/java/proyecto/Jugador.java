package proyecto;

public class Jugador {
    
    public PilaDeck deck;
    public int id;

    public Jugador(int id,PilaDeck d)
    {
        deck = d;
        id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
