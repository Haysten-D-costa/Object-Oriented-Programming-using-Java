import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("01.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("02.txt");

            String ch = br.readLine();
            while(ch != null) {
                System.out.println(ch);
                fw.write(ch);
                ch = br.readLine();
            }
            fr.close(); fw.close(); br.close();
        } catch(IOException e) {

        }
    }
}