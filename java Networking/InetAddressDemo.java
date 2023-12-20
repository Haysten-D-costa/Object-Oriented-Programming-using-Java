import java.net.*;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("LocalHost Name is : "+ address);  //? Address : HAYDC24/192.168.230.145
        
        address = InetAddress.getByName("www.aitdgoa.edu.in");
        System.out.println("Address : "+ address);  //? Address : www.aitdgoa.edu.in/172.67.222.149
        
        InetAddress addSet[] = InetAddress.getAllByName("www.aitdgoa.edu.in");
        for(InetAddress add : addSet) {
            System.out.println(add);
        }
        /*
            ? www.aitdgoa.edu.in/172.67.222.149
            ? www.aitdgoa.edu.in/104.21.38.118
            ? www.aitdgoa.edu.in/2606:4700:3037:0:0:0:ac43:de95
            ? www.aitdgoa.edu.in/2606:4700:3033:0:0:0:6815:2676
        */
    }
}
