public class Main {
    public static void main(String[] args) {

        int ladoX = Integer.valueOf(args[0]);
        int ladoY = Integer.valueOf(args[1]);
        int area = areaRectangulo(ladoX,ladoY);

        System.out.println("El rectángulo de " + ladoX + " por " + ladoY + " tiene un área de " + area);


        }
    private static int areaRectangulo (int base, int altura){
        return base * altura;
    }
}