import java.util.StringTokenizer; // to use the tokenizer class and related methods....

public class StringFunctions {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = " World ";

        System.out.println("toLowerCase() : "+ s1.toLowerCase());
        System.out.println("toUpperCase() : "+ s1.toUpperCase());
        System.out.println("equals()      : "+ s1.equals(s2));
        System.out.println("equalsIgnoreCase() : "+ s1.equalsIgnoreCase(s2));
        System.out.println("compareTo()        : "+ s1.compareTo(s2));

        String s3 = "Data,Manipulation,Language....";
        String s4 = "Data,Markup,Language....";

        System.out.println("\n\nsplit() function : \n");
        for(String x: s3.split(",")) {
            System.out.println("Token : "+ x);
        }

        System.out.println("\n\nreplace()  : "+ s3.replace(',', '-'));
        System.out.println("replaceAll()   : "+ s3.replaceAll("Data", "----"));
        System.out.println("replaceFirst() : "+ s3.replaceFirst("Data", "DATA"));
        System.out.println("\n\nconcat()       : "+ s1.concat(s2));
        System.out.println("trim()         : -"+ s2.trim() +"-"); // removes leading and trailing spaces....

        String s = "Java is an OOP Language";
        StringTokenizer st = new StringTokenizer(s, " ");

        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        
    }
}