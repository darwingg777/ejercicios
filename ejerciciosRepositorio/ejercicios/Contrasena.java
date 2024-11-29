import java.util.Scanner;
public class Contrasena {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("diguite su contraseña: ");
    String contrasena;
    do{
        System.out.println("la contraseña es invalida ");
        contrasena= sc.nextLine();
    } while(!contrasena.equals("1234"));
    System.out.println("hola de nuevo, bienvenido");
}   
}
    
   


