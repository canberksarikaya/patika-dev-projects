package patikaweek3.frekans;

import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * <p>
 *     Uygulama, kullanıcıdan bir kelime alarak, kelimenin içindeki harflerin
 *     kaç kere tekrar ettiğini bulur.
 * </p>
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir kelime giriniz.");
        String word = input.nextLine();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        putWordToHashMap(word.toLowerCase(), map);
        printMap(map);
    }

    /**
     * Kullanıcının girdiği kelimeyi Map yardımı ile harflerin kaç kere
     * tekrar ettiğini tutar.
     * @param word Kullanıcının girdiği kelime
     * @param map Oluşturulan map
     */
    private static void putWordToHashMap(String word, LinkedHashMap<Character, Integer> map)
    {
        for (int i = 0; i < word.length(); i++)
        {
            char character = word.charAt(i);
            if (Character.isLetter(character))
            {
                if (map.containsKey(character))
                {
                    map.put(character, map.get(character) + 1);
                }
                else
                {
                    map.put(character, 1);
                }
            }
        }
    }

    /**
     * Mapi yazdırır.
     * @param map Oluşturulan map
     */
    private static void printMap(LinkedHashMap<Character, Integer> map)
    {
        map.forEach((key, value) ->
                System.out.println(key + " = " + value));
    }
}
