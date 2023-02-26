public class Main {

    private static final int MAX_CARACTERES = 5;

    public static void main(String[] args) {

        for (String s : args) {
            if (s.length() < MAX_CARACTERES) {
                System.out.println(s.toUpperCase());
            } else {
                System.out.println(s.toLowerCase());
            }

        }

    }
}