public class InstanceOf {
    static void display(Object...i) {
        for(Object k: i) {
            if(k instanceof Integer) { System.out.println("Integer : "+ k.toString()); }
            if(k instanceof Double) { System.out.println("Double  : "+ k.toString()); }
            if(k instanceof Character) { System.out.println("Character : "+ k.toString()); }
        }
    }
    public static void main(String[] args) {
        
        display(1, 1.1, 'a', 'b', "Haysten");
    }
}
