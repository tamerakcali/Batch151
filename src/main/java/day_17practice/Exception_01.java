package day_17practice;

import java.util.Scanner;

public class Exception_01 {
// Kullanıcıdan istedigi kadar sayiyi alıp toplayan bir program yazınız
    // toplam 500'u gecerse programı bitirsin veya
    // kullanıcı bitirmek istediginde Q'ya basmalıdır

public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);

    int sum=0;

    do{
        System.out.println("Please enter numbers");
        System.out.println("to skip press Q");

        int number=0;
        try {
            number=scan.nextInt();
        } catch (Exception e) {
            String falseEntry=scan.next();//
            if(falseEntry.equalsIgnoreCase("q")){
                break;
            }else{
                System.out.println("False Entry");
            }
        }
      sum+=number;

    }while(sum<500);
    System.out.println("sum = " + sum);//181
}

}
