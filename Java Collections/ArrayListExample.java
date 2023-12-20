import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList <String> a1 = new ArrayList<>();
        System.out.println("Initial size of a1 : "+ a1.size());
        a1.add("C"); 
        a1.add("A"); 
        a1.add("E"); 
        a1.add("B"); 
        a1.add("F");
        a1.add(1, "A2"); 
        System.out.println("Size of a1 after addition : "+ a1.size());
        System.out.println("\nContents of a1 : "+ a1);
        a1.remove("F");
        a1.remove(2);
        
        ArrayList <String> a2 = new ArrayList<>();
        a2.add("F");
        a2.add("A2");
        a1.retainAll(a2);
        a1.add(0, "K");
        System.out.println("Size of a1 after deletion : "+ a2.size());        
        System.out.println("\nContents of a1 : "+ a1);
        
        for(int i=0; i<a1.size(); i++) {
            System.out.println(a1.get(i));
        }
        System.out.println("Copying content to array.... ");
        String j[] = new String[a1.size()];
        j = a1.toArray(j);
        for(String temp : j) {
            System.out.println(temp);
        }

    }
}