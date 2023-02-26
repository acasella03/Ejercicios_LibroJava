public class Main {
    public static void main(String[] args) {


        int numeroArgumentos = args.length;
        if (numeroArgumentos == 0) {
            System.err.println("No se han recibido argumentos");
        } else if (numeroArgumentos > 4) {
            System.out.println("Se han recibido demasiados argumentos");
        } else {
            System.out.println("Se han recibido " + numeroArgumentos + " numeroArgumentos");
        }

    }
}