import java.net.*;

public class InetAddressMethods {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress add1 = InetAddress.getByName("192.168.1.10");
        InetAddress add2 = InetAddress.getByName("www.aitdgoa.edu.in");

        if(add1.equals(add2)) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }
        
        byte[] ipAdd = add1.getAddress();
        System.out.println("IP Address : "+ Arrays.toString(ipAdd));
    }
}