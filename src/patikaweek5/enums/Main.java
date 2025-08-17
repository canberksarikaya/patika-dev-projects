package patikaweek5.enums;

import java.util.Scanner;

enum Day {
    SUNDAY("Kapalı"),
    MONDAY("09:00 - 17:00"),
    TUESDAY("09:00 - 17:00"),
    WEDNESDAY("09:00 - 17:00"),
    THURSDAY("09:00 - 17:00"),
    FRIDAY("09:00 - 17:00"),
    SATURDAY("10:00 - 14:00");

    private String workingHours;

    Day(String workingHours)
    {
        this.workingHours = workingHours;
    }

    public String getWorkingHours()
    {
        return workingHours;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir gün giriniz: ");
        String inputDay = scanner.nextLine().toUpperCase();

        try {
            Day selectedDay = Day.valueOf(inputDay);
            System.out.println(selectedDay + " günü çalışma saatleri: " + selectedDay.getWorkingHours());
        } catch (IllegalArgumentException e) {

        }
    }
}
