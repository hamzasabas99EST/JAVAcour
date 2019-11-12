package firstApp;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;



public class TableViewTest extends Application {
    
    @Override
    public void start(Stage primaryStage) {
         Label rep = new Label("");
        Label title = new Label("Contact List Avec TableView\n");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        title.setTextFill(Color.CADETBLUE);
       
        
        FlowPane root = new FlowPane(10,10);
        root.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(root, 400, 250);
        
        ObservableList<Contact> contactList = FXCollections.observableArrayList(
                new Contact("Said", "Touzani", "06 67 67 67 67"), 
                new Contact("Badre", "Farah", "06 65 62 03 07"), 
                new Contact("Inas", "Khiam", "06 24 33 56 34"), 
                new Contact("yahya", "Douli", "06 33 56 43 67"), 
                new Contact("Kamal", "sarif", "06 45 34 00 43"), 
                new Contact("Hanane", "Rifaai", "06 22 34 28 23") 
                );
    
        TableView<Contact> tvContacts;
        
        tvContacts = new TableView<Contact>(contactList);
        
        TableColumn<Contact, String> prnm = new TableColumn<>("Prenom");
        prnm.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        tvContacts.getColumns().add(prnm);
        
        TableColumn<Contact, String> nom = new TableColumn<>("Nom");
        nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        tvContacts.getColumns().add(nom);
        
        TableColumn<Contact, String> num = new TableColumn<>("Telephone");
        num.setCellValueFactory(new PropertyValueFactory<>("num"));
        tvContacts.getColumns().add(num);
        
        tvContacts.setPrefWidth(300);
        tvContacts.setPrefHeight(160);
        
        TableView.TableViewSelectionModel<Contact> tvSelContact = 
                tvContacts.getSelectionModel();

        tvSelContact.selectedIndexProperty().addListener(new ChangeListener<Number>()
        {
            public void changed(ObservableValue<? extends Number> selected, 
                    Number oldVal, Number newVal) {
                int index = (int)newVal;
                rep.setText("Num selectioné : "
                        +contactList.get(index).getNum());
            }
        });
        
        rep.setFont(Font.font("Arial", 14));
        root.getChildren().addAll(title,tvContacts, rep);
        primaryStage.setTitle("Contact List");
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