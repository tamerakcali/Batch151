package day_01_practice;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
   //ex:  // Kullanicidan ismini ve soyismini arasında bosluk olacak sekilde
        // tek bir String olarak sisteme girmesini isteyiniz.
        // isminin ilk karakterini ve soyisminin ilk karakterini BUYUK harfle yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your first name and last name...");

        String fullName=scan.nextLine().toUpperCase();

        char firstNameFirstCharacter=fullName.charAt(0);

        char lastNameFirstCharacter= fullName.charAt(fullName.indexOf(" ")+1);

        System.out.println("" + firstNameFirstCharacter + lastNameFirstCharacter);






    }
}
