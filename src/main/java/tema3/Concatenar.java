package tema3;

public class Concatenar {

    private static void concatenarTextos(String[] arrayTextos){
        StringBuilder textoConcatenado = new StringBuilder();
        for (String texto: arrayTextos) {
            textoConcatenado.append(texto).append(" ");
        }
        System.out.println(textoConcatenado);
    }

    private static void concatenarTextos(String texto1, String texto2){
        System.out.println(texto1 + " " + texto2);
    }

    public static void main(String[] args) {
        String[] textos = {"Soy un programador", "que estudia Java y Go,", "también tengo conocimientos en testing"};

        concatenarTextos(textos); //Solo recibe arrays
        concatenarTextos(textos[0], textos[1]); //Solo recibe Strings
    }
}
