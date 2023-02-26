public class Main {

    private static final String CANTA = "CANTA";
    private static final String LADRA = "LADRA";

    public static void main(String[] args) {

        boolean hayArgumentos = args.length > 0;
        if (!hayArgumentos) {
            System.err.println("No tengo argumentos");
        }
        int numArgumentos = args.length;
        String primerArgumento = args[0];
        if (primerArgumento.equals(CANTA)) {
            System.out.println("Un, dos, tres, un pasito palante, María");
        } else if (LADRA.equals(primerArgumento)) {
            boolean faltaNombre = numArgumentos <= 1;
            if (!faltaNombre) {
                String nombrePerro = args[1];
                System.out.println("Bub bub bub");
                System.out.println("Hola " + nombrePerro);
            } else {
                System.out.println("Grr grr grr");
                System.out.println("No sé como te llamas");
            }
        } else {
            System.out.println("No sé qué quieres que haga");
        }
    }
}