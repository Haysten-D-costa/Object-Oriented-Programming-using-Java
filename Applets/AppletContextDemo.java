import java.awt.*;
import java.applet.*;
import java.net.*;

public class AppletContextDemo extends Applet {
    
    public void start() {
    
        AppletContext ac = getAppletContext();
        URL url = getCodeBase(); // get url of this applet
        try {
            ac.showDocument(new URL(url + "Test.html"));
        } 
        catch (MalformedURLException e) {
            showStatus("URL not found");
        }
    }
}
