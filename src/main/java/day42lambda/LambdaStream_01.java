package day42lambda;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaStream_01 {

    //NOTE:normalde distinct elementleri depolamak icin set kullanilir.ama lambda daki collct(Collectors.toSet())
    //methodu elementleri random siralar,halbuki soruda natural order istenmisti.bu nedenle collect(Collectors.toList
    //  methodunu kullandik
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");
        System.out.println(sortWithLastCharDistinctUpperInList(names));

    }
//ex:list elementlerini son harflerine gore natural order da output:[MICHEL,JIM,TOM,ALEXANDER,ALEX,MERY]
// tekrarsiz olarak buyuk harfle bir listin icinde return ediniz?


    public static List<String> sortWithLastCharDistinctUpperInList (List<String> names){
        return names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                collect(Collectors.toList());//[MICHEL,JIM,TOM,ALEXANDER,ALEX,MERY]

}
//ex:list elementlerini character sayilarina gore ters sirada
    //kucuk harflerle bir list in icinde return ediniz. ayni character sayisina sahip
    //elementler kendi icinde natural order de olsun?
  /*   public static List<String> sortLengtReverLowInList(List<String> names){

         names.stream().
                 map(String::toLowerCase).
                 sorted().comparator.comparing(String::length).
                 reversed().
                 then.comparing(t->t.charAt(0))).
         collect(collectors.toList));//thenComparing
*/

    //ex:list elementlerinin tamaminin character sayisinin 2 den buyuk olup olmadigini control eden methodu olusturun

    public static  boolean isLengtMoreThenTwo(List<String> names){
        return  names.stream().allMatch(t->t.length()>2);//allMatch karsilastirma icin kullanilir.tersi icin noneMatch
                                                        //methodu kullanilir.
    }
//ex:list elementlerinin hic birinin character sayisinin 3 den buyuk olmadigini control eden methodu olusturun

    //ex:list elementlerinin en az birinin character sayisinin 4 den kucuk olup olmadigini control eden methodu olusturun.

    public static boolean atLeastOneMoreLesThenFour(List<String> names){

       return  names.stream().anyMatch(t->t.length()<4);//

    }



}






