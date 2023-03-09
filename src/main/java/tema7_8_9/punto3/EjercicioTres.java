package tema7_8_9.punto3;

import java.util.Vector;

public class EjercicioTres {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        for(int i = 1; i <= 6; i++)
            vector.add(i);
        System.out.println("Vector generado completo: " + vector);

        vector.subList(1, 3).clear();
        System.out.println("Vector nuevo sin posición 2 y 3: " + vector);
    }
}
