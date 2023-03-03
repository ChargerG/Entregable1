package tema2;

public class CalcularIVA {

    private static float productoConIva(float producto){
        final float IVA = 0.19f; // IVA aplicado en Colombia
        return producto + producto*IVA;
    }

    public static void main(String[]args){
        System.out.println(productoConIva(20000));
    }
}
