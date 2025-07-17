package patikaweek1.matristranspoz;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <p>
 *     Bu uygulama, kullanıcıdan alınan girdiler ile iki boyutlu bir array (dizi / matris) oluşturur.
 *     Oluşturulan dizinin transpozunu alarak kullanıcıya çıktı olarak döner.
 * </p>
 *
 * <p>
 *     Bir matrisin transpozunu almak ne demektir?
 *     Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının
 *     yer değiştirmesi demektir. Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriği).
 * </p>
 * */

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Matris için satır sayısı girin: ");
        int rowNumber = input.nextInt();
        System.out.println("Matris için sütun sayısı girin: ");
        int columnNumber = input.nextInt();

        int[][] matrix = new int[rowNumber][columnNumber];

        System.out.println("Matrisin elemanlarını gir: ");
        for (int i = 0; i < rowNumber; i++)
        {
            for (int j = 0; j < columnNumber; j++)
            {
                System.out.println("Matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        int[][] transposeMatrix = transposeCalculator(matrix);
        printMatrix(matrix);
        System.out.println(" ");
        printTransposeMatrix(transposeMatrix);
    }

    /**
     * Girilen matrisin transpozunu alır.
     *
     * @param matrix Kullanıcının oluşturduğu matris değeri
     * @return Kullanıcının oluşturduğu matrisin transpozu
     * */
    private static int[][] transposeCalculator(int[][] matrix)
    {
        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }

    /**
     * Kullanıcının girdiği matrisi yazdırır.
     *
     * @param matrix Kullanıcının girdiği matris
     * */
    private static void printMatrix(int[][] matrix)
    {
        System.out.println("Matris: ");
        for (int i = 0; i < matrix.length; i++)
        {
            System.out.println(" ");
            for (int j = 0; j < matrix[0].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    /**
     * Kullanıcının girdiği matrisin transpozunu yazdırır.
     *
     * @param transposeMatrix Kullanıcının girdiği transpoz matris
     * */
    private static void printTransposeMatrix(int[][] transposeMatrix)
    {
        System.out.println("Transpoze: ");
        for (int i = 0; i < transposeMatrix.length; i++)
        {
            System.out.println(" ");
            for (int j = 0; j < transposeMatrix[0].length; j++)
            {
                System.out.print(transposeMatrix[i][j] + " ");
            }
        }
    }
}
