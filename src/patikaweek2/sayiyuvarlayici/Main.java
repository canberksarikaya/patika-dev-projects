package patikaweek2.sayiyuvarlayici;

import java.util.Scanner;
/**
 * <p>
 *     Uygulama, kullanıcıdan ondalıklı sayı alarak onu aşağı, yukarı ve en yakın sayıya
 *     yuvarlar.
 * </p>
 * */
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Ondalıklı sayı giriniz: ");
        double decimalNumber = input.nextDouble();
        decimalToNumber(decimalNumber);
    }

    /**
     * Kullanıcıdan alınan ondalık sayıyı aşağı, yukarı ve en yakın sayıya
     * yuvarlar.
     *
     * @param decimalNumber Kullanıcıdan alınan ondalık sayı
     * */
    private static void decimalToNumber(double decimalNumber)
    {
        int floorNumber = (int) Math.floor(decimalNumber);
        int ceilingNumber = (int) Math.ceil(decimalNumber);
        long round = Math.round(decimalNumber);

        System.out.println("Aşağı yuvarlama: " + floorNumber);
        System.out.println("Yukarı yuvarlama: " + ceilingNumber);
        System.out.println("En yakın tam sayı: " + round);
    }
}
