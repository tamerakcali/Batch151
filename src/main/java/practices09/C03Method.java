package practices09;

import java.util.Arrays;
import java.util.Scanner;

public class C03Method {
    public static void main(String[] args) {

     /*
   kullanıcıdan bir cumle sisteme girmesini isteyiniz.
   method olusturarak cumlede gecen sesli harfleri konsola yazdırınız
*/

        Scanner scan=new Scanner(System.in);
        String sentence=scan.nextLine();
        System.out.println("Please enter a sentence...");
        
        String arr[]=sentence.split("");
        System.out.println(Arrays.toString(arr));

        vovels(arr);

    }

    public static void vovels(String[] arr) {
        for(int i=0;i<arr.length;i++){//arr in uzunlugu kadar donguye aldik
            if(arr[i].equalsIgnoreCase("a")//elementler sesli harf mi kontrol ettik
            ||arr[i].equalsIgnoreCase("e")
            ||arr[i].equalsIgnoreCase("i")
            ||arr[i].equalsIgnoreCase("o")
            ||arr[i].equalsIgnoreCase("u")){
                System.out.print(arr[i]);



            }

        }


    }
}
