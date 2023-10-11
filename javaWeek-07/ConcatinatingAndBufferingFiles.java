import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class ConcatinatingAndBufferingFiles {
    public static void main(String[] args) throws IOException {
        FileInputStream file1 = new FileInputStream("01.txt");
        FileInputStream file2 = new FileInputStream("02.txt");
        SequenceInputStream file3 = new SequenceInputStream(file1, file2);
        BufferedOutputStream bout = new BufferedOutputStream(System.out);
        BufferedInputStream bin = new BufferedInputStream(file3);
        int ch;
        while((ch = bin.read()) != -1) {
            bout.write((char)ch);
        }
        bin.close(); bout.close();
        file1.close(); file2.close();
    }    
}
