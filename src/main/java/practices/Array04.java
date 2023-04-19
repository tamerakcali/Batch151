package practices;

import java.util.Arrays;
import java.util.Scanner;

public class Array04 {
    public static void main(String[] args) {
   /*
        Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' elemanları bulan bir kod yazınız.

        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};

        output: min:-90, max:10001, ikincimax: 8787

       */
         int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
         Arrays.sort(arr);//[-95,0,1,100,845,898,8787,10001]
        System.out.println(Arrays.toString(arr));

        System.out.println("minimum"+arr[0]);//minimum -95
        System.out.println("maximum"+arr[arr.length-1]);//maximum10001
        System.out.println("ikinci max"+arr[arr.length-2]);//ikinci max=8787

   /*
        Hackerlar bazı harfleri sayılara cevirerek yazısabiliyorlar. Genellikle cevirdikleri harfler su sekilde:

        s -> 5
        a -> 4
        e -> 3
        i -> 1
        o -> 0

        ornegin:
         java ile hersey guzel
         j4v4 1l3 h3r53y guz3l

        Kullanıcıdan bir cumle alınız, 'hacker'ların konusma diline cevireniz.

        */

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter a sentence...");

        String sentence=scan.nextLine();

        String arry[]=new String[sentence.length()];

        for(int i=0;i<sentence.length();i++){
           arry[i]= sentence.substring(i,i+1);
            System.out.print(arry[i]);
        }
        System.out.println();

        for(int i=0;i<arry.length;i++){
            if(arry[i].contains("s'")){
                arry[i]="5";

            }
            if(arry[i].contains("a")){
                arry[i]="4";

            }
            if(arry[i].contains("e")){
                arry[i]="3";
            }
            if(arry[i].contains("i")){
                arry[i]="1";
            }
            if(arry[i].contains("o")){
                arry[i]="0";
            }
            System.out.print(arry[i]);
        }
        
    }
}
