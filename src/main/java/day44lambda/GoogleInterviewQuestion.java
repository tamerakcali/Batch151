package day44lambda;

import java.util.*;

public class GoogleInterviewQuestion {
    public static void main(String[] args) {

//ex:size verilen bir array in mountain array olup olmadigini gosteren code yaziniz?
 //       (google interview question)
 //==>[0,2,5,3,1,-2]

     int []arr={0,2,5,3,1,-2} ;

 //step 1:once array i liste cevirelim.cunku list daha kolaydir

        List<Integer> mylist=new ArrayList<>();

        Arrays.stream(arr).forEach(t->mylist.add(t));//array i list e cevirdik
        System.out.println("mylist = " + mylist);//[0,2,5,3,1,-2]

//step 2: simdi max elementi bulalim

    int max= mylist.stream().reduce(Math::max).get();//5

 //step3:list deki max elementin index ini bulmaliyiz.
    int idxOfMax=mylist.indexOf(max);
        System.out.println("idxOfMax = " + idxOfMax);//2

//step 4: max a kadarki elementleri bir list e koyalim
     List<Integer> firstList=new ArrayList<>();
     mylist.stream().filter(t->mylist.indexOf(t)<=idxOfMax).forEach(t->firstList.add(t));
        System.out.println("firstList = " + firstList);//

//first list copy olusturduk
    List<Integer> firstListCopy=new ArrayList<>();
    firstList.stream().forEach(t->firstListCopy.add(t));
        System.out.println("firstListCopy = " + firstListCopy);

//copy olan list i sort edildi
        Collections.sort(firstListCopy);

 //firslist ile copy nin ayni olup olmadigini control ettik,boylece cikis ve inis trendini bulduk
        boolean rule1=firstList.equals(firstListCopy);
        System.out.println("rule1 = " + rule1);

        //Maximum elemandan sonraki tum elemanlari bir List'in icine koy

        List<Integer> secondList = new ArrayList<>();
     //   myList.stream().filter(t->myList.indexOf(t)>=idxOfMax).forEach(t->secondList.add(t));
        System.out.println(secondList);

        //secondList'in copy'sini olustur
        List<Integer> secondListCopy = new ArrayList<>();
        secondList.stream().forEach(t->secondListCopy.add(t));
        System.out.println(secondListCopy);

        //secondListCopy'i ters olarak sirala
        Collections.sort(secondListCopy);
        Collections.reverse(secondListCopy);
        System.out.println(secondListCopy);

        //secondList ile secondListCopy ayni mi diye kontrol et
        boolean rule2 = secondList.equals(secondListCopy);
        System.out.println(rule2);

        System.out.println("Is the array mountain array? " + (rule1&&rule2));
    }
}




