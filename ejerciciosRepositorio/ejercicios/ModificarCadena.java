public class ModificarCadena {

    // Método que intenta modificar la cadena de texto
    public static void modificarCadena(String texto) {
        // Intentar modificar la cadena (esto no cambiará el valor original)
        texto = "Texto modificado"; // Esto crea una nueva cadena, no modifica la original
        System.out.println("Dentro del método, texto modificado: " + texto);
    }

    // Método main para ejecutar el programa
    public static void main(String[] args) {
        // Inicializar una cadena de texto
        String miCadena = "Texto original";

        // Imprimir el valor de la cadena antes de llamar al método
        System.out.println("Antes de modificar: " + miCadena);

        // Llamar al método modificarCadena
        modificarCadena(miCadena);

        // Imprimir el valor de la cadena después de llamar al método
        System.out.println("Después de modificar: " + miCadena);
    }
}
