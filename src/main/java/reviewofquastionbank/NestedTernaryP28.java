package reviewofquastionbank;

public class NestedTernaryP28 {
    public static void main(String[] args) {


  //qbanksoru6
        char y = 0;
        String str=(y>'a'&& y<'z') ? (y<'f' ? "good" :"bad") :(y>'K' ?"big" :"small");
        System.out.println("str = " + str);

        int a = 44;
        String result=(a%2!=0 && a<29) ? ("good") :("bad");
        System.out.println("result = " + result);
        
//soru7
              int i=1;
              int j=0;
              switch(i){
                  case 2:
                      j+=6;
                  case 4:
                      j+=1;
                  case 1:
                      j+=4;
                  default:
                      j+=2;
                      System.out.println("j = " + j);
                      
 //quastion8
                      char cjr='a';
                      switch(cjr){
                          case 'a':
                          case'A':
                              System.out.println("cjr = " + cjr);
                              break;
                          case 'b':
                          case 'B':
                              System.out.println("cjr = " + cjr);
                             break;
                          case 'c':
                          case 'C':
                              System.out.println("cjr = " + cjr);
                              break;
                          case'd':
                          case 'D':
                              System.out.println("cjr = " + cjr);

//quas9







                      }

                      String str1= "Java";
                      System.out.println(str1.replace("av","*"));

                      String s="Canan Can";
                      System.out.println(s.substring(3,3));









                      }

    }
}

