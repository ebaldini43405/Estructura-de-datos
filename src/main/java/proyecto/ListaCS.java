package proyecto;

public class ListaCS {
    NodoCS ultimo;
    public ListaCS(){
        ultimo = null;
    }
    public boolean estaVacia(){
        return ultimo == null;
    }
    public void insertar(ColaDeck cartasSinUso){
       NodoCS nuevo =new NodoCS(cartasSinUso);
       if(ultimo !=null){
           nuevo.siguiente = ultimo.siguiente;
           ultimo.siguiente = nuevo;
       }
       ultimo = nuevo;
    }
    public void mostarCartasSinUsar(){
        NodoCS auxiliar = ultimo.siguiente;
        int mesa = 1;
        do {
            System.out.println("\n\nMESA #"+mesa);
            auxiliar.cartasSinUso.imprimirDeck();
            auxiliar = auxiliar.siguiente;
            mesa++;
        }while(auxiliar!=ultimo.siguiente);
    }
}
