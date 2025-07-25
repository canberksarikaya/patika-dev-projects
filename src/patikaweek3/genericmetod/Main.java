package patikaweek3.genericmetod;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Generics", "Ödev"};

        Utils.printArray(intArray);
        Utils.printArray(strArray);
    }
}

class Utils
{

    public static <T> void printArray(T[] array)
    {
        for (T element : array)
        {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
