package day11nestedifternaryswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day name...");

        String dayName = input.next();

        //1.WAY:if ile;
        if (dayName.equalsIgnoreCase("Sunday")) {
            System.out.println("First day");
        } else if (dayName.equalsIgnoreCase("Monday")) {
            System.out.println("Second day");
        } else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println("Third");
        }else if(dayName.equalsIgnoreCase("Wednsday")){
            System.out.println("Fourth");
        }else if(dayName.equalsIgnoreCase("Thursday")){
            System.out.println("Fift");
        }
        else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println("Sixth");
        }else if(dayName.equalsIgnoreCase("Saturday")){
            System.out.println("Seventh");
        }else{
            System.out.println("Invalid day name");
            //2.WAY:Switch ile;

            switch(dayName){
                case "First":
                    System.out.println("Sunday");
                    break;
                case "second":
                    System.out.println("Monday");
                    break;
                case "third":
                    System.out.println("Tuesday");
                    break;
                case "fourth":
                    System.out.println("Wednsday");
                    break;
                case "fifty":
                    System.out.println("Thursday");
                    break;
                case "Sixth":
                    System.out.println("Friday");
                    break;
                case "seventh":
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("invalid day name..");
                    break;
            }
        }
    }

}









