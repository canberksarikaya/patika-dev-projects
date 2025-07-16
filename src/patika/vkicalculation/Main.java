package patika.vkicalculation;

import java.util.Scanner;

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

    private static float bmiCalculation(int kilogram, float heigth)
    {
        return kilogram / (heigth * heigth);
    }
}
