package day12switchincrementdecrementloops;

import java.util.Scanner;

public class Switch02 {

   public static void main(String[] args) {
   //ex:user dan aldiginiz character in sesli harf olup olmadigini control eden code u yazdiriniz.
        Scanner  input=new Scanner(System.in);
        System.out.println("Please enter a letter...");
        char letter=input.next().charAt(0);
//1.WAY:
        switch(letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("This is a vowel letter..");
                break;
            default:
                System.out.println("This is  not vowel letter");
   //2.WAY:

     /*           System.out.println("Please enter a letter...");
                String letter2=input.next().substring(0,1).toLowerCase();
                switch(letter) {
                    case "a":
                    case "e":
                    case "i":
                    case "o":
                    case "u":

                        System.out.println("This is a vowel letter..");
                        break;
                    default:
                        System.out.println("This is  not vowel letter");8/

    //3.WAY:
/*
                        System.out.println("Please enter a letter...");
                        String letter3=input.next().substring(0,1).toLowerCase();
                        switch(letter) {
                            case "a":
                            case "e":
                            case "i":
                            case "o":
                            case "u":

                                System.out.println(letter3 +" is a vowel");
                                break;
                            default:
                                System.out.println(letter3 + " is  not a vowel letter");*/


                }



        }

    }

