package day15loopsarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

   //Arrays i kisa yoldan nasil olustururuz.
 //ex
        int grades[]={67,98,100,34,76};
        System.out.println(Arrays.toString(grades));
//ex: grade arrayindeki en kucuk ve en buyuk arrayin toplamini yazdiriniz.

 //once bunlari bir siralayacagiz.
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));//34,67,76,98,100

        System.out.println(grades[0] + grades[grades.length-1]);

//ex:size verilen bir String array deki isimlerden 5 karakterden az karakter icerenleri
//consola yazdiriniz.
        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for(String w :stdNames){

            if(w.length()<5){
                System.out.println(w);

//ex:size verilen String  array indeki isimleri alfabetik siraya koyduktan sonra
//'F' ile baslayan isimlerden onceki isimleri consola yazdiriniz.

       Arrays.sort(stdNames);//Ajda,Ayhan,Cuneyt.

       for(String w1 : stdNames){
           System.out.println(w1);
        if(w1.startsWith("F")){
            break;
        }


//ex:   size verilen String  array indeki isimleri alfabetik siraya koyduktan sonra
//'F' ile baslayan isimlerden oncekileri ve "F" ile baslayanlari consola yazdiriniz

      /*       Arrays.sort(stdNames);
             for(String w2:stdNames){
             System.out.println(w2);
              if(w2.startsWith("F")){
               break;
*/
//ex:  size verilen String  array indeki isimleri alfabetik siraya koyduktan sonra
//'F' ile baslayan isimler haric diger isimleri consola yazdiriniz

           // Arrays.sort(stdNames);

             //   for(String w3:stdNames){

             //   if(w3.startsWith("F")){
               //     continue;
              //  }else {
                   // System.out.println(w3);
                }


            }




           }
       }

            }







