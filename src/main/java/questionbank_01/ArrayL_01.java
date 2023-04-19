package questionbank_01;

import java.util.ArrayList;

public class ArrayL_01 {

    public static void main(String[] args) {

      ArrayList <String> list=new ArrayList<>();
      list.add("A");
      list.add("B");
      list.add("C");
      list.add("D");
      
  //    list.set(2,"C");//set verilen index deki elemani silip yerine yenisini set eder.
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");

        }


      




    }
}
