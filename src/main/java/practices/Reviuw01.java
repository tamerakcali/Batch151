package practices;

import java.util.Scanner;

public class Reviuw01 {
    public static void main(String[] args) {

        //example:get the full name of the user and make all characters in upper cases.

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name and last name...");

        String fullName=input.nextLine().toUpperCase();
        
        System.out.println(fullName);


    }
}
