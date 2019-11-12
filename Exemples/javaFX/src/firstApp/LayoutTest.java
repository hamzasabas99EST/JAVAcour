package firstApp;


	import javafx.application.Application;
	import javafx.event.ActionEvent;
	import javafx.event.EventHandler;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
	import javafx.scene.layout.StackPane;
	import javafx.scene.shape.Circle;
	import javafx.stage.Stage;

	/**
	 *
	 * @author Peggy Fisher
	 */
	public class LayoutTest extends Application {
	    
	    @Override
	    public void start(Stage primaryStage) {
	        Button btn = new Button();
	        btn.setText("Click Me");
	        btn.setOnAction(new EventHandler<ActionEvent>() {
	            
	            @Override
	            public void handle(ActionEvent event) {
	                System.out.println("You clicked Me!");
	            }
	        });
	        
	        BorderPane root = new BorderPane();
	        Circle cir = new Circle(0,0,70);
	        root.setCenter(btn);
	        root.setTop(cir);
	        Scene scene = new Scene(root, 300, 250);
	        
	        primaryStage.setTitle("Layout Test");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }


	    public static void main(String[] args) {
	        launch(args);
	    }
	    
	}