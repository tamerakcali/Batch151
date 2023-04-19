package day34exceptions;

public class E01 {
 /*
 EXCEPTION:unexpected problem demektir in IT
 1-exceptions lari cozmek icin iki temel yol vardir.
 a-"Exception handling";exception a uygun cozumler uretilebilir.
 b- "Throw Exception"Exception olustugunda, bunu ilan edip  geri cekilmek.
 c- Exception a ozel cozumlerde try-catch kullanilir.try block da yapilmasi gereken islemi
 java dan yapmasi istenir.java islemi sorunsuz yaparsa catch block java tarafindan okunmaz.
 catch block sorun olustugunda devreye girer ve catch block code okunur
 d-try-block icin de islem yaparken exception olusursa, sadece try-block code lar calismaz.
  arithmatic exception, matematiksel bir sorun olustugunda throw edilir.

  */
 public static void main(String[] args) {

 }
 //1.WAY:Exception handling;bu yol KULLANILMAZZZZZ!!!!!!
         public static int divide(int a,int b ){//method action oldugu icin ismi fiil verb olmalidir
             System.out.println(divide(12,3));
              if(b==0){
                  return 0;

              }else{
                  return a/b;
              }

         }
  //2.WAY:harika yol
  public static int divide1(int c,int d ){
      System.out.println(divide(6,0));
     int result=0;
     try{
         result=c/d;
     } catch (ArithmeticException e) {
         System.out.println("Do not divide any number by zero..");
         throw new RuntimeException(e);
     }
      return result;
  }

}
