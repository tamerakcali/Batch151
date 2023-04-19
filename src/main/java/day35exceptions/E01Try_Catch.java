package day35exceptions;

public class E01Try_Catch {
    public static void main(String[] args) {

        System.out.println(convertStrToInt("123")+2);
        System.out.println(convertStrToInt("12ab")+2);//NumberFormatException,yani verdigimiz value sayi
                                                    // formatinda olmadigini belirtir.
    }

    //bir string i int ceviren method olusturunuz?
    public static int convertStrToInt(String str){
     //   return  Integer.valueOf(str); //valueOf string i int cevirir
//NumberFormatException valueOf() method'u non-digit character iceren
// bir String ile kullanildiginda atilir.

        try{
            return  Integer.valueOf(str);
        }catch (NumberFormatException e){
            System.out.println("do not use non-digit character");
            str=str.replaceAll("[^0-9]","");
        }

        return Integer.valueOf(str);
    }
}
