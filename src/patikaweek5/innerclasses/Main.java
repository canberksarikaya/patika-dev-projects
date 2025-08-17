package patikaweek5.innerclasses;

public class Main
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("Canberk", "Sarıkaya");
        Employee.ContactInfo contact1 = employee1.new ContactInfo("0555555555", "canberk@gmail.com");

        employee1.displayContactInfo(contact1);
    }
}
