package docs;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Docs extends Application {
    
    public Button b;
    
    @Override
    public void start(Stage stage) {
        //компоненты
        final MenuBar menuBar = new MenuBar();
        Menu file = new Menu("Файл");
        
        menuBar.getMenus().addAll(file);
        
        b = new Button("fff");
        
        
        //это взято тут http://docs.oracle.com/javafx/2/ui_controls/button.htm но не работает :((
        //Image imageDecline = new Image(getClass().getResourceAsStream("add.png"));
        //Button button5 = new Button();
        //button5.setGraphic(new ImageView(imageDecline));
        
        ToolBar toolBar = new ToolBar(
                b
        ); 
        
        VBox root = new VBox();
        root.getChildren().addAll(menuBar,toolBar);
        
        //отображение
        Scene scene = new Scene(root, 500, 500);
        
        stage.setTitle("Docs");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
