interface Sports {
    String type = "Indoor";
}
class Student {
    int rollno;
    String name;
    float height;
    void displayDetails() {
        System.out.println("My name is "+ name +" having a roll no. "+ rollno +" and I'm "+ height +"cm tall !");
    }
}
class Marks extends Student {
    float marks;
    void displayMarks() {
        System.out.println("I've a total of "+ marks +" marks in my Computer Engineering degree !!");
    }
}
class Result extends Marks implements Sports {
    void displayResult() {
        System.out.println("\nMy result :");
        displayDetails();
        displayMarks();
        System.out.println("Also, I play "+ type +" type sports !!!!!");
    }
}
public class Interface {
    public static void main(String[] args) {
        Result r = new Result();
        r.rollno = 56;
        r.name = "Haysten D'costa";
        r.height = 160;
        r.marks = 100;
        r.displayResult();
    }
}