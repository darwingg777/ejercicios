public class intercambio {
    
    public static void main(String[] args) {
        // Inicializamos las variables a y b
        int a = 5;
        int b = 10;

        // Imprimimos los valores antes de llamar al método
        System.out.println("Antes de intercambiar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Llamamos al método intercambiar
        intercambiar(a, b);

        // Imprimimos los valores después de intentar el intercambio
        System.out.println("Después de intentar intercambiar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    // Método que intenta intercambiar los valores de a y b
    public static void intercambiar(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        // Los cambios en x e y no afectan a a y b en main
    }
}