package patikaweek2.gecerlisifre;

import java.util.Scanner;


/**
 * <p>
 *     Uygulama, kullanıcının girdiği şifrenin geçerli olup olmadığını boolean (true / false) olarak
 *     döndürür.
 * </p>
 *
 * <p>
 *     Şifrenin geçerli olması için kurallar:
 *     <ul>
 *         <li>En az 8 karakter içermeli.</li>
 *         <li>Space karakteri içermemeli</li>
 *         <li>İlk harf büyük olmalı</li>
 *         <li>Son karakteri ? olmalı</li>
 *     </ul>
 * </p>
 * */
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Kendiniz için bir şifre oluşturunuz: ");
        String password = input.nextLine();

        boolean isValid = isValidPassword(password);
        System.out.println(isValid ? "Geçerli Şifre" : "Geçersiz Şifre");
    }

    /**
     * Kullanıcının girdiği şifreyi alarak şifrenin kontrollerini sağlar.
     *
     * @param password Kullanıcının girdiği şifre
     * @return Kullanıcının şifresi kurallara uygun ise true, uygun değilse false
     * */
    private static boolean isValidPassword(String password)
    {
        return password.length() > 8 &&
                !password.contains(" ") &&
                Character.isUpperCase(password.charAt(0)) &&
                password.endsWith("?");
    }
}
