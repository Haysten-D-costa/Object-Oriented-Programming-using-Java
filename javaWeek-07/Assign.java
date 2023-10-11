// Write a program to count the no. of white spaces, tabs and new lines in a file....

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.processing.Filer;

public class Assign {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);
        
        String ch = br.readLine();
        while(ch != null) {
            System.out.println(ch);
        }
            
    }
}
