package day15loopsarrays;

import java.util.Scanner;

public class NestedLoop01 {
    public static void main(String[] args) {

 /* //ex:   1.Example:Type code to get the output like
                                      Week: 1
                                        Day: 1
                                        Day: 2
                                        Day: 3
                                        .....
                                      Week: 2
                                        Day: 1
                                        Day: 2
                                        Day: 3
                                        ....
                                      Week: 3
                                        Day: 1
                                        Day: 2
                                        Day: 3
                                        ....

  */
        //1.WAY:nested loop ile;
        for(int i=1;i<4;i++){
            System.out.println("Week: " +i);

            for(int k=1;k<4;k++){
                System.out.println(" day: " +k);
            }

        }
        //2.WAY:nested while loop ile;
        int k=1;
         while(k<4){
             System.out.println("Week:" +k);
             while(k<4){
                 System.out.println(" day:"+k);


//ex:Write a Java Program to Print Rectangle Star Pattern using For Loop
//                        ****
//                        ****
//                        ****
//            Note: Get the number of the rows and the columns from user

                 Scanner input=new Scanner(System.in);
                 System.out.println("Please enter the number of rows");
                 int rw=input.nextInt();

                 System.out.println("Please enter the number of columns");
                 int clm=input.nextInt();

                 for(rw=1;rw<=rw;rw++){
                     System.out.print("* ");

                  for(clm=1;clm<=clm;clm++);

                 }
                 System.out.println();

 //ex: Type code to get the output like
                 //                        1
                 //                        1 2
                 //                        1 2 3
                 //                        1 2 3 4
                 //                        1 2 3 4 5

                 System.out.println("Please enter row number");
                 int rw1=input.nextInt();

                 for(int rw2=1;rw2<=rw1;rw2++){

                     for(int c1=1;c1<=rw2;c1++){
                         System.out.print(c1 +" " );
                     }
                     System.out.println();
                 }

             }
         }


          }
      }


