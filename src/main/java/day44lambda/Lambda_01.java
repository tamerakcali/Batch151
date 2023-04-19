package day44lambda;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda_01 {
    public static void main(String[] args) throws IOException {
  /*
    Notlar :

           1) lines methoduna dosya yolunu yazmak için Paths classından get methodunu kullanmalıyız.
           2) foreach() methodu ile satır satır okuma yaptık.
           3) Files classındaki lines methodu datayı Stream olarak verir. Bu sebeple stream'deki bütün
              methodları burada kullanabiliriz.
          4-flatMap() array i kaldirip stream a cevirir.
          5-bazi methodlar dan sonra nokta yazilirsa baska method olmayabilir. bu methodlara
          terminal method denir.

 */

 //ex:verilen text file icindeki texti consola yazdiran codu yaziniz?

        Files.lines(Paths.get("src/day44lambda/myTextFile.txt")).forEach(System.out::println);

        //lines methodu Paths.get ile calisir.bu method tum text i yazdirir.
        //Satirlar oldugu icin "ln" i silmedik//bu method ile character degil tum satirlari yazdiririz.

//ex:verilen bir text file icindeki text i buyuk harflerle consola yazdiran code u yaziniz?

        Files.lines(Paths.get("src/day44lambda/myTextFile.txt")).map(String::toUpperCase);

//ex:verilen text file icindeki text lerde "Java" kelimesinin olup olmadigini control eden code yaziniz?

       boolean r1= Files.lines(Paths.get("src/day44lambda/myTextFile.txt")).
                anyMatch(t->t.contains("Java"));//true

//ex:verilen text file icindeki text lerde kullanilan farkli kelimeleri bir list icinde return ediniz?

        List<String> words = Files.
                lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("\\p{Punct}", "")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                distinct().
                collect(Collectors.toList());
        System.out.println(words);

//ex:verilen text file icinde toplam kac harf kullanildigini gosteren code  yaziniz?

      Long numOfLetters=  Files.lines(Paths.get("src/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^A-za-z]","").
                        split("")).
                flatMap(Arrays::stream).count();//161

 //ex:verilen text file icindeki tum harfleri alfabetik olarak ters sirada bir listin icinde
 //return eden code u yaziniz?
      List<String> naturalOrderOfLetter=  Files.lines(Paths.get("src/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^A-Za-z]","").
                        split("")).
              flatMap(Arrays::stream).
              sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("naturalOrderOfLetter = " + naturalOrderOfLetter);

 //ex:(google interview sorusu


    }
}
