package day36exceptions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

  /*
 1-RUNTIME EXCEPTION: Run edildikten sonra consol da alinan exceptionlara "Runtime Exception" denir
 Bunlara "Unchecked Exception" da denir.
a-NumberFormatException
b-ArrayIndexOutOfBoundsException
c-StringIndexOutOfBoundsException
d-NullPointerException

2- COMPILE TIME EXCEPTION:  Code yazarken red underscore seklinde alinan exceptionlara da "Compile Time Exception" denir
Bunlara "Checked Exception" da denir.
a-FileNOtFoundException:
Java ya bir dosyayi bul denildiginde, java dosyanin adresi ve dosyanin varligi konusunda hata olusursa
ne yapmasi gerektigini bilmek ister.

b-IOException:IO input output demektir,

NOTE:IO exception, FileNotFound Exception in parent tidir.

3-Java da errors temelde ikiye ayrilir.
a- exceptionlar,cozumu olan hatalardir
b- errors. asla handling edilemez code un olumudur.Ornek;
-StackOverFlow error stac memory dolmussa.
-OutOfMemory error.memory dolmussa
-Virtual Machine error;makine de hata olursa

  */

    public static void main(String[] args) throws IOException {
 //1.WAY: exception u method signture ye ekledik
      FileInputStream fis=new FileInputStream("");

      int i =0;

      while ((i=fis.read())!=-1){//read methodu tum okuma bittiginde -1 dondurur. sonunda -1!=-1 false
                                //oldugu icin loop kirilir ve islem biter onun icin while icine -1 koyduk.
            System.out.print((char)i);
      }


    }
}
