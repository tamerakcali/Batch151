package day34exceptions;

public class E03 {
    public static void main(String[] args) {

        System.out.println(getNumOfChars("Java"));//4
        System.out.println(getNumOfChars(null));//exception throw edildi,cunku bazi string methodlar
                                                    //null ile calismaz
    }
 //Bir string deki character sayisini veren method olusturunuz?

    public static int getNumOfChars(String s){
        int result=0;
        try{
            result=s.length();

    }catch(NullPointerException e){
            System.out.println(e.getMessage());//getMessage methodu varsa  exception ile ilgili java teknik mesaj verir.
            return 0;

        }
            return result;
        }
}
