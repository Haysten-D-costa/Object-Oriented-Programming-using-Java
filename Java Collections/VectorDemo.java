import java.util.Vector;
import java.util.Iterator;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("P1");
        vector.add("P2");
        vector.add("P3");
        vector.add("P4");
        vector.add("P5");
        
        Iterator<String> it = vector.iterator();
        
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
