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
public class Employee
{
    // SABİTLER
    private static final double TAX_RATE = 0.03;
    private static final int EXTRA_WORK_HOURS_SALARY = 30;
    private static final int CURRENT_YEAR = 2021; // Hardcoded (Ödevde belirtildiği üzere 2021 alınacağından dolayı
    // hardcoded bir şekilde const bir değişken olarak tanımlanmıştır.)
    private static final double RAISE_RATE_FOR_UNDER_TEN_YEARS = 0.05;
    private static final double RAISE_RATE_FOR_UPPER_NINE_YEARS_UNDER_TWENTY_YEARS = 0.1;
    private static final double RAISE_RATE_FOR_UPPER_NINETEEN_YEARS = 0.15;

    // NİTELİKLER
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    /**
     * Yeni bir çalışan oluşturur.
     *
     * @param name Çalışanın ismi
     * @param salary Çalışanın maaşı
     * @param workHours Çalışanın haftalık çalışma saati
     * @param hireYear Çalışanın işe alınma senesi
     * */
    public Employee(String name, double salary, int workHours, int hireYear)
    {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getWorkHours()
    {
        return workHours;
    }

    public int getHireYear()
    {
        return hireYear;
    }

    /**
     * Çalışanın mevcut maaşı üzerinden vergi hesaplar.
     *
     * @return vergi tutarı. Eğer maaş 1000 TL'den az ise 0 döner.
     */
    public double tax()
    {
        if (getSalary() < 1000)
        {
            return 0;
        }
        else
        {
            return getSalary() * TAX_RATE;
        }
    }

    /**
     * Çalışanın fazla çalıştığı saatlere oranla bonus hesaplar.
     *
     * @return bonus tutarı. Çalışan 40 saatten fazla çalışmamışsa 0 döner.
     */
    public int bonus()
    {
        if (getWorkHours() > 40)
        {
            int extraHours = getWorkHours() - 40;
            return extraHours * EXTRA_WORK_HOURS_SALARY;
        }
        else
        {
            return 0;
        }
    }

    /**
     * Çalışanın kıdemine göre maaş artışı hesaplar.
     *
     * @return maaş artış miktarı
     */
    public double raiseSalary()
    {
        int workYear = CURRENT_YEAR - getHireYear();

        if (workYear <= 9)
        {
            return getSalary() * RAISE_RATE_FOR_UNDER_TEN_YEARS;
        }
        else if (workYear <= 19)
        {
            return getSalary() * RAISE_RATE_FOR_UPPER_NINE_YEARS_UNDER_TWENTY_YEARS;
        }
        else
        {
            return getSalary() * RAISE_RATE_FOR_UPPER_NINETEEN_YEARS;
        }
    }

    /**
     * Vergi ve bonusların maaşa etkisiyle yeni maaşı hesaplar.
     *
     * @return vergi ve bonus sonrası yeni maaş
     */
    public double applyTaxAndBonuses()
    {
            double tax = tax();
            double bonus = bonus();

            return getSalary() + (bonus - tax);
    }

    /**
     * Vergi, bonus ve zam dahil edilerek toplam maaşı hesaplar.
     *
     * @return tüm eklemeler sonrası toplam maaş.
     */
    public double applyRaise()
    {
        double raise = raiseSalary();
        return applyTaxAndBonuses() + raise;
    }

    /**
     * Çalışana ait tüm bilgileri formatlı bir şekilde döker
     *
     * @return çalışanın tüm bilgilerini içeren string
     */
    @Override
    public String toString()
    {
        return "Ad: " + getName() + "\n" +
                "Maaşı: " + getSalary() + "\n" +
                "Çalışma Saati: " + getWorkHours() + "\n" +
                "Başlangıç Yılı: " + getHireYear() + "\n" +
                "Vergi: " + tax() + "\n" +
                "Bonus: " + bonus() + "\n" +
                "Maaş Artışı: " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile Maaşlar: " + applyTaxAndBonuses() + "\n" +
                "Toplam Maaş: " + applyRaise();
    }
}
