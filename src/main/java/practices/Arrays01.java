package practices;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {


        String name[] = {"Ali", "Veli", "Hasan"};
        System.out.println(Arrays.toString(name));

        int num[] = {1, 2, 3};
        int sum = 0;
        for (int w : num) {
            sum = sum + w;
        }
        System.out.println("sum = " + sum);

        //  String word="bugun hava oldukca guzel";





   int sayi[][]={{1,2,3},{4,5,6}};

   int carpma=1;
   for(int[] w:sayi){
       for(int k:w){
           carpma=carpma*k;
           System.out.println(carpma);

       }
   }
     }


    }

