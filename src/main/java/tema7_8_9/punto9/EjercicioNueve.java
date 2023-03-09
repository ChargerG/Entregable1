package tema7_8_9.punto9;

import tema7_8_9.punto9.excepciones.ExcepcionNumeros;

import java.io.*;
import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class EjercicioNueve {
    static Map<Integer, byte[]> pasos = new HashMap<>();
    static InputStream pieOPata;
    static PrintStream todosLosPasos;
    static byte[] pieOPataLeido;

    private static Map<Integer, byte[]> mapeandoLosTiposDePiesOPatas(String rutaDePieHumano, Integer claveDelPie){
        try {
            pieOPata = new FileInputStream(rutaDePieHumano);
            pieOPataLeido = pieOPata.readAllBytes();
            pasos.put(claveDelPie, pieOPataLeido);
        }catch (FileNotFoundException ex){
            System.out.printf("No se pudo encontrar el archivo %s", ex);
        }catch (IOException ex){
            System.out.printf("El archivo no se pudo leer %s", ex);
        }
        return pasos;
    }

    private static String creandoElPieOPata(String rutaDePieHumano, int idDelPie){
        StringBuilder pie = new StringBuilder();
        for (byte bytes : mapeandoLosTiposDePiesOPatas(rutaDePieHumano, idDelPie).get(idDelPie))
            pie.append((char) bytes);
        return pie.toString();
    }

    private static void caminar(int cantidadDePasosPorPieOPata, List<String> rutas, String nombreDelRecorrido) {
        try {
            todosLosPasos = new PrintStream(String.format("src/main/java/tema7_8_9/punto9/caminosRecorridos/%s.txt", nombreDelRecorrido));
            String huellaDerecha = creandoElPieOPata(rutas.get(0), 1);
            String huellaIzquierda = creandoElPieOPata(rutas.get(1), 2);

            if (cantidadDePasosPorPieOPata <= 0)
                throw new ExcepcionNumeros();

            for (int i = 1; i <= cantidadDePasosPorPieOPata; i++) {
                todosLosPasos.write(huellaDerecha.getBytes());
                System.out.print(huellaDerecha);
                Thread.sleep(700);
                todosLosPasos.write(huellaIzquierda.getBytes());
                System.out.print(huellaIzquierda);
                Thread.sleep(700);
            }
        }catch (InterruptedException ex){
            System.out.printf("Sucedio un problema con las interrupciones del sistema %s", ex);
        } catch (IOException ex) {
            System.out.printf("El archivo no se pudo leer %s ", ex);
        } catch (ExcepcionNumeros ex){
            System.out.printf("Sucedio un error \n %s", ex.getMessage());
        }
    }

    private static String[] valoresDeEntradaPorTeclado() {
        Scanner sc = new Scanner(in);
        String[] valores = new String[2];

        System.out.println("Ingrese la cantidad de pasos: ");
        valores[0] = sc.next();

        System.out.println("Ingrese el nombre de la ruta que tendrá su archivo de evidencias: ");
        valores[1] = sc.next();

        return valores;
    }

    private static void cerrarBuffers(){
        try{
            in.close();
            out.close();
        }catch (IOException ex){
            out.printf("Error al cerrar flujo de entrada %s", ex);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> ruta1 = new ArrayList<>();
        ruta1.add("src/main/java/tema7_8_9/punto9/pasos/Pie Humano Derecho.txt");
        ruta1.add("src/main/java/tema7_8_9/punto9/pasos/Pie Humano Izquierdo.txt");

        LinkedList<String> ruta2 = new LinkedList<>();
        ruta2.add("src/main/java/tema7_8_9/punto9/pasos/Pie Bestia Derecho.txt");
        ruta2.add("src/main/java/tema7_8_9/punto9/pasos/Pie Bestia Izquierdo.txt");

        String[] valoresDeEntrada1 = valoresDeEntradaPorTeclado();
        caminar(Integer.parseInt(valoresDeEntrada1[0]), ruta1, valoresDeEntrada1[1]);

        String[] valoresDeEntrada2 = valoresDeEntradaPorTeclado();
        caminar(Integer.parseInt(valoresDeEntrada2[0]), ruta2, valoresDeEntrada2[1]);
        cerrarBuffers();

    }
}
