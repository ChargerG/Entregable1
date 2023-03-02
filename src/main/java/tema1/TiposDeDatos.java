package tema1;

public class TiposDeDatos {

    public static void main(String[] args){
        // Entero
        byte tipoEnteroByte = 10;
        short tipoEnteroShort = 20;
        int tipoEnteroInt = 50;
        long tipoEnteroLong = 1000L;

        // Punto flotante
        float tipoDecimalFloat = 20.22f;
        double tipoDecimalDouble = 1000.000d;

        // Caracter
        char tipoCaracterChar = 'T';

        //Valores de verdad
        boolean tipoValorDeVerdadBooleanTrue = true;
        boolean tipoValorDeVerdadBooleanFalse = false;

        // Cadena de caracteres
        String tipoTextoString = "Hola mundo";

        //Tipos envoltorio o wraper
        Integer tipoEnteroIntegerNoPrimitivo = null;

        Long tipoEnteroLongNoPrimitivo = 900L;

        System.out.println("Entero tipo byte: " + tipoEnteroByte + "\n"
                + "Entero tipo short: " + tipoEnteroShort + "\n"
                + "Entero tipo int: " + tipoEnteroInt + "\n"
                + "Entero tipo long: " + tipoEnteroLong + "\n"
                + "Decimal tipo float: " + tipoDecimalFloat + "\n"
                + "Decimal tipo double: " + tipoDecimalDouble+ "\n"
                + "Caracter tipo char: " + tipoCaracterChar + "\n"
                + "Valor de verdad tipo booleano, true: " + tipoValorDeVerdadBooleanTrue + "\n"
                + "Valor de verdad tipo booleano, false: " + tipoValorDeVerdadBooleanFalse + "\n"
                + "Texto tipo String nulo: " + tipoTextoString + "\n"
                + "Entero tipo Integer no primitivo: " + tipoEnteroIntegerNoPrimitivo + "\n"
                + "Entero tipo Long no primitivo: " + tipoEnteroLongNoPrimitivo + "\n"
        );
    }
}
