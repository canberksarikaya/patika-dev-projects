package patika.ucakbileti;

import java.util.Scanner;

public class Main
{
    static Scanner input = new Scanner(System.in);

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

    private static int totalPrice(int km, int age, int travelType)
    {
        double kmDiscount = 0.10;
        double travelTypeDiscount = 0.20;

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

    private static double ageDiscountCalculator(double totalPrice, int age)
    {
        double underTwelveDiscount = 0.5;
        double underTwentyFourDiscount = 0.1;
        double upperSixtyFiveDiscount = 0.3;

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
