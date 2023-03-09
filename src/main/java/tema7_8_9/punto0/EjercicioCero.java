package tema7_8_9.punto0;

public class EjercicioCero {
    static int contador = 0;
    static String palabraInvertida = "";

    private static String inversorDePalabras(String palabra){
        if(contador < palabra.length()){
            palabraInvertida += palabra.charAt((palabra.length()-1) - contador);
            contador++;
            inversorDePalabras(palabra);
        }
        return palabraInvertida;
    }

    public static void main(String[] args) {
        System.out.println(inversorDePalabras("Hola mundo"));
    }
}
