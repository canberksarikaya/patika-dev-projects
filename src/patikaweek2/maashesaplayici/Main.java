package patikaweek2.maashesaplayici;

/**
 * Uygulamanın ana giriş noktası.
 * <p>
 * {@code Employee} sınıfını kullanarak bir çalışanın maaş detayları hesaplanır
 * ve ekrana yazdırılır.
 * </p>
 */
public class Main
{
    public static void main(String[] args)
    {
        Employee kemal = new Employee("Kemal", 2000.0, 45, 1985);

        kemal.tax();
        kemal.bonus();
        kemal.raiseSalary();

        String kemalToString = kemal.toString();
        System.out.println(kemalToString);
    }
}
