public class P01 {
    
    int instance_variable;
    static int static_variable;

    public static void main(String[] args) {
        
        int local_variable;
        // System.out.println(instance_variable); //! ERROR: non-static variable instance_variable cannot be referenced from a static context....
        System.out.println(static_variable);
        System.out.println(local_variable); //! ERROR: variable local_variable might not have been initialized....
    }
}
