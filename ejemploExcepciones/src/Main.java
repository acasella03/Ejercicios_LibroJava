public class Main {
    public static final String TECH_SIN_ARGUMENTOS = "Se esperaba al menos un argumento";
    public static final String TECH_MAL_FORMADO="El primer argumento debe ser un número entero";

    public static void main(String[] args) throws Exception {
        try {
            int resultado = trataNumero(args);
            System.out.println("El resultado es: " + resultado);
        } catch (BusinessException be) {
            System.out.println("===== ERROR FUNCIONAL =====");
            System.out.println("Se ha producido un error funcional: " + be);
            switch (be.getErrorCode()) {
                case EVEN:
                    System.out.println("Prefiero números impares.");
                    break;
                case NEGATIVE:
                    System.out.println("Quiero números positivos.");
                    break;
            }
        } catch (TechnicalException te) {
            System.err.println("===== ERROR TÉCNICO =====");
            System.err.println("Se ha producido un error técnico: " + te);
        } finally {
            System.out.println("¡Gracias por usar este programa!");
        }

    }

    private static int trataNumero(String[] args) throws BusinessException {
        if (args.length == 0) {
            throw new TechnicalException(TECH_SIN_ARGUMENTOS);
        }
        try {
            int numero = Integer.parseInt(args[0]);
            noQuieroPares(numero);
            noQuieroNegativos(numero);
            return numero * numero;
        }catch (NumberFormatException nfe){
            throw new TechnicalException(TECH_MAL_FORMADO, nfe);
        }

    }

    private static void noQuieroPares(int n) throws BusinessException {
        if (n % 2 == 0) {
            throw new BusinessException(BusinessException.ErrorCode.EVEN, "Valor " + n);
        }
    }

    private static void noQuieroNegativos(int n) throws BusinessException {
        if (n < 0) {
            throw new BusinessException(BusinessException.ErrorCode.NEGATIVE, "Valor " + n);
        }
    }
}