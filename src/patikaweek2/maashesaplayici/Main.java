package patikaweek2.maashesaplayici;

/**
 * {@code Employee} sınıfı, bir çalışanın ismini, maaşını, çalışma saatini ve
 * işe alım yılını tutar. Bu değerlere göre çalışanın vergisini, bonusunu ve maaş
 * arttırımını hesaplar.
 *
 * <p>
 *     Bu sınıf aşağıdaki özellikleri destekler:
 *     <ul>
 *         <li>Vergi hesaplama</li>
 *         <li>Fazla mesaiye göre bonus hesaplama</li>
 *         <li>Kıdeme göre maaş artışı hesaplama</li>
 *         <li>Tüm detayları yazdırma</li>
 *     </ul>
 * </p>
 * <p>
 *     Ödev kapsamında CURRENT_YEAR sabit olarak 2021 kabul edilmiştir.
 *     Ödev kapsamında, set state'ler kullanılmamış, göstermelik hesaplamalar
 *     kabul edilmiştir.
 * </p>
 * */
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
