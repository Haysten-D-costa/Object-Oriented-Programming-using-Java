import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.graphics.*;
import javafx.image.*;

public class ImagesDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage myStage) {
        myStage.setTitle("JavaFX - ImageDemo");
        FlowPane rootNode = new FlowPane(10, 10);
        Scene myScene = new Scene(rootNode, 300, 200);
        myStage.setScene(myScene);
        
        Image img = new Image("img.jpg");
        ImageView imgIV = new ImageView(img);
        rootNode.getChildren().add(imgIV);

        
        myStage.show();
    }
}
