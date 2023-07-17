package proyecto;

public class ListasCD {
    NodoCD primero;
    NodoCD ultimo;

    public ListasCD(){
        primero = null;
        ultimo = null;
    }

    public void insertar (Mesa m){
        NodoCD nuevo = new NodoCD();
        nuevo.mesa = m;
        if(primero == null){
            primero = nuevo;
            primero.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
            primero.anterior = ultimo;
        }
    }
    public void imprimirListaDC(){
        NodoCD aux = primero;
        int numeroMesa = 1;
        do{
            System.out.println("\n-----------------------------------------------\nMESA NUMERO="+numeroMesa);
            aux.mesa.mostrarMesa();
            aux = aux.siguiente;
            numeroMesa++;
        }while(aux != primero);
    }
    
     public void imprimirMesaElegida(int numMesa){
        NodoCD aux = primero;
        int numeroMesa = 1;
        do{
            if(numMesa==numeroMesa)
            {
            System.out.println("\n-----------------------------------------------\nMESA ELEGIDA="+numMesa);
            aux.mesa.mostrarMesa();
            }
        aux = aux.siguiente;
        numeroMesa++;
        }while(aux != primero);
    }
}
