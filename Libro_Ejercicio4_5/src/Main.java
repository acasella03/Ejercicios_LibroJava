public class Main {
    private static final int CARACTER_MAX = 10;

    public static void main(String[] args) {
        int i = 0;
        boolean encontrada=false;
        while (i< args.length && !encontrada) {
            encontrada= args[i].length()>CARACTER_MAX;
            i++;
        }
        if(encontrada){
            System.out.println("La "+i+"ª palabra es demasiado larga.");
        }else {
            System.out.println("Todas las palabras son correctas.");
        }

    }
}