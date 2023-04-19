package practices;

import java.util.ArrayList;
import java.util.List;


public class List01 {
    public static  void main(String[] args) {
         /*
          İki Array'de ortak bulunan elementleri bir list'e ekleyiniz ve list'i yazdırınız.
          (case sensitivity olmadan)


          String[] arr = {"John","Brad","Angel","Sofia","Emily"};

          String[] brr = {"sofia","brad","grace","emily","hazel"};

          Output : [Brad,Sofia,Emily]

         */
        String[] arr = {"John","Brad","Angel","Sofia","Emily"};

        String[] brr = {"sofia","brad","grace","emily","hazel"};

     List<String> list=new ArrayList<>();

          for(String w:arr){
            for(String w1:brr){
             if(w.equalsIgnoreCase(w1)){
                 list.add(w);

             }
         }
     }
        System.out.println("ortak element" + list);

    }
}
