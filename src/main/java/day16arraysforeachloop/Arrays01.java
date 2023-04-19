package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

 //ex:user in  coklu datayi bir array e yerlestirebilmesi icin gerekli code u yaziniz.
  /*  1-scanner object olusturmaliyiz cunku user dan alicaz
      2-coklu datayi yerlestirmek icin bir array olusturmaliyiz
      3-array olusturmak icin user dan data sayisini mutlaka almaliyiz.
      4-loop olusturup eleman ekleme islemini tekrarlamaliyiz.
  */
        Scanner input=new Scanner(System.in);
        System.out.println("to stop adding press 'q'");
        System.out.println("Please enter your elements number");

        int  numOfElements=input.nextInt();

        String stdNames[]=new String[numOfElements];

        for(int i=0;i<stdNames.length; i++){
            System.out.println("Please enter the " + (i+1) + ".student name");



            String name=input.next();

            if(name.equalsIgnoreCase("q")){
                break;
            }else{
                stdNames[i]=name;
            }

        }
        System.out.println(Arrays.toString(stdNames));
    }

}
