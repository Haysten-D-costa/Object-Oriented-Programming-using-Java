/* //! JavaFX SKELETON CODE : 

 * Stage methods : //? start(Stage myStage){...} 
   -> myStage.setTitle("<title-name>");
   -> myStage.setScene("<scene-name>");
   -> myStage.show();

 * Steps : 
   1. import all required classes,
   2. extend the Application class,
   3. in main(), call the launch(),
   4. override "life-cycle-methods :"
   -> init();
   -> start(Stage myStage) 
      {
        myStage.setTitle("JavaFX Skeleton");
        FlowPane rootNode = new FlowPane();
        myStage.setScene(new Scene(rootNode, 300, 200));
        myStage.show();
      }
   -> stop();
*/

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;

public class JavaFXSkeleton extends Application {
    public static void main(String[] args) {
        System.out.println("Launching JavaFX Application....");
        launch(args); // launches the application....
    }
    //=> overriding init() method....
    public void init() { 
        System.out.println("Inside init() method.");
    }
    //=> overriding the start() method....
    public void start(Stage myStage) { 
        System.out.println("Inside start() method.");
        
        // giving the stage a title....
        myStage.setTitle("JavaFX Skeleton"); 
        
        // creating a root node, in this case FlowPane is used(FlowPane, GridPane, BorderPane)....
        FlowPane rootNode = new FlowPane();

        // creating a scene....
        Scene myScene = new Scene(rootNode, 300, 200);
        myStage.setScene(myScene); // set the scene on stage....
        myStage.show(); // show the stage and its scene....
    }
    //=> override the stop() method....
    public void stop() { 
        System.out.println("Inside the stop() method.");
    }
}
