public class Main {
    public static void main(String[] args) {
        String apellido1= args[0];
        String apellido2= args[1];
        String hijo1=args[2];
        String hijo2=args[3];
        String hijo3=args[4];
        String padre=args[5];
        String madre=args[6];

        pintaPersona(padre,apellido1,"");
        pintaPersona(madre,apellido1,"");
        pintaPersona(hijo1,apellido1,apellido2);
        pintaPersona(hijo2,apellido1,apellido2);
        pintaPersona(hijo3,apellido1,apellido2);

    }
    private static void pintaPersona(String nombre, String apellido1, String apellido2){
        System.out.println("Nombre: "+nombre+" , Apellidos: "+apellido1+" "+apellido2);
    }
}