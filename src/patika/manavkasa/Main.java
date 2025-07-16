package patika.manavkasa;

import java.util.Scanner;

/**
 * <p>
 *     Uygulama, manav ürünlerinden alınan kilogram miktarına göre toplam tutarı
 *     hesaplar.
 * </p>
 *
 * <p>
 *     Kullanıcıdan sırasıyla her meyve/sebze için kaç kilogram almak istediği sorulduktan sonra
 *     tüm ürünlerin fiyatları ile çarpılarak toplam tutar hesaplanır.
 *
 *     <ul>
 *         <li>Armut: 2.14 TL/kg</li>
 *         <li>Elma: 3.67 TL/kg</li>
 *         <li>Domates: 1.11 TL/kg</li>
 *         <li>Muz: 0.95 TL/kg</li>
 *         <li>Patlıcan: 5.00 TL/kg</li>
 *     </ul>
 *
 * @author Canberk Sarıkaya
 * @version 1.0
 * </p>
 * */

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

    /**
     * Kullanıcıdan her bir ürün için kilogram miktarını alır ve o ürüne ait fiyatla çarpar,
     * sonrasında toplam fiyatı hesaplar.
     *
     * @param fruitArray Ürün isimlerini içeren dizi
     * @param kgSalePrice Ürünlerin kilogram başına satış fiyatlarını içeren dizi
     * @return Tüm ürünlerin toplam fiyatı
     * */
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
