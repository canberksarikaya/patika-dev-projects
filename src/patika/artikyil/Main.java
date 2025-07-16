package patika.artikyil;

import java.util.Scanner;

/**
 * <p>
 *     Bu uygulama, kullanıcıdan girdi olarak bir yıl alarak
 *     o yılın artık yıl olup olmadığını hesaplar.
 * </p>
 *
 * <p>
 *     Artık yıl kuralları:
 *     <ul>
 *         <li>Yıl 4 ile tam bölünüyorsa ve 100 ile tam bölünmüyorsa -> Artık yıl</li>
 *         <li>Veya yıl 400 ile tam bölünüyorsa -> Artık yıl</li>
 *         <li>Aksi halde -> Artık yıl değil</li>
 *     </ul>
 * </p>
 *
 * @author Canberk Sarıkaya
 * @version 1.0
 * */

public class Main
{
    public static void main(String[] args)
    {
        Scanner input =  new Scanner(System.in);
        System.out.println("Yıl Giriniz: ");
        int year = input.nextInt();
        boolean leapYear = leapYearCalculator(year);

        if (leapYear)
        {
            System.out.println(year + " artık yıldır.");
        }
        else
        {
            System.out.println(year + " artık yıl değildir.");
        }
    }

    /**
     * Verilen yılın artık yıl olup olmadığını hesaplar ve sonucu ekrana yazdırır.
     *
     * @param year Kontrol edilecek yıl
     * */
    private static boolean leapYearCalculator(int year)
    {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
