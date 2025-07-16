package patikaweek1.vkicalculation;

import java.util.Scanner;

/**
 * <p>Bu sınıf, kullanıcıdan boy ve kilo bilgisi alarak VKİ (Vücut Kitle İndeksi / BMI)
 * hesaplayan konsol uygulamasıdır.</p>
 *
 * <p>Formül: BMI = kilo / (boy * boy)</p>
 *
 * <p>Kullanıcıdan metre cinsinden boy, kilogram cinsinden ağırlık girmesi istenmektedir.
 * Ardından sonuç ekrana yazdırılır.</p>
 *
 * @author Canberk Sarıkaya
 * @version 1.0
 * */

public class Main
{
    public static void main(String[] args)
    {
        int kilogram = 0;
        float heigth = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        heigth = input.nextFloat();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilogram = input.nextInt();

        float bmi = bmiCalculation(kilogram, heigth);
        System.out.println("Vücut Kitle İndeksiniz: " + bmi);
    }

    /**
     * Kullanıcının boy ve kilosuna göre Vücut Kitle İndeksi (BMI) hesaplanır.
     *
     * @param kilogram Kullanıcının kilosu (kg cinsinden)
     * @param height Kullanıcının boyu (metre cinsinden)
     * @return Hesaplanan BMI değeri
     * */

    private static float bmiCalculation(int kilogram, float height)
    {
        return kilogram / (height * height);
    }
}
