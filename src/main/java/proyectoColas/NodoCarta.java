package proyectoColas;

public class NodoCarta {
    String fam;
    int id;
    int elemento;
    NodoCarta siguiente;

    //las cartas se componen de dos atributos la familia y el numero
    //este es el constructor de las cartas
    public NodoCarta(String familia, int identificador) {
        fam = familia;
        id = identificador;
    }

    public NodoCarta(int elemento) {
        this.elemento = elemento;
    }
   
}
