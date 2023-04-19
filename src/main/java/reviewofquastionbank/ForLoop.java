package reviewofquastionbank;

public class ForLoop {
    public static void main(String[] args) {
//Q7
        int y = 1;
        for (int i = 0; i < 4; i++) {
            y += i;
            System.out.println(y);

//Q10
            String s = "Love";
            for (i = s.length() - 1; i >= 0; i--) {
                System.out.print(s.charAt(i));
                i--;


//Q11
                int i1 = 1;
                while (i1 <= 7) {

                    i1++;
                    System.out.println("Hello");
                      }



//Q12 2 4 6 8 yazdiran codu yazdiriniz?
                //1.WAY:while ile;


                int k=1;
                while(k<=8){
                    if(k%2==0){
                        System.out.print(k+" ");
                        k++;

//2.WAY:for ile
                    int k1=1;
                    for(int i2=1;i2<5;i2++){

                        System.out.println(2*k1+" ");
                    }

                  }


                }

            }


        }
    }


}

