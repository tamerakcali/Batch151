package day03scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {


        //example: get the width, height and the length of rectangle prism  from user and calculate the total area of the rectangle prism?

        //the formule of rectangle prism: 2*w*l + 2*h*l + 2*w*h

        Scanner input = new Scanner(System.in);

        System.out.println("Enter width,height,length");

        double w = input.nextDouble();

        double l = input.nextDouble();

        double h = input.nextDouble();

        System.out.println("total area is" + (2 * w * l + 2 * h * l + 2 * w * h));

        //get the first name,middle name and last name from the user then print them

        System.out.println("Enter your firs name");

        String firstname = input.next();

        System.out.println("Enter your last name");

        String lastName = input.next();
        System.out.println("firsName = " + lastName);


        //type code to print "divisible by 5" if the number divided by 5, otherwise print" Not Divisible by 5" if the number not divided by 5.

        //1.way:
        int d = 15;
        if (d % 5 == 0)
            System.out.println("Divisible by 5");
        if (d % 5 != 0)
            System.out.println("Not Divisible by 5");
        //2.way:
        int k = 15;
        if (k % 5 == 0)
            System.out.println("Divisible by 5");
        else
            System.out.println("Not Divisible by 5");


        //type a code get from user and decide which stage on it.
        //0-4=baby
        //5-12=child
        //13-20=teenager
        //21-30=adult
        //else(not expected age)

        //scanner class ykarda acildigi icin tekrar acmadan devam edecez.
        System.out.println("Enter your age");

        byte age = input.nextByte();

        if (age < 0)
            System.out.println("Invalid age");
        else if (age <= 4)
            System.out.println("Baby");
        else if (age <= 12)
            System.out.println("Child:");


        else if (age <= 20)
            System.out.println("Teenager");
        else if (age <= 30)
            System.out.println("Adult");
        else
            System.out.println("not expected age");

        //if user enter 9 the code will print Semtember,October,October,November,December
        //if teh user enter 5 the code print May,Juni July,August,September,October,November,December

        //scanner yukarda oldugu icin tekrar acmiyorum.

        System.out.println("Enter month number");

        byte monthNum = input.nextByte();
        switch (monthNum) {
            case 1:
                System.out.println("January");

            case 2:
                System.out.println("February");

            case 3:
                System.out.println("March");

            case 4:
                System.out.println("April");

            case 5:
                System.out.println("May");

            case 6:
                System.out.println("Juni");
            case 7:
                System.out.println("July");
                //en son decemberi yazarken break i ekliyoruz ve default(if deki else ile bitiriyoruz)
                // break koymazsak sonraki code otomatikli yazilir by java.
            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Invalid month number");
                // create a simple calculater which does addition,subtraction,multiplication,division and percentage calculation.





        }

    }

}








