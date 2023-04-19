package day18constructorsstatickeyword;

import java.time.LocalDateTime;

public class StaticNonStaticBlocks01 {
  /*
  STATIC BLOCKS:
  1-static blocks, static variables a ilk degerlerini assign(initialize) icin kullanilir.

  2-static variables static blocks olmadan da "initialize" edilebilirler.
  public static double pi=3.14;
  3-static bir variables e deger atamak icin code yazmamiz  gerekirse "static block" kullaniriz
  4-static block method icindeki code dan once yazdirilir.Birden fazla ise ustteki once calisir.
 NON-STATIC BLOCKS:

   */
  // 2-static variables static blocks olmadan da "initialize" edilebilirler
//asagidaki gibi static bir variables e deger atamk icin code yazmamiz  gerekirse "static block" kullaniriz
  public static double price;
   static{
      // LocalDate d=LocalDateTime.now(){
        //   if(d.getMonthValue()==3){
               price=1000;

           //}else{
             //  price=1200;
           }

       }


