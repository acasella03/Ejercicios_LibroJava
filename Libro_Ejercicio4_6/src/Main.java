import java.util.Scanner;

public class Main {
    private static final String CLAVE = "abracadabra";

    public static void main(String[] args) {
        String palabra;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("¡Hola!, por favor, escribe '" + CLAVE + "':");
            palabra = sc.nextLine();
        } while (!palabra.equals(CLAVE));
        System.out.println("TU: " + palabra);
        System.out.println("YO: pata de cabra!");
    }
}