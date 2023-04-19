package day15loopsarrays;

import java.util.Arrays;

public class Arrays01ForEach {
    public static void main(String[] args) {
 //1-array nasil olusturulur

        String stdNames[]=new String[5];

 //2-array nasil yazdirilir.
        System.out.println(Arrays.toString(stdNames));

//3-Array e nasil eleman eklenir.
        stdNames[0]="ajda";
        stdNames[3]="cuneyt";
        System.out.println( Arrays.toString(stdNames));

//4-Array deki specific bir elemani nasil alabiliriz.
        System.out.println((stdNames[3]));


        //ex:stdNames array deki her ismin sonuna * koyarak yazdiriniz.
//1.WAY:
        for(int i=0;i<stdNames.length;i++){
            System.out.println(stdNames[i] +"*");

//2.WAY:for-each loop ile diger adi enhanced(zenginlestirilmis)

       for(String w :stdNames){
           System.out.println(w +"*");

 //ex:bir int array olusturunuz,5 eleman ekleyiniz, elemanlarin toplamini bulup yazdiriniz.

      int ages[]=new int[5];

      ages[0]=12;
      ages[1]=23;
      ages[2]=9;
      ages[3]=38;
      ages[4]=27;

      int sum=0;//yeni bir data elde edecegimiz icin sum adinda yeni bir int olusturuyoruz
      for(int w1:ages){
          sum= sum + w1;
          System.out.println(sum);//109
//ex:bir char array olusturunuz, 3 eleman ekleyiniz,elemanlarin carpimini yazdiriniz.
          char mlt[]=new char[3];
          mlt[0]='J';
          mlt[1]='P';
          mlt[2]='A';

          int sum1=1;//1 carpmanin, 0 toplamanin etkisiz elemani oldugu icin burda 1 yazdik.
                     //yeni bir data elde edecegimiz icin yeni bir variable olusturduk.

          for(char w2 : mlt){
              sum1=sum1*w2;
              System.out.println(sum1);




          }


      }

       }

        }
    }
}
