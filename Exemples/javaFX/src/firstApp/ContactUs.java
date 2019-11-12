package firstApp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ContactUs extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        root.setPadding(new Insets(15,15,15,15));
        root.setVgap(10);
        root.setHgap(10);
        root.setGridLinesVisible(true);
        
        Text title = new Text("Laissez un message!");
        title.setFill(Paint.valueOf("#2A5058"));
        title.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        
        Label name = new Label("Votre Nom: ");
        TextField userName = new TextField();
        HBox hb = new HBox();
        hb.getChildren().addAll(name, userName);
        hb.setSpacing(25);

        Label lblMsg = new Label("Votre Message: ");
        TextArea msg = new TextArea();
   
        Button btnSend = new Button("Envoyer");
        Button btnClear = new Button("Effacer");
        HBox hba=new HBox();
        hba.setAlignment(Pos.CENTER_RIGHT);
        hba.getChildren().add(btnClear);

        Label lblRep = new Label();
        root.add(title, 0, 0, 2, 1);
        root.add(hb, 0, 1,2,1);
        root.add(lblMsg, 0, 2);
        root.add(msg,0,3, 2,2);
        root.add(btnSend,0,5);
        root.add(hba,1,5);
        root.add(lblRep,0,6,2,1);
        DropShadow shadow = new DropShadow();
        btnSend.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e)->{
            btnSend.setEffect(shadow); });
        btnClear.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e)->{
            btnClear.setEffect(shadow); });
        btnSend.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e)-> {
            btnSend.setEffect(null);});
        
             
        btnClear.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e)-> {
            btnClear.setEffect(null);});
        btnSend.setOnAction((ActionEvent e)->{
            if(msg.getText()!=null && !msg.getText().isEmpty()){
                lblRep.setText(userName.getText() + " "+"Merci pour votre interaction");
            }
            else{
                lblRep.setText("Aucun Message!!!");
            }
        });
       
        btnClear.setOnAction((ActionEvent e)-> {
            userName.clear();
            msg.clear();
            lblRep.setText(null);
        });
               
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("UI Control Event Handlers");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}