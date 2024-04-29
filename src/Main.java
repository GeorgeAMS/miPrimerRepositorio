//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al menu");

        lista lista = new lista();
        lista.agregarAlPrincipio(3);
        lista.agregarAlPrincipio(7);
        lista.agregarAlPrincipio(9);

        System.out.println("Lista inicial:");
        lista.imprimirLista();

        // Ejemplo de eliminar un nodo
        lista.eliminarNodo(7);
        System.out.println("Lista después de eliminar el nodo con valor 7:");
        lista.imprimirLista();

        // Ejemplo de búsqueda de un nodo
        int valorABuscar = 3;
        if (lista.buscar(valorABuscar)) {
            System.out.println("El valor " + valorABuscar + " está en la lista.");
        } else {
            System.out.println("El valor " + valorABuscar + " no está en la lista.");
        }
    }
}