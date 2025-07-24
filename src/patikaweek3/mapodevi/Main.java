package patikaweek3.mapodevi;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * <p>
 *     Uygulama, oluşturulan HashMap içerisinde giriş yapılmış İsim (Key) ve
 *     not (Value) değerlerini sırayla döndürür.
 * </p>
 */
public class Main
{
    public static void main(String[] args)
    {
        LinkedHashMap<String, Integer> scoresMap = new LinkedHashMap<>();
        scoresMap.put("Ali", 85);
        scoresMap.put("Ayşe", 92);
        scoresMap.put("Mehmet", 78);
        scoresMap.put("Zeynep", 90);
        scoresMap.put("Burak", 88);

        printMap(scoresMap);
    }

    /**
     * Kullanıcının oluşturduğu mapin içerisindeki key, value değerlerini
     * döndürür.
     * @param map Kullanıcının oluşturduğu HashMap
     */
    private static void printMap(LinkedHashMap<String, Integer> map)
    {
        map.forEach((key, value) ->
                System.out.println(key + " = " + value));
    }
}
