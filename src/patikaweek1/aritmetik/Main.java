package patikaweek1.aritmetik;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("3 adet sayı giriniz.");
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();

        int result = result(numberOne, numberTwo, numberThree);
        System.out.println("Result: " + result);
    }

    private static int result(int numberOne, int numberTwo, int numberThree)
    {
        int result = numberOne + (numberTwo * numberThree) - numberTwo;
        return result;
    }
}
