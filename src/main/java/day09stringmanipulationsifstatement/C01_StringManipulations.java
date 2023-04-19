package day09stringmanipulationsifstatement;

public class C01_StringManipulations {
    public static void main(String[] args) {
        //isEmpty() methodu:
        
        //bir stringin hic karakter icermedigini gosteren kodu yaziniz.
        
        //1.Way :lentgh()methodu ile;
        
        String str="";
        boolean bosMu=str.length()==0;//burda iki islem yapti java. once length ile uzunlugu, sonra 0 a esitmi degilmi kontrol etti.
        
        //2.Way:isEmty() methodu ile;
        boolean bosMu2=str.isEmpty();
        
        //ex:bir stringin bosluk haric hicbir karakter icermedigini check eden kodu yaziniz.
         
        String str2=" ";
         //1.Way:length methodu ile;
        boolean str3=str2.replaceAll(" ","").length()==0;
        
        //isEmty methodu ile;
        
        boolean str4=str2.replaceAll(" ","").isEmpty();
        System.out.println("str4 = " + str4);

        //3.Way:

        boolean str5=str2.isBlank();
        System.out.println("str5 = " + str5);

        //indexOf() methodu;

        //ex:bir stringde a,b,e karakterlerinin ilk gorunumlerinin
        // indexleri toplamini ekrana yazdiriniz.

        String r="Java is easy to learn";

        int aIdx=r.indexOf('a');
        System.out.println("aIdx = " + aIdx);

        int bIdx=r.indexOf('b');
        System.out.println("bIdx = " + bIdx);

        int eIdx=r.indexOf('e');
        System.out.println("eIdx = " + eIdx);


        System.out.println(" aIdx + bIdx + eIdx : = " +(aIdx+bIdx+eIdx));

        //lastIndexOf() methodu:
        //ex:bir stringde a,b,e karakterlerinin son gorunumlerinin indexleri
        //toplamini ekrana yazdiriniz.

        int aLastDx=r.lastIndexOf('a');
        System.out.println("aLastDx = " + aLastDx);

        int bLastDx=r.lastIndexOf('b');
        System.out.println("bLastDx = " + bLastDx);

        int eLastDx=r.lastIndexOf('e');
        System.out.println("eLastDx = " + eLastDx);


        System.out.println(" aLastDx + bLastDx + eLastDx : = " +( aLastDx + bLastDx + eLastDx));














    }
}
