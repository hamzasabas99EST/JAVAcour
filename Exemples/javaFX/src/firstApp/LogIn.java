package firstApp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class LogIn extends Application {
	@Override
	public void start(Stage primaryStage) {
		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);
		grid.setGridLinesVisible(true);
        grid.setAlignment(Pos.CENTER);
        Scene scene = new Scene(grid, 360, 200);
        Text titre = new Text("Votre Nom et mot de passe ");
        titre.setFont(Font.font("Tahoma",FontWeight.NORMAL, 20));
        Label userLbl = new Label("Nom d'utilisateur:");
        TextField userTF = new TextField();
        Label pwLbl = new Label("Mot de passe: ");
        PasswordField pwTF = new PasswordField();
        Button btn = new Button("OK");
        grid.add(titre,0,0,2,1);
        grid.add(userLbl,0,1);
        grid.add(userTF, 1,1);
        grid.add(pwLbl,0,2);
        grid.add(pwTF,1,2);
        HBox hbBtn = new HBox();
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn,1, 3);
        final Text msgT = new Text();
        grid.add(msgT,1,4);
        btn.setOnAction(event ->{msgT.setText("Bonjour "+userTF.getText());});
        primaryStage.setTitle("JavaFX Login");
        primaryStage.setScene(scene);
        primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

