package practices;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        
      ArrayList<String> myList=new ArrayList<>();
      
      myList.add("A");
      myList.add("B");
      myList.add("C");
      
      String letter="C";
       if(myList.contains(letter)){
           myList.set(myList.lastIndexOf(letter),"buldum");
           System.out.println("buldum" );
       }else{
           myList.add(letter);
           System.out.println("letter = " + letter);

/* INTERWIEW SORUSU
     Adada yalnız bir maymun var
    Her gün 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.
 */
      int numOfBanan=165;
      int surviDay=1;
      boolean aliveStill=true;


      do{
          numOfBanan-=4;
          System.out.println("Rest of banana:"+numOfBanan);
          surviDay++;
          if(numOfBanan<4){
              boolean notAlive=false;
              System.out.println("not alive");
          }else{
              System.out.println("alive");
          }
          {

          }



      }while(aliveStill);

       }
      
      
      
              
        
    }
}
