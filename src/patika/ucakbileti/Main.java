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
 * <p>
 *     Kullanıcıdan alınan bilgiler {@link Ticket} sınıfı ile nesne haline getirilir.
 *     Ardından toplam ücret hesaplanarak ekrana yazdırılır.
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
    static final double kmPrice = 0.10;
    /** Gidiş Dönüş indirimi oranı */
    static final double travelTypeDiscount = 0.20;
    /** 12 yaş altı indirim oranı */
    static final double underTwelveDiscount = 0.5;
    /** 12-24 yaş altı indirim oranı */
    static final double underTwentyFourDiscount = 0.1;
    /** 65 yaş üstü indirim oranı */
    static final double upperSixtyFiveDiscount = 0.3;

    /**
     * Uygulamanın giriş noktasıdır.
     * Mesafe, yaş ve yolculuk tipi bilgileri alınarak {@link Ticket} nesnesi oluşturulur.
     * Ardından bilet fiyatı hesaplanır.
     * */
    public static void main(String[] args)
    {
        try{
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

            Ticket ticket = new Ticket(km, age, travelType);

            int totalPrice = totalPrice(ticket);
            System.out.println(totalPrice + " TL");
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.exit(0);
        }

    }

    /**
     * Kullanıcının bilet bilgilerine göre toplam fiyatı hesaplar.
     *
     * @param ticket Hesaplamada kullanılacak {@link Ticket} nesnesi
     * @return Toplam bilet fiyatı (tam sayı olarak TL cinsinden)
     * */
    private static int totalPrice(Ticket ticket)
    {
        double finalPrice = switch (ticket.getTravelType())
        {
            case 1 ->
            {
                finalPrice = ticket.getDistance() * kmPrice;
                yield ageDiscountCalculator(finalPrice, ticket.getAge());
            }
            case 2 ->
            {
                finalPrice = ticket.getDistance() * kmPrice;
                finalPrice = ageDiscountCalculator(finalPrice, ticket.getAge());
                double typeDiscount = finalPrice * travelTypeDiscount;
                finalPrice -= typeDiscount;
                yield finalPrice * 2;
            }
            default ->
            {
                System.out.println("Hatalı Veri Girdiniz!");
                yield 0;
            }
        };

        return (int) finalPrice;
    }

    /**
     * Kullanıcının yaşına göre uygulanacak indirimli fiyatı hesaplar.
     *
     * @param totalPrice İndirim uygulanmadan önceki bilet fiyatı
     * @param age Kullanıcının yaşı
     * @return Yaş indirimine göre düzenlenmiş bilet fiyatı
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

        return totalPrice;
    }

}

/**
 * <p>
 *     Kullanıcının bilet bilgilerini (mesafe, yaş ve yolculuk tipi) tutan sınıftır.
 * </p>
 *
 * <p>
 *     Geçersiz mesafe veya yaş verisi girilirse, kurucu metod
 *     {@link IllegalArgumentException} fırlatır.
 * </p>
 * */
class Ticket
{
    private int distance;
    private int age;
    private int travelType;

    /**
     * {@code Ticket} sınıfının kurucu metodu.
     *
     * @param distance Yolculuk mesafesi (km)
     * @param age Yolcunun yaşı
     * @param travelType Yolculuk tipi (1: Tek yön, 2: Gidiş dönüş)
     * @throws IllegalArgumentException Eğer mesafe veya yaş negatif girilirse
     * */
    public Ticket(int distance, int age, int travelType) throws Exception
    {
        if (distance < 0 || age < 0 || (travelType != 1 && travelType != 2))
        {
            throw new IllegalArgumentException("Hatalı Veri Girdiniz!");
        }

        this.distance = distance;
        this.age = age;
        this.travelType = travelType;
    }

    /**
     * Yolculuk mesafesini döner.
     *
     * @return Mesafe (km)
     * */
    public int getDistance()
    {
        return distance;
    }

    /**
     * Kullanıcının yaşını döner.
     *
     * @return Yaş
     * */
    public int getAge()
    {
        return age;
    }

    /**
     * Yolculuk tipini döner.
     *
     * @return 1 (Tek yön) veya 2 (Gidiş dönüş)
     * */
    public int getTravelType()
    {
        return travelType;
    }
}
