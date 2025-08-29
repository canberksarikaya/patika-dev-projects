package patikaweek5.methodref;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        List<String> nameList = List.of("Ahmet", "Ayşe", "Mehmet", "Zeynep");
        nameList.forEach(System.out::println);
    }
}
