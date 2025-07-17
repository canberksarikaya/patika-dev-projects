package patikaweek1.tersucgen;

import java.util.Scanner;

/**
 * <p>
 *     Kullanıcıdan alınan girdiye bağlı olarak yarım ters üçgen yazdırma programıdır.
 * </p>
 * */

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int stepNumber = input.nextInt();
        oppositeTriangle(stepNumber);
    }

    /**
     * Kullanıcıdan alınan girdiye göre işlem yaparak ters üçgen yazdırır.
     *
     * @param stepNumber Kullanıcıdan alınan basamak sayısı
     * */
    private static void oppositeTriangle(int stepNumber)
    {
        for (int i = 0; i <= stepNumber; i++)
        {
            for (int j = stepNumber; j >= i; j--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
