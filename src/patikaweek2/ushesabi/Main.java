package patikaweek2.ushesabi;

import java.util.Scanner;

/**
 * <p>
 *     Uygulama, kullanıcıdan girdi olarak bir sayı ve üs değeri alır.
 *     Girilen sayının girilen üssünü hesaplar.
 * </p>
 * */

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz: ");
        int number = input.nextInt();
        System.out.println("Kaç üssü alınacak: ");
        int numberPower = input.nextInt();

        int result = powerOfNumber(number, numberPower);
        System.out.println("Verilen Sayı: " + number);
        System.out.println("Alınacak üssü: " + numberPower);
        System.out.println("Sonuç: " + result);
    }

    /**
     * Kullanıcının girdiği sayıyı ve girdiği üssü parametre olarak alarak
     * sayının üssünü hesaplar.
     *
     * @param number Kullanıcının girdiği sayı
     * @param numberPower Kullanıcının girdiği üs değeri
     * @return Kullanıcının girdiği sayının girdiği üs değerini döndürür
     * */
    private static int powerOfNumber(int number, int numberPower)
    {
        if (numberPower == 0)
        {
            return 1;
        }

        return number * powerOfNumber(number, numberPower - 1);
    }
}
