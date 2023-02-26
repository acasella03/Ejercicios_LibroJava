public class Main {

    private static final int MES_MINIMO = 1;
    private static final int MES_MAXIMO = 12;

    public static void main(String[] args) {
        if (args.length == MES_MINIMO) {
            int mes = Integer.valueOf(args[0]);
            if (mes < MES_MINIMO || mes > MES_MAXIMO) {
                System.err.println(mes + " no es un mes válido");
            } else {
                int dias = calculaDias(mes);
                System.out.println("El mes " + mes + " tiene " + dias + " días");
            }
        }

    }

    private static int calculaDias(int mes) {
        int dias;
        switch (mes) {
            case 2:
                System.out.println("Febrero");
                dias = 28;
                break;
            case 4:
                System.out.println("Abril");
            case 6:
                System.out.println("Junio");
            case 9:
                System.out.println("Septiembre");
            case 11:
                System.out.println("Noviembre");
            default:
                System.out.println("Mes de los largos");
                dias = 31;
                break;
        }
        return dias;
    }
}