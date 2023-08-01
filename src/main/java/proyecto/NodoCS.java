package proyecto;

public class NodoCS {
    ColaDeck cartasSinUso;
     NodoCS siguiente;
     public NodoCS(ColaDeck c){
         cartasSinUso = c;
         siguiente = this;
     }
}
