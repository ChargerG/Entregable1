package tema7_8_9.punto6;

import java.util.ArrayList;

public class EjercicioSeis {

    public static void main(String[] args) {
        ArrayList<Integer> arrayListSinNumerosPares = new ArrayList<>();

        for(int i = 1; i <= 10; i++)
            arrayListSinNumerosPares.add((i%2 == 1) ? i++:i);
        System.out.println("ArrayList sin números pares: " + arrayListSinNumerosPares);

    }
}
