package patika.cinzodyakenum;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Doğum Yılınızı Giriniz: ");
        int birthYear = input.nextInt();

        String zodiac = zodiacCalculator(birthYear % 12);
        System.out.println("Çin Zodyağı Burcunuz: " + zodiac);
    }

    private static String zodiacCalculator(int modBirthYear)
    {
        if (modBirthYear >= 0 && modBirthYear < 12)
        {
            return ChineseZodiac.values()[modBirthYear].toString();
        }
        else
        {
            return "Unknown";
        }
    }
}
