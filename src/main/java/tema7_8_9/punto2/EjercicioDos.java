package tema7_8_9.punto2;

public class EjercicioDos {

    public static void main(String[] args) {
        Integer[][] arrayBidimensional = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16,17,18,19,20}
        };

        for (int i = 0; i < arrayBidimensional.length; i++)
            for(int j = 0; j < arrayBidimensional[i].length; j++)
                System.out.printf("En la posición [%s][%s] se encuentra el elemento %s%n", i, j, arrayBidimensional[i][j]);
    }
}
