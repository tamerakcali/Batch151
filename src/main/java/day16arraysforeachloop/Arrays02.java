package day16arraysforeachloop;

import java.util.Locale;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        //ex:user addition,subtraction,multiply and division yapabilecegi bir
        //hesap makinesi code u yaziniz.

        Scanner input = new Scanner(System.in);
        char opr=' ';
        do {
            System.out.println("Please enter your destination operation among +,-,*,%");
            opr = input.next().toLowerCase().charAt(0);
            if(opr=='q'){
                System.out.println("See you again");
              break;
            }
            boolean r=opr=='+' && opr=='-' && opr=='*' && opr=='%';
            if(!r){
                System.out.println("Undefined repetition");
                break;
            }
            System.out.println("Please enter your first number...");
            int num1 = input.nextInt();

            System.out.println("Please enter your second number");
            int num2 = input.nextInt();

            {
                switch(opr){
                    case '+':
                        System.out.println(num1 + "+" +num2 +"=" +(num1+num2));
                        break;
                    case '-':
                        System.out.println(num1 + "-" + num2 + "=" +(num1-num2));
                        break;
                    case'*':
                        System.out.println(num1 + "*" + num2 + "=" +(num1*num2));
                        break;
                    case '%':
                        System.out.println(num1 + '%' +num2 +"%" +( num1%num2));
                        break;



                }
            }
    }while(true);

    }
}

