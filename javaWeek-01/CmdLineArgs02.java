/*
    * The above class takes command line arguments and prints them out....
*/
class CmdLineArgs02 {
    public static void main(String args[]) {
        
        for(String h: args) { // enhanced for loop....
            System.out.println("-> : "+ h);
        }
    }
}