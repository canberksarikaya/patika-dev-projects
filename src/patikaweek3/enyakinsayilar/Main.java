package patikaweek3.enyakinsayilar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
/**
 * <p>
 *     Uygulama, benzersiz sayılardan oluşan bir ArrayList oluşturur ve bu ArrayList
 *     içerisinde işlem yaparak birbirine en yakın iki sayıyı döndürür.
 * </p>
 *
 * @author Canberk Sarıkaya
 * @version 1.0
 * */
public class Main
{
    static Random random = new Random();

    public static void main(String[] args)
    {
        ArrayList<Integer> integerList = new ArrayList<>();

        addIntegersToList(integerList);
        System.out.println(integerList);

        findTwoCloseIntegers(integerList);
    }

    /**
     * Bir ArrayList alarak öncelikle hashSet kullanımı ile benzersiz sayılardan oluşan
     * bir set oluşturur, ardından bu seti ArrayList'e aktarır.
     *
     * @param list Yaratılmış olan ArrayList
     * */
    private static void addIntegersToList(ArrayList<Integer> list)
    {
        HashSet<Integer> hashSet = new HashSet<>();
        while (hashSet.size() < 10)
        {
            int randomInt = random.nextInt(100);
            hashSet.add(randomInt);
        }

        list.addAll(hashSet);
    }

    /**
     * İçerisinde sayıların bulunduğu bir ArrayList'i alarak öncelikle küçükten büyüğe
     * sıralar, ardından birbirine en yakın iki sayıyı aralarındaki farkı hesaplayarak bulur.
     *
     * @param list İçerisinde veriler olan ArrayList
     * */
    private static void findTwoCloseIntegers(ArrayList<Integer> list)
    {
        list.sort(null);
        System.out.println("Sorted List: " + list);

        int minDifference = Integer.MAX_VALUE;
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < list.size() - 1; i++)
        {
            int currentNumber = list.get(i);
            int nextNumber = list.get(i + 1);
            int diff = nextNumber - currentNumber;

            if (diff < minDifference)
            {
                minDifference = diff;
                num1 = currentNumber;
                num2 = nextNumber;
            }
        }

        System.out.println("Closest numbers are: " + num1 + " and " + num2);
    }
}
