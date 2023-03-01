public class Main {
    private static final int MAX=10;
    public static void main(String[] args) {

        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }
    }
}