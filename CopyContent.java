import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

public class CopyContent {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("text1.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("text2.txt");

        String str = br.readLine();
        while(str != null) {
            fw.write(str);
            br.readLine();
        }
        fr.close();
        br.close();
        fw.close();

    }
}
