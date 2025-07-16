package patika.cinzodyak;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Doğum Yılınızı Giriniz: ");
        int birthYear = input.nextInt();

        String zodiac = zodiacCalculator(birthYear % 12);
        String zodiacTwo = zodiacCalculatorTwo(birthYear % 12);


        System.out.println("Çin Zodyağı Burcunuz: " + zodiac);
        System.out.println("Çin Zodyağı Burcunuz (2): " + zodiacTwo);
    }

    private static String zodiacCalculator(int modBirthYear)
    {
        return switch (modBirthYear)
        {
            case 0 -> "Maymun";
            case 1 -> "Horoz";
            case 2 -> "Köpek";
            case 3 -> "Domuz";
            case 4 -> "Fare";
            case 5 -> "Öküz";
            case 6 -> "Kaplan";
            case 7 -> "Tavşan";
            case 8 -> "Ejderha";
            case 9 -> "Yılan";
            case 10 -> "At";
            case 11 -> "Koyun";
            default -> "Unknown";
        };
    }

    // İkinci yol, daha kısa ve alternatif

    private static String zodiacCalculatorTwo(int modBirthYear)
    {
        String[] zodiacs = {
                "Maymun", "Horoz", "Köpek", "Domuz", "Fare",
                "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun",
        };

        if (modBirthYear >= 0 && modBirthYear < zodiacs.length)
        {
            return zodiacs[modBirthYear];
        }
        else
        {
            return "Unknown";
        }
    }
}
