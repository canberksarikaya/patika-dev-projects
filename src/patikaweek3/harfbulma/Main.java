package patikaweek3.harfbulma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * <p>
 *     Uygulama, String veri tipinde bir ArrayList oluşturup, içerisine 4 adet String veri ekler.
 *     Kullanıcıdan alınan String'ler ile ArrayList gezilir, eğer kullanıcının girdiği String
 *     ArrayList içerisinde mevcut olarak bulunuyorsa, String "Found" olarak değiştirilir. Eğer
 *     ArrayList içerisinde bulunmuyorsa listeye girilen String değer eklenir.
 * </p>
 * <p>
 *     Önemli not: While döngüsü ödevde verilen üzere "4 kere" çalışacak şekilde hardcoded bir hale
 *     getirilmiştir.
 * </p>
 *
 * @author Canberk Sarıkaya
 * @version 1.0
 * */
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        addLettersToList(list, "A", "B", "C", "D");

        System.out.println(list);

        int count = 0;

        while (count < 4)
        {
            String letter = input.nextLine();
            findLetters(list, letter.toUpperCase());
            count++;

            System.out.println("Count: " + count);
            System.out.println("List Size: " + list.size());
        }
    }

    /**
     * İçerisine mevcut listeyi ve harfleri alarak ArrayList'e veri ekler.
     *
     * @param list Oluşturulan liste
     * @param letter Girilecek harfler
     * */
    private static void addLettersToList(ArrayList<String> list, String... letter)
    {
        list.addAll(Arrays.asList(letter));
    }

    /**
     * Kullanıcıdan harf girişi alarak verilen listenin içerisinde döndürür. Eğer girilen
     * harf liste içerisinde varsa onu "FOUND" ile değiştirir, yoksa listeye ekler.
     *
     * @param list Harf aranacak liste
     * @param letter Aranacak harf
     * */
    private static void findLetters(ArrayList<String> list, String letter)
    {
        boolean found = false;

        for (String s : list)
        {
            if (s.equals(letter))
            {
                System.out.println("Found Letter: " + letter);
                list.set(list.indexOf(letter), "FOUND");
                found = true;
                System.out.println("New List: " + list);
            }
        }

        if (!found)
        {
            list.add(letter);
            System.out.println(letter + " added.");
            System.out.println("New List: " + list);
        }

    }
}
