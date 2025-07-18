package patikaweek2.asalsayi;

import java.util.Scanner;

/**
 * <p>
 *     Uygulama, kullanıcının girdiği sayının asal sayı olup olmadığını hesaplar.
 * </p>
 * */

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int number = input.nextInt();

        if (number < 2)
        {
            System.out.println("Asal sayı değildir.");
        }
        else
        {
            boolean result = isPrime(number, number - 1);
            System.out.println(result ? "Asal sayıdır." : "Asal değildir.");
        }
    }

    /**
     * Recursive bir fonksiyon olarak, sayının asal olup olmadığını belirler.
     *
     * @param number Kullanıcının girdiği sayı
     * @param divisor Kontrol edilen sayı
     * @return Asal sayı olup olmadığına dair boolean değer döndürür
     * */
    private static boolean isPrime(int number, int divisor)
    {
        if (divisor == 1)
        {
            return true;
        }
        if (number % divisor == 0)
        {
            return false;
        }
        return isPrime(number, divisor - 1);
    }
}
