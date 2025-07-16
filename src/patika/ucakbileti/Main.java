package patika.ucakbileti;

import java.util.Scanner;

/**
 * <p>
 *     Bu uygulama, kullanıcının girdiği mesafe (km), yaş ve yolculuk tipine göre
 *     uçak bileti hesaplama uygulamasıdır.
 * </p>
 *
 * <p>
 *     Uygulama içerisinde belirtilen indirim şekilleri şunlardır;
 *     <ul>
 *         <li>12 yaş altı: %50 indirim</li>
 *         <li>12-24 yaş arası: %10 indirim</li>
 *         <li>65 yaş üstü: %30 indirim</li>
 *         <li>Gidiş Dönüş bilet: %20 indirim ve 2 ile çarpılacak</li>
 *     </ul>
 * </p>
 *
 *
 * @author Canberk Sarıkaya
 * @version 1.0
 * */

public class Main
{
    static Scanner input = new Scanner(System.in);

    /** Kilometre başına ücret */
    static final double kmDiscount = 0.10;
    /** Gidiş Dönüş indirimi oranı */
    static final double travelTypeDiscount = 0.20;
    /** 12 yaş altı indirim oranı */
    static final double underTwelveDiscount = 0.5;
    /** 12-24 yaş altı indirim oranı */
    static final double underTwentyFourDiscount = 0.1;
    /** 65 yaş üstü indirim oranı */
    static final double upperSixtyFiveDiscount = 0.3;

    public static void main(String[] args)
    {
        System.out.println("Mesafeyi km türünden giriniz: ");
        int km = input.nextInt();
        System.out.println("Yaşınızı giriniz: ");
        int age = input.nextInt();
        String yolculukTipi = """
                Yolculuk Tipini Giriniz.
                1 => Tek Yön
                2 => Gidiş Dönüş""";

        System.out.println(yolculukTipi);
        int travelType = input.nextInt();

        if (km < 0 || age < 0)
        {
            System.out.println("Hatalı Veri Girdiniz!");
            System.exit(0);
        }

        int totalPrice = totalPrice(km, age, travelType);
        System.out.println(totalPrice + " TL");
    }

    /**
     * Kullanıcının mesafe, yaş ve yolculuk tipine göre toplam bilet fiyatını hesaplar.
     *
     * @param km Mesafe(Kilometre cinsinden)
     * @param age Yolcunun yaşı
     * @param travelType Yolculuk Tipi (1: tek yön, 2: gidiş-dönüş)
     * @return Toplam bilet fiyatı (TL cinsinden, tam sayı olarak)
     * */
    private static int totalPrice(int km, int age, int travelType)
    {
        double totalPrice = switch (travelType)
        {
            case 1 ->
            {
                totalPrice = km * kmDiscount;
                yield ageDiscountCalculator(totalPrice, age);
            }
            case 2 ->
            {
                totalPrice = km * 0.10;
                totalPrice = ageDiscountCalculator(totalPrice, age);
                double typeDiscount = totalPrice * travelTypeDiscount;
                totalPrice -= typeDiscount;
                yield totalPrice * 2;
            }
            default ->
            {
                System.out.println("Hatalı Veri Girdiniz!");
                yield 0;
            }
        };

        return (int) totalPrice;
    }

    /**
     * Yaşa göre uygun indirimi uygular ve indirimli fiyatı döner.
     *
     * @param totalPrice İndirim öncesi bilet fiyatı
     * @param age Yolcunun yaşı
     * @return Yaş indirimi uygulanmış bilet fiyatı
     * */
    private static double ageDiscountCalculator(double totalPrice, int age)
    {
        if (age < 12)
        {
            double discount = totalPrice * underTwelveDiscount;
            totalPrice -=  discount;
        }
        else if (age <= 24)
        {
            double discount = totalPrice * underTwentyFourDiscount;
            totalPrice -= discount;
        }
        else if (age > 65)
        {
            double discount = totalPrice * upperSixtyFiveDiscount;
            totalPrice -= discount;
        }

        return (int) totalPrice;
    }
}
