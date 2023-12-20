import java.io.FileWriter;
import java.io.IOException;

public class WritingChar {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("text2.txt");
            String str = "Haysten D'costa is a good boy he likes to play and have fun....";

            char buffer[] = new char[str.length()];
            str.getChars(0, str.length(), buffer, 0);

            for(int i=0; i<buffer.length; i++) {
                fw.write(buffer[i]);
            }
            fw.close();
        }
        catch(IOException e) { }
    }
}
