package day35exceptions;

public class E02 {

    public static void main(String[] args) {

//try-catch methodlar icinde kullanilir.

        System.out.println(getCharFromStr("Java",8));//istedigimiz index string in lentgth inden
                                                            //uzun oldugu icin exception aldik.
                                                            //asagida da try ve catch ile cozduk.
    }

//bir string deki character i index kullanarak alan bir method olusturunuz?

     public static char getCharFromStr(String str,int idx){

        try{
            return str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){

            idx= Math.abs(idx);
            idx=idx&str.length();
            return str.charAt(idx);

        }



  }
}
