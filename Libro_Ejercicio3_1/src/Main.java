public class Main {
    public static void main(String[] args) {

        String arg1 = args[0];
        String arg2 = args[1];
        String arg3 = args[2];

        int numeroArgumentos = args.length;
        if (numeroArgumentos == 0) {
            System.err.println("No se han recibido argumentos");
        } else {
            System.out.println("Se han recibido " + numeroArgumentos + " numeroArgumentos");
        }

    }
}