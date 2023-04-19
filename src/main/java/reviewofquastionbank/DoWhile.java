package reviewofquastionbank;

public class DoWhile {
    public static void main(String[] args) {

        int i=1;
        do{
            if(i==3){
                continue;
            }else if(i==5){
                System.out.print(i+" ");
                break;
            }else{
                System.out.print(i+" ");
            }
            i++;
        }while(true);


    }
}
