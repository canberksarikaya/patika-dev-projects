package patika.artikyil;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input =  new Scanner(System.in);
        System.out.println("Yıl Giriniz: ");
        int year = input.nextInt();
        leapYearCalculator(year);

    }

    private static void leapYearCalculator(int year)
    {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            System.out.println(year + " bir artık yıldır !");
        }
        else
        {
            System.out.println(year + " bir artık yıl değildir !");
        }
    }
}
