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
        Product[] products = {
                new Product("Armut", 2.14),
                new Product("Elma", 3.67),
                new Product("Domates", 1.11),
                new Product("Muz", 0.95),
                new Product("Patlıcan", 5.00)
        };

        double totalPrice = totalPriceCalculator(products);

        System.out.println("Toplam Tutar : " + totalPrice + " TL");
    }

    private static double totalPriceCalculator(Product[] products)
    {
        double totalPrice = 0;

        for (Product product : products)
        {
            System.out.println(product.getName() + " Kaç Kilo?");
            double kilogram =  input.nextInt();
            totalPrice += kilogram * product.getPricePerKg();
        }

        return totalPrice;
    }
}

class Product
{
    private String name;
    private double pricePerKg;

    Product (String name, double pricePerKg)
    {
        this.name = name;
        this.pricePerKg = pricePerKg;
    }

    public String getName()
    {
        return name;
    }

    public double getPricePerKg()
    {
        return pricePerKg;
    }
}
