package reviewofquastionbank;

public class IfElse01 {
    public static void main(String[] args) {

        int x=4;
        long y=x*4-(x+1);

        if(y<11){
            System.out.println("Too low...");
        }else if(x>11){
            System.out.println("Too high..");
        }else{
            System.out.println("Just right.");

            int x1=6;
            int result=x1>3?x1<5?11:9:8;
            System.out.println("result = " + result);

            int p=1;
            int z=p+=5;
            System.out.println(z);

            int i=1;
            do{
                if(i==3){
                    continue;
                }else if(i==5){
                    System.out.println(i+"");
                    break;

                }else{
                    System.out.println(i+"");
                }
                i++;
            }while(true);


        }

    }
}
