package tema7_8_9.punto5;

import java.util.ArrayList;
import java.util.LinkedList;

public class EjercicioCinco {

    public static void main(String[] args) {
        String mensajeDeSalida = "%nValor de LinkedList en la posición %s: %s %nValor de ArrayList en la posición %s: %s%n";

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Cristian");
        arrayList.add("Camilo");
        arrayList.add("González");
        arrayList.add("Ramos");

        LinkedList<String> linkedList = new LinkedList<>(arrayList);

        for (int i = 0; i < arrayList.size(); i++)
            System.out.printf(mensajeDeSalida, i, linkedList.get(i), i, arrayList.get(i));
    }
}
