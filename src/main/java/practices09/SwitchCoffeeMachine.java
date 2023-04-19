package practices09;

import java.util.Scanner;

public class SwitchCoffeeMachine {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please select your coffee");
          int coffee=input.nextInt();

          String whichCoff="";


        switch(coffee){

            case 1:
                whichCoff="Turkish coffee";
                System.out.println("Turkish Coffee is been preparing");
                break;
             case 2:
                 whichCoff="Filter coffee";
                 System.out.println("Filter coffee is been preparing");
                 break;
            case 3:
                whichCoff="Espresso";
                System.out.println("Espresso is been preparing");
                break;
            case 4:
                whichCoff="Cappuccino";
                System.out.println("Cappuccino is been preparing");
                break;
                default:
                System.out.println("your selected coffee is out of service");
                break;

        }

        System.out.println("Please select your coffee size");

        int size=input.nextInt();
        String whatSize ="";

                switch(size){
                    case 1:
                        whatSize="Large";
                        System.out.println("selected large size");
                        break;

                    case 2:
                        whatSize="Medium";
                        System.out.println("Selected medium size");
                        break;
                    case 3:
                        whatSize="Small";
                        System.out.println("Selected small size");
                        break;
                    default :
                        System.out.println("Selected size is out of service");
                        break;


                }
        System.out.println("Would you like milk");
                String milk= input.next();
                if(milk.equalsIgnoreCase("Yes")){
                    System.out.println("Your milk is been preparing");
                }else{
                    System.out.println("Without milk");
                }
        System.out.println("Would you like suger");
                String suger=input.next();
                if(suger.equalsIgnoreCase("Yes")){
                    System.out.println("Suger is been adding");
                }else{
                    System.out.println("Without suger");
                }


    }



}
