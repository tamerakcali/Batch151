package questionbank_01;

import java.util.*;

public class ArrayList_01{


    List<String> list1=new ArrayList<String>();
    public static void main(String[] args) {
        
            ArrayList_01 obj1=new ArrayList_01();
            obj1.myMethod(obj1.list1);
            obj1.list1.add("z");
            obj1.list1.add("t");
            System.out.println(obj1.list1);
            
            ArrayList<Character> ch=new ArrayList<Character>();
            for(char i='a';i<='e';i++){
                ch.clear();
                ch.add(i);
            }
        System.out.println("ch = " + ch);

            List<Integer> asd=new ArrayList<>();
            asd.add(3);
            asd.add(5);
            asd.add(7);
            asd.add(9);
            int i=0;
            int x=0;
            while(i<asd.size()){
                x+=asd.get(i);
                i++;
            }
        System.out.println("x = " + x);

            int arr[]={2,4,6,8};
            List<Integer> lt=new ArrayList<>();
            int t=0;
            do{
                lt.add(arr[t]);
                t++;
            }while(t<arr.length);
        System.out.println("lt:"+lt);

        }


    public List<String> myMethod(List<String>list1){
        list1.add("x");
        list1.add("y");
        return list1;

    }

    }


