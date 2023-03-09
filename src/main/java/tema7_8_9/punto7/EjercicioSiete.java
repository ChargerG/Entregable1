package tema7_8_9.punto7;

import tema7_8_9.punto7.excepciones.ExcepcionGenerada;

public class EjercicioSiete {

    private static void dividePorCero(float numerador, float denominador){
        try {
            if (Float.isInfinite(numerador/denominador))
                throw new ExcepcionGenerada();
            System.out.println("Demo de código");
        }catch (ExcepcionGenerada ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) throws ExcepcionGenerada {
        dividePorCero(3,0);
        dividePorCero(25,5);
    }
}
