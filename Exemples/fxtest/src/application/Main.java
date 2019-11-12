package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Circle c1=new Circle(-20,-20,60);
			c1.setFill(Color.YELLOW);
			
			Circle c2=new Circle(60,300,40);
			c2.setFill(Color.GREEN);
			c2.setStrokeWidth(10);
			c2.setStroke(Color.BISQUE);
			
			Line l1=new Line(40,360,340,220);
			l1.setStrokeWidth(20);
			Line l2=new Line(180,360,200,300);
			l2.setStrokeWidth(10);
			Line l3=new Line(220,360,200,300);
			l3.setStrokeWidth(10);
			
			
			root.getChildren().addAll(l1,l2,l3,c1,c2);
			
			Scene scene = new Scene(root,400,400,Color.ALICEBLUE);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
