package patikaweek1.cinzodyak;

import java.util.Scanner;

/**
 * <p>
 *     Bu uygulama, kullanıcının doğum yılına göre Çin Zodyağı burcunu hesaplar.
 *     Aynı işlemi üç farklı yönteme ayırdım;
 *
 *     <ul>
 *         <li>{@code switch-case} yapısı ile</li>
 *         <li>Dizi kullanarak</li>
 *         <li>{@link ChineseZodiac} enum sınıfı ile</li>
 *     </ul>
 * </p>
 *
 * <p>
 *     12 Hayvandan oluşan Çin Zodyağı döngüsünde burç, doğum yılının 12 ye bölünüp
 *     kalan değer ile tespit edilir.
 * </p>
 *
 * @author Canberk Sarıkaya
 * @version 1.0
 * */

enum ChineseZodiac
{
    MAYMUN, HOROZ, KOPEK, DOMUZ, FARE, OKUZ,
    KAPLAN, TAVSAN, EJDERHA, YILAN, AT, KOYUN;
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Doğum Yılınızı Giriniz: ");
        int birthYear = input.nextInt();

        String zodiac = zodiacCalculator(birthYear % 12);
        String zodiacTwo = zodiacCalculatorTwo(birthYear % 12);
        String zodiacThree = zodiacCalculatorThree(birthYear % 12);


        System.out.println("Çin Zodyağı Burcunuz: " + zodiac);
        System.out.println("Çin Zodyağı Burcunuz (2): " + zodiacTwo);
        System.out.println("Çin Zodyağı Burcunuz (3): " + zodiacThree);
    }

    /**
     * Çin Zodyağı burcunu switch-case yapısı kullanarak döner.
     *
     * @param modBirthYear Doğum yılının 12 ye bölünmesinden kalan değer
     * @return Burç adı / Geçersiz ise ("Unknown")
     * */
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

    /**
     * Çin Zodyağı burcunu sabit dizi üzerinden hesaplar.
     *
     * @param modBirthYear Doğum yılının 12 ye bölümünden kalan değer
     * @return Burç adı / Geçersizse ("Unknown")
     * */

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

    /**
     * Çin Zodyağı burcunu {@link ChineseZodiac} enum sınıfı üzerinden hesaplanır.
     *
     * @param modBirthYear Doğum yılının 12 ye bölümünden kalan değer
     * @return Enum'dan gelen burç adı / Geçersizse "Unknown"
     * */

    private static String zodiacCalculatorThree(int modBirthYear)
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
