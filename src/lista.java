public class lista {
    private nodo cabeza;

    public lista() {
        this.cabeza = null;
    }

    public void agregarAlPrincipio(int valor) {
        nodo nuevoNodo = new nodo(valor);
        nuevoNodo.setSiguiente(cabeza);
        cabeza = nuevoNodo;
    }

    public void imprimirLista() {
        nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getValor() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }

    // Ejercicio: Método para eliminar un nodo dado su valor
    public void eliminarNodo(int valor) {
        nodo actual = cabeza;
        nodo anterior = null;

        // Buscar el nodo a eliminar y mantener un puntero al nodo anterior
        while (actual != null && actual.getValor() != valor) {
            anterior = actual;
            actual = actual.getSiguiente();
        }

        // Si el nodo a eliminar no se encuentra
        if (actual == null) {
            System.out.println("El nodo con el valor " + valor + " no está en la lista.");
            return;
        }

        // Si el nodo a eliminar es el primero
        if (anterior == null) {
            cabeza = actual.getSiguiente();
        } else {
            anterior.setSiguiente(actual.getSiguiente());
        }
    }

    // Ejercicio: Método para buscar si un valor está en la lista
    public boolean buscar(int valor) {
        nodo actual = cabeza;
        while (actual != null) {
            if (actual.getValor() == valor) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    // Otros ejercicios posibles: insertar en una posición específica, invertir la lista, etc.
}
