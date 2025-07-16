package patika.manavkasa;

import java.util.Scanner;

public class Main
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        String[] fruitArray = {"Armut", "Elma", "Domates", "Muz", "Patlıcan"};
        float[] kgSalePrice = {2.14f, 3.67f, 1.11f, 0.95f, 5.00f};

        float totalPrice = totalPriceCalculator(fruitArray, kgSalePrice);

        System.out.println("Toplam Tutar : " + totalPrice + " TL");
    }

    private static float totalPriceCalculator(String[] fruitArray, float[] kgSalePrice)
    {
        float totalPrice = 0.0f;
        int kilogram = 0;

        for (int i = 0; i < fruitArray.length; i++)
        {
            System.out.println(fruitArray[i] + " Kaç Kilo?");
            kilogram = input.nextInt();
            totalPrice += kgSalePrice[i] * kilogram;
        }

        return totalPrice;
    }
}
