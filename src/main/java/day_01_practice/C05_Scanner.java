package day_01_practice;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
/*  Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scan.nextLine();

        System.out.println("Please enter your last name...");

        String lastName=scan.nextLine();
        System.out.println("Please enter your age...");
        int age=scan.nextInt();

        System.out.println("Please enter your height...");
         int height=scan.nextInt();

        System.out.println("Please enter your weight...");
         int weight=scan.nextInt();

       // System.out.println("Name: " +name + "\n" + "Last Name: " + lastName  + "\n" + "Age: + age" +
              //  "\n" + "Heigth: + heigth);



















    }
}
