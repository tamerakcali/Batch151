package day37exceptionsenums;

public class IllegalGradetException extends Exception{
 /*
 1-Custom exception(kendi olusturdugumuz classlar) olusturmak icin exception class a
 extends etmeliyiz.exception class a extends ederek olusturulan Custom Exception "Compile Time Exception " olur
 2-Custom Exception class olustururken constructor olusturulmalidir. bu constructor, parent daki
 constructor u call yapmalidir.Bu constructor, message verecek ya da vermeyecek diye olusturulabilir.
 3-Custom exception class olusturuldugunda, ismin sonunda "exception" word  kullanilmalidir.
 bu class isminde oldugu  gibi.
  */



    public IllegalGradetException(String message){
        super(message);
    }
    public IllegalGradetException(){
        super();
    }

}
