/*
    ASSIGNMENT 02 : 
    Write a program to create a class called Student with data member rollno, studname, branch and semester. 
    Use appropriate constructor to initialize data member. 
    Create a member function to display student details. 
*/
public class Student {
    
    int rollNo;
    String studName, studBranch, studSemester;

    Student() { // default consturctor....
        rollNo = 0;
        studName = "NA"; studBranch = "NA"; studSemester = "NA";
    }
    Student(int rollNo, String studName, String studBranch, String studSemester) { // parameterised constructor....
        this.rollNo = rollNo;
        this.studName = studName;
        this.studBranch = studBranch;
        this.studSemester = studSemester;
    }
    Student(Student s) { // copy constructor....
        rollNo = s.rollNo;
        studName = s.studName;
        studBranch = s.studBranch;
        studSemester = s.studSemester;
    }

    public static void displayData(Student s) {
        System.out.println("\nDisplaying the Student Details : ");
        System.out.println("Roll number : "+s.rollNo);
        System.out.println("Name        : "+s.studName);
        System.out.println("Branch      : "+s.studBranch);
        System.out.println("Semester    : "+s.studSemester);
    }
    public static void main(String[] args) {
        Student s1 = new Student(); // calling default constructor....
        Student s2 = new Student(56, "Haysten D'costa", "Computer", "5"); // calling parameterised constructor....
        Student s3 = new Student(s1); // calling copy constructor, copied values from s1(default constructor)...

        displayData(s1); // displaying s1....
        displayData(s2); // displaying s2....
        displayData(s3); // displaying s3....
    }
}
