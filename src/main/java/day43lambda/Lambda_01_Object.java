package day43lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda_01_Object {

    public static void main(String[] args) {

        Course turkishDay=new Course("turkishDaytime QA",213,"Spring",97);
        Course turkishNight=new Course("turkish Nighttime QA",245,"Winter",98);
        Course englishDay=new Course("english Daytime Java Dev",121,"Spring",91);
        Course englishNight=new Course("english Nightytime Java Dev",137,"Winter",95);

        List<Course> courseList=new ArrayList<>();

        courseList.add(turkishDay);
        courseList.add(turkishNight);
        courseList.add(englishDay);
        courseList.add(englishNight);

        System.out.println(isAvgScoreGreaterThanANumber(courseList,92));//false aldik cunku bir tane sarti
        //saglamayan oldugu icin .92 user dan gelen avg score ornek yani

        System.out.println(isAnyCourseNameContainsQA(courseList, "QA"));//

        System.out.println(getCoursenameWhoseAvgMax(courseList));//turkish Nighttime QA

        System.out.println(getCourseBetterThanLastTwo(courseList));//

        System.out.println( getHighestThird(courseList));//

    }
//ex:tum avarage score larin 90 dan buyuk olup olmadigini control ediniz?

   public static boolean  isAvgScoreGreaterThanANumber(List<Course> courseList,int avg){

      return  courseList.stream().allMatch(t->t.getAverageScore()>avg);

   }
   //ex:en az bir course isminin QA contains oo not u control eden methodu olusturun?

    public static boolean isAnyCourseNameContainsQA(List<Course> courseList,String word){
        return courseList.stream().anyMatch(t->t.getCourseName().contains(word));

    }
//ex:en yuksek avg score sahip course ismini veren code u yaziniz?

 public static String getCoursenameWhoseAvgMax(List<Course> courseList){
        Course course= courseList.
                       stream().
                        sorted(Comparator.
                        comparing(Course::getAverageScore).
                        reversed()).findFirst().
                        get();
        return course.getCourseName();//turkish Nighttime QA
 }
//ex:avg score u en dusuk olan ilk iki kurs disindaki tum courses return eden methodu olusturunuz?

   public static List<Course> getCourseBetterThanLastTwo(List<Course> courseList){

      return  courseList.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(2).collect(Collectors.toList());
   }
//ex:avg score u ustten 3. olan kursu veren methodu olusturunuz?

public static Course getHighestThird(List<Course>courseList){
      return  courseList.stream().
              sorted(Comparator.
              comparing(Course::getAverageScore).
              reversed()).skip(2).//ilk ikiyi atlar
              limit(1).//kalanlarin ilkini verir
              collect(Collectors.toList()).//collector.toList stream i list ecevirmek icin kullanilir.
              get(0);
}

}
