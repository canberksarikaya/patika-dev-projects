package patikaweek1.tipdonusumu;

import java.util.Scanner;

/**
 * <p>
 *     Uygulama, kullanıcından bir tam sayı ve bir ondalıklı sayı alarak,
 *     ondalıklı sayıyı tam sayıya, tam sayıyı ise ondalıklı sayıya tip dönüşümü yapar.
 * </p>
 * */

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz: ");
        int number = input.nextInt();
        System.out.println("Bir ondalıklı sayı giriniz: ");
        double decimalNumber = input.nextDouble();

        typeCasting(number, decimalNumber);
    }

    /**
     * Kullanıcının girdiği tam sayıyı ondalıklı sayıya, ondalıklı sayıyı
     * tam sayıya dönüştürür.
     *
     * @param number Kullanıcının girdiği tam sayı
     * @param decimalNumber Kullanıcının girdiği ondalıklı sayı
     * */
    private static void typeCasting(int number, double decimalNumber)
    {
        double numberToDecimal = (double) number;
        System.out.println("Girilen tam sayının ondalıklı sayı hali: " + numberToDecimal);
        int decimalNumberToNumber = (int) decimalNumber;
        System.out.println("Girilen ondalıklı sayının tam sayı hali: " + decimalNumberToNumber);
    }
}
