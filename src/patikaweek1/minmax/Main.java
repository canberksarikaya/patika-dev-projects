package patikaweek1.minmax;

import java.util.Scanner;

/**
 * <p>
 *     Uygulama, kullanıcıdan girmek istediği sayı adedini alarak, o adet kadar sayıyı
 *     girdi olarak alır, alınan girdiler arasından en küçük ve en büyük olan sayıyı hesaplar.
 * </p>
 * */

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean isCompleted = false;
        int counter = 0;

        System.out.println("Kaç tane sayı gireceksiniz? ");
        int numberCount = input.nextInt();
        int[] numberArray = new int[numberCount];

        while (!isCompleted)
        {
            System.out.println("Bir sayı giriniz: ");
            int number = input.nextInt();
            numberArray[counter] = number;
            counter++;

            if (counter == numberCount)
            {
                isCompleted = true;
            }
        }

        int min = numberArray[0];
        int max = numberArray[0];

        for (int i = 1; i < numberArray.length; i++)
        {
            if (numberArray[i] < min)
            {
                min = numberArray[i];
            }

            if (numberArray[i] > max)
            {
                max = numberArray[i];
            }
        }

        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}
