package review_01;

import java.util.Locale;
import java.util.Scanner;

public class Password_01 {
    public static void main(String[] args) {

        /*
    Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
Input :
John White
1234234534561478
Output : Name :
J*** W****
CCN  : **** **** **** 1478
* Ilk Harfler Buyuk harf ile baslamalidir.
  */

        Scanner scan=new Scanner(System.in);

        System.out.println(" Please enter your first name");
         String firstName=scan.next();

        System.out.println("Please enter your last name");
        String lastName=scan.next();

        System.out.println(" Please enter your password");
        String ccn=scan.nextLine();

        firstName.substring(0,1).toUpperCase();
        lastName.substring(0,1).toUpperCase();

        System.out.println("Name:"+firstName.charAt(0)+"***"+ " "+lastName.charAt(0)+"****"+" "+"ccn:"+"***"+" "+"***"+" "+"***"+1478);







    }







}
