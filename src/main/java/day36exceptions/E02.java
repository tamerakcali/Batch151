package day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
    public static void main(String[] args) {

 //2.WAY:try-catch ile;
        try {
            FileInputStream fis=new FileInputStream("");

            int i=0;
            while((i=fis.read())!=-1){

            }
        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or does not exist");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
