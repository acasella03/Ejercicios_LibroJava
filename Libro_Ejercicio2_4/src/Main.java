public class Main {
    public static void main(String[] args) {
        String apellido1= args[0];
        String apellido2= args[1];
        String hijo1=args[2];
        String hijo2=args[3];
        String hijo3=args[4];
        String padre=args[5];
        String madre=args[6];

        String apellidosHijos=apellido1+" "+apellido2;

        System.out.println("Padre: "+padre+" "+apellido1);
        System.out.println("Madre: "+madre+" "+apellido2);
        System.out.println("Hijos:");
        System.out.println(hijo1+" "+apellidosHijos);
        System.out.println(hijo2+" "+apellidosHijos);
        System.out.println(hijo3+" "+apellidosHijos);
    }
}