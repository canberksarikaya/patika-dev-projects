package patikaweek1.mukemmelsayi;

import java.util.Scanner;

/**
 * <p>
 *     Bu uygulama, kullanıcıdan alınan sayının mükemmel sayı olup olmadığını hesaplar.
 * </p>
 *
 * <p>
 *     Mükemmel sayı olmak için gerekli olan kural:
 *     Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
 *     toplamı kendisine eşit olmalıdır.
 * </p>
 *
 * @author Canberk Sarıkaya
 * @version 1.0
 * */

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = input.nextInt();
        boolean isNumberPerfectNumber = isPerfectNumber(number);
        System.out.println(isNumberPerfectNumber ? number + "Mükemmel sayıdır." : number + "Mükemmel sayı değildir.");
        System.out.println(isNumberPerfectNumber);
    }

    /**
     * Kullanıcıdan alınan girdiye göre işlem yaparak mükemmel sayı olup olmadığını hesaplar.
     *
     * @param number Kullanıcının girdiği sayı
     * @return Mükemmel sayı olup olmadığına dair true ya da false değer
     * */
    private static boolean isPerfectNumber(int number)
    {
        int toplam = 0;

        for (int i = 1; i < number; i++)
        {
            if (number % i == 0)
            {
                toplam += i;
            }
        }

        return toplam == number;
    }
}
