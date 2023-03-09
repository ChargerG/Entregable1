package tema7_8_9.punto8;

import java.io.*;

public class EjercicioOcho {

    static InputStream archivoACopiar;
    static PrintStream archivoDeSalida;

    private static void copiarArchivo(String fileIn, String fileOut) {
        try{
            archivoACopiar = new FileInputStream(fileIn);
            archivoDeSalida = new PrintStream(fileOut);

            byte[] binarios = archivoACopiar.readAllBytes();
            archivoDeSalida.write(binarios);

        }catch (FileNotFoundException ex){
            System.out.printf("Archivo no encontrado %s", ex);
        }catch (IOException ex) {
            System.out.printf("Error de letura %s", ex);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        String rutaDeEntrada = "src/main/java/tema7_8_9/punto8/archivoACopiar/ArchivoACopiar.txt";
        String rutaDeSalida = "src/main/java/tema7_8_9/punto8/archivoDeSalida/ArchivoDeSalida.txt";

        copiarArchivo(rutaDeEntrada, rutaDeSalida);
    }
}
