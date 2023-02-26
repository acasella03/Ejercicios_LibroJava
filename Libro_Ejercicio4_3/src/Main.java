public class Main {
    private static final int LIM = 5;
    private static final int REP_CORTA = 4;
    private static final int REP_LARGA = 2;

    public static void main(String[] args) {

        for (String s : args) {
            if (s.length() <= LIM) {
                for (int i = 0; i < REP_CORTA; i++) {
                    System.out.print(s + " ");
                }
                System.out.println();
            } else {
                for (int i = 0; i < REP_LARGA; i++) {
                    System.out.print(s+" ");
                }
                System.out.println();
            }

        }
    }
}