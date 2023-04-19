package day_41lambda;

import day40lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Lambda_01 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);
/*
        System.out.println(GetSqueOddSum1(nums));//
        System.out.println(GetSqueEveSum2(nums));//

    }
    //main
    //ex:verilen bir list deki tek sayi olan elemantlerin kareleri toplamini hesaplayan method olusturunuz?

    public static int GetSqueOddSum(List<Integer>nums){
      return  nums.stream().
              filter(t->t%2!=0).
              map(t->t*t).
              reduce(0,(t,u)->t+u);//




    }
    //ex:verilen bir list deki cift sayi olan elementlerin tekrarsiz olarak kareleri carpimini method ile yazdirin?

    public static int GetSqueEveSum(List<Integer>nums){
       return nums.
               stream().
               (t->t%2==0).
                map(t->t*t).
                distinct().
                reduce(t,u->t*u);//reduce methodu islemler
        //sonrasinda sonucu tek sayiya indirgendiginden, dort islem ve benzeri sonucu teke indirgeyen islemlerde
        //kullaniriz.

    }

//ex:verilen bir list deki cift sayi olan elementlerin maximum degeri ile tek sayi olan elementlerin
//mimimum degerinin toplamini method ile yapiniz?
      public static int GetTheSumOfEven(List<Integer>nums){


          int maxeven= nums.stream().filter(t->t%2==0).reduce(t,u)->t>u?t:u).get();

        int minOdd=nums.stream().filter(t->t%!=0).reduce(t,u)-t<u?t:u).get();
        return maxeven+minOdd;



   }
//ex:bir listdeki coft sayi olan elementlerin 7 den kucuk maximum degeri ile tek sayi olan element
    //lerin 8 den buyuk minimum degerinin toplamini method ile hesaplayini?

    public static int getMaxMinOdEven(List<Integer>nums){
       int maxEv= nums.stream().filter(t->t%2==0 && t<7).reduce(t,u)->t>u?t:u).get();
       int minOd=nums.stream().filter(t->t%2!=0 && t>8).reduce(t,u)->t<u?t:u).get();
       return maxEv+minOd;

    }
    public static int GetSqueOddSum1(List<Integer>nums){
        return  nums.stream().
                filter(t->t%2!=0).
                map(Utils::getSquare).
                reduce(0,Math::addExact);//":: method ismi"==>bu methoda "method reference" denir.Method reference
                lambda nin kullanildigi her yerde kullanilir.

}
    public static int GetSqueOddSum2(List<Integer>nums) {
        return nums.stream().
                filter(t -> t % 2 != 0).
                map(t->t*t).
                reduce(0, Math::addExact);//
    }
    public static int GetSqueOddSum3(List<Integer>nums) {
        return nums.stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                reduce(Math::addExact).get();//get i cagirarak da baslangic reference den kurtulduk.yani optional<Integer>
                Integer a cevirir.
*/
}
}


