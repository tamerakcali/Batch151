package day35exceptions;

public class E03 {
    public static void main(String[] args) {

/* //exception larda child parent iliskisi varsa, yani "sadece exception"(buyuk exception) ile diger exceptionlar birlikte
 //kullanildiginda child exception daha yukarida kullanilmali,yazilmalidir.
 //******yani exception class tum diger exceptionlarin parentidir.*****

        //valueOf() bos String'de de NumberFormatException hatasi verir
//Bir method'dan 2 farkli exception alma ihtimalimiz var. Ikisini birden handle etmemiz gerekir.
//valueOf() method'una sayi olmayan bir deger atanirsa "NumberFormatException" hatasi alinir.
//"Exception" tum exception'lari kapsayan genel bir exception turudur. 911 gibi...
//Excaption'a ozel durumlarda farkli "catch block"lar kullanmamiz gerekebilir
//"catch block"lar arasinda parent-child iliskisi varsa child yukarida parent asagida olmalidir.
 //       Eger bu iliski yoksa "catch block"lar arasinda siralamanin onemi yoktur
//"Exception Class" tum exception classlarin parent'idir.
 1-catch block tan sora coklu catch kullanilabilir
 2-chil-parent iliskisi yoksa catch blocklar istenildigi gibi kullanilabilir.
 3-exception class tum diger exceptionlarin parentidir.coklu catc block kullanmak yerine, istenilen
 task a gore  fonksiyonu karsiladigi surece tek catch block u exception class ile kullanilabilir.
 4-try+multi-catch olur,try+1 catch olur,ancak tek try olmaz, sadece try tek basina kullanilamaz.
 5-try, catch block olmadan ancak try+finally olarak kullanilabilir.

 */












        //ex:bir string i int e ceviren ve bu int i string in length nin 1 eksigine bolen method olusturunuz?

        System.out.println(convStrToIntDiviByLength("2"));

    }

    public static int convStrToIntDiviByLength(String str){
        int result=0;
        try {
            int a = Integer.valueOf(str);//digit disinda verilen degerlerde bu method da numberFormatException aliriz
                                         //cunku valueOf sadece digitlerle calisir.
            result= a / (str.length() - 1);

        }catch (NumberFormatException e){
            System.out.println("non-digit do not use");

    }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return result;
    }
  //2.Senaryo 112 aramak gibi olan sadeceexception
    public static int convStrToIntDiviByLength1(String str){
        int result=0;
        try {
            int a = Integer.valueOf(str);//digit disinda verilen degerlerde bu method da numberFormatException aliriz
                                          //cunku valueOf sadece digitlerle calisir.

            result= a / (str.length() - 1);

        }catch (Exception e){//sadece exception tum exceptionlar yerine kullanilir
            System.out.println(e.getMessage());

}
        return result;
    }
}

