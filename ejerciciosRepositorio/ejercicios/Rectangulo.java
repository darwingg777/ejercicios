public class Rectangulo {
    // Atributos de la clase Rectangulo
    double ancho;
    double alto;

    // Constructor para inicializar el rectángulo
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Método para mostrar los atributos del rectángulo
    public void mostrarDimensiones() {
        System.out.println("Ancho: " + ancho + ", Alto: " + alto);
    }
    
    // Método para modificar los atributos del rectángulo
    public void modificarRectangulo(Rectangulo r) {
        r.ancho = r.ancho * 2; // Duplicar el ancho
        r.alto = r.alto * 2;   // Duplicar el alto
    }

    // Método main para ejecutar el programa
    public static void main(String[] args) {
        // Crear un objeto Rectangulo
        Rectangulo rectangulo = new Rectangulo(5, 10);

        // Mostrar dimensiones antes de la modificación
        System.out.println("Antes de modificar:");
        rectangulo.mostrarDimensiones();

        // Modificar el rectángulo
        rectangulo.modificarRectangulo(rectangulo);

        // Mostrar dimensiones después de la modificación
        System.out.println("Después de modificar:");
        rectangulo.mostrarDimensiones();
    }
}