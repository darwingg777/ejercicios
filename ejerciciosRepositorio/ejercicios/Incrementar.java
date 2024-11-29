public class Incrementar {

    // Método que incrementa el valor de x en 1 y lo retorna
    public static int incrementar(int x) {
        x += 1; // Aumentar x en 1
        return x; // Retornar el nuevo valor
    }

    // Método main para ejecutar el programa
    public static void main(String[] args) {
        // Inicializar una variable entera
        int x = 5;

        // Imprimir el valor de x antes de llamar al método
        System.out.println("Antes de incrementar: " + x);

        // Llamar al método incrementar y almacenar el valor retornado
        int nuevoValor = incrementar(x);

        // Imprimir el valor de x después de llamar al método
        System.out.println("Después de incrementar (sin usar el valor retornado): " + x);
        System.out.println("Nuevo valor retornado: " + nuevoValor);
    }
}