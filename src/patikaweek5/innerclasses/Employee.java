package patikaweek5.innerclasses;

/**
 * Employee sınıfı, bir çalışanın ad ve soyad bilgilerini tutar.
 * Ayrıca, iç sınıf (Inner class) olan ContactInfo sayesinde
 * Çalışanın iletişim bilgilerini saklar.
 */
public class Employee
{
    private String firstName;
    private String lastName;

    /**
     * ContactInfo iç sınıfı, sadece bir çalışana ait
     * iletişim bilgilerini tutar.
     */
    public class ContactInfo
    {
        private String phoneNumber;
        private String email;

        /**
         * ContactInfo Constructor
         * @param phoneNumber Çalışanın telefon numarası
         * @param email Çalışanın e-posta adresi
         */
        public ContactInfo(String phoneNumber, String email)
        {
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        /**
         * Çalışanın iletişim bilgilerini döndürür
         * @return Telefon ve Email bilgisi
         */
        public String getContactDetails()
        {
            return "Telefon: " + phoneNumber + ", Email: " + email;
        }
    }

    /**
     * Employee Constructor
     * @param firstName Çalışanın adı
     * @param lastName Çalışanın soyadı
     */
    public Employee(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Çalışanın tam adını döndürür
     * @return Ad ve Soyad
     */
    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    /**
     * Çalışanın iletişim bilgilerini ekrana yazdırır
     * @param contactInfo Çalışanın iletişim bilgilerini tutan ContactInfo nesnesi
     */
    public void displayContactInfo(ContactInfo contactInfo)
    {
        System.out.println("Çalışan: " + getFullName());
        System.out.println(contactInfo.getContactDetails());
    }
}
