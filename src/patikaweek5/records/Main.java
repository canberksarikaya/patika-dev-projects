package patikaweek5.records;

/**
 * Student record sınıfı, öğrencinin temel bilgilerini saklar.
 * @param name Öğrencinin adı
 * @param surname Öğrencinin soyadı
 * @param studentNumber Öğrencinin numarası
 */
record Student(String name, String surname, int studentNumber)
{

}

public class Main
{
    public static void main(String[] args)
    {
        Student studentOne = new Student("Canberk", "Sarıkaya", 101);
        Student studentTwo = new Student("canberk2", "Sarıkaya2", 102);
        Student studentThree = new Student("canberk3", "sarıkaya3", 103);

        System.out.println("Öğrenciler: ");
        System.out.println(studentOne);
        System.out.println(studentTwo);
        System.out.println(studentThree);

        System.out.println("\nKarşılaştırmalar:");
        System.out.println("Öğrenci1 - Öğrenci2 " + studentOne.equals(studentTwo));
        System.out.println("Öğrenci1 - Öğrenci3 " + studentOne.equals(studentThree));
        System.out.println("Öğrenci1 HashCode " + studentOne.hashCode());
        System.out.println("Öğrenci3 HashCode " + studentThree.hashCode());
    }
}
