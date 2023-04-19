package day37exceptionsenums;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomExceptionRunner {



    public static void main(String[] args) throws IllegalGradetException {

        System.out.println(getGrades());

    }

//ex:student grades i bir list e ekleyen method u olusturunuz?

      public static List<String> getGrades() throws IllegalGradetException {
          List<String> grades = new ArrayList<>();

          Scanner input = new Scanner(System.in);

          String grade = " ";
          do {
              System.out.println("Please enter a grade");

              grade = input.next();

              if (!grade.equals("q")) {
                  int intGrade = Integer.valueOf(grade);

                  if(grades.equals("q")){
                      break;
                  } else if (intGrade >=0 && intGrade <=100) {

                      grades.add(grade);

                  } else {
                      throw new IllegalGradetException("Grade less then 0 and greater than 100 are not valid");
                  }

              }

          }while (!grade.equals("q")) ;
          return grades;
      }
    //ex:ussr in yasini consol ayazdiran code olusturunuz?
    public static void printAge(int age){

        if(age<0){
            throw new IllegalAgeException();
        }else{
            System.out.println("age = " + age);
            try {
                printAge(-45);
            }catch (IllegalAgeException e){
                System.out.println(e.getMessage()); //hata message yollayarak code un calismasina devam eder

}finally {
                System.out.println("i always work");
            }

    }
}
}
