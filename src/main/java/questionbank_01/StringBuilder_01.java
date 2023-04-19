package questionbank_01;

public class StringBuilder_01 {
    public static void main(String[] args) {
        
        
        StringBuilder strbld=new StringBuilder(6);//
        strbld.append("Learn");
        strbld.append("Java");
        System.out.println("strbld = " + strbld);//LearnJava

        StringBuilder strbld1=new StringBuilder("Learn Java");

        strbld1.substring(3);
        System.out.println("strbld1 = " + strbld1);//Learn Java

        strbld1.insert(0,"You");
        System.out.println("strbld1 = " + strbld1);//YouLearn Java

        strbld1.delete(5,9);
        System.out.println("strbld1 = " + strbld1);//YouLeJava

        StringBuilder strbld2=new StringBuilder("LearnJava");
        strbld2.setCharAt(5,'L');
        System.out.println("strbld2 = " + strbld2);//LearnLava

        StringBuilder strbld3=new StringBuilder(7);
        strbld3.append("Java");
        System.out.println(strbld3.capacity()+","+strbld3.length());//

        StringBuilder strbld4=new StringBuilder("LearnJava");

        int index=strbld4.indexOf("earn");
        System.out.println("index = " + index);//1

        int index1=strbld4.indexOf("a",4);
        System.out.println("index1 = " + index1);//6 burda 4.index den soraki  "a"nin ilk indexi demek

        int index2=strbld4.indexOf("e",4);
        System.out.println("index2 = " + index2);//-1

                
    }
}
