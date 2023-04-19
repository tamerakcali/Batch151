package javaders.day05typecastingasciivaluestringmanipulations;

public class C02_AsciiValue {

    public static void main(String[] args) {

        //char 'A' karakterinin ascii degerini hesaptan code i yaziniz.
        
        int asciiDegeriA  = 'A';
        System.out.println("asciiDegeriA = " + asciiDegeriA);
        
        //dolayisiyla Ascii degeri bulmak icin int bir container icine koyup yazdirirarak buluruz.
        // yani ascii value olusturarak.
        
        int asciiDegerUnlem ='!';
        System.out.println("asciiDegerUnlem = " + asciiDegerUnlem);
        
        char rakam = '9';
        System.out.println("rakam = " + rakam);

        String name="100";
        int number=998;
        System.out.println(name + number);
        // burda onemli olan String olmasi cift tirnak icine alirsak rakam da olsa bu String dir.

        //NOTE: bir sayisal data ile char veya String datayi eger karsilastirirsak,
        //  java byte container icindeki sayinin gercek degerini degil Ascii tablosu degerini esas alir ve
        // karsilastirma yapar.asagidaki gibi.Yani byte 5 i esas almaz,5 in ascii degerini esas alir.
         byte sayi =5;
         char h='h';
        System.out.println("h<sayi :"+(h<sayi));

        //java char bir data ile String bir datayi karsilastirma yapmaz. cunku ikisi de bir karakter veya resimdir.
        // dolayisiyla resim ile resim veya karakter ile karakteri karsilastirmaz.
        //ancak bir char veya String data ile numerik herhangi bir datayi compare(kiyas) yapar.





    }

}

