public class nodo {


    private int valor;
    private nodo siguiente;

    // Constructor para inicializar el valor del nodo
    public nodo(int valor) {
        this.valor = valor;
        this.siguiente = null; // Inicialmente el nodo siguiente es nulo
    }

    // Getters y setters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
}
