public class ModificarArray {

    // Método para modificar los valores del array
    public static void modificarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2; // Duplicar cada valor del array
        }
    }

    // Método main para ejecutar el programa
    public static void main(String[] args) {
        // Crear un array de enteros
        int[] numeros = {1, 2, 3, 4, 5};

        // Mostrar el contenido del array antes de la modificación
        System.out.println("Antes de modificar:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Modificar el array
        modificarArray(numeros);

        // Mostrar el contenido del array después de la modificación
        System.out.println("Después de modificar:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}