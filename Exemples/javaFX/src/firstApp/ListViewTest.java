package firstApp;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ListViewTest extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label rep = new Label("Choisir Un Jour:");
        
        ListView<String> lvJours;
            
        
        Text titre = new Text("Jours");
        titre.setFill(Paint.valueOf("#2A5058"));
        titre.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        
        FlowPane root = new FlowPane(10,10);
        root.setAlignment(Pos.CENTER);
        
        ObservableList<String> jours = 
                FXCollections.observableArrayList("Lundi", "Mardi",  
                "Mercredi", "Jeudi", "Vendredi", "Samedi", 
                "Dimanche");
        
        lvJours = new ListView<String>(jours);
        lvJours.setPrefSize(200,150);
        //lvJours.setOrientation(Orientation.HORIZONTAL);
        
        MultipleSelectionModel<String> lvSelModel = lvJours.getSelectionModel();
        lvSelModel.selectedItemProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> selected, 
                    String oldVal, String newVal)
            {
                rep.setText("Vous avez choisi: " + oldVal);
            }
                    
        });
        
        root.getChildren().addAll(titre,lvJours,rep);
        
        Scene scene = new Scene(root, 260, 250);
        
        primaryStage.setTitle("ListView");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}