import java.util.Scanner;

public class BuscarEnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el array de ejemplo
        int[] array = {10, 20, 30, 40, 50};

        // Solicitar al usuario el valor a buscar
        System.out.print("Ingrese el valor que desea buscar: ");
        int valor = scanner.nextInt();

        // Llamar a la función de búsqueda
        int posicion = buscarValor(array, valor);

        // Mostrar el resultado
        if (posicion != -1) {
            System.out.println("El valor " + valor + " se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El valor " + valor + " no está presente en el array.");
        }
    }

    // Método para buscar el valor en el array
    public static int buscarValor(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i; // Devuelve la posición del valor
            }
        }
        return -1; // Devuelve -1 si el valor no se encuentra
    }
}
