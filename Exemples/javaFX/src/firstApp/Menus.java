package firstApp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Menus extends Application {
   
    @Override
    public void start(Stage primaryStage) {
        
    BorderPane root = new BorderPane();
    Scene scene = new Scene(root,300, 300, Color.WHITE);

    MenuBar menuBar = new MenuBar();
    
    Menu menuFichier = new Menu("Fichier");
    MenuItem nvItm = new MenuItem("Nouveau");
    MenuItem svItm = new MenuItem("Enregistrer");
    MenuItem qtItm = new MenuItem("Quitter");
    SeparatorMenuItem sp=new SeparatorMenuItem();
    
    Menu menuPrint = new Menu("Imprimer");
    MenuItem toFileItm = new MenuItem("Fichier");
    MenuItem toPrinterItm = new MenuItem("Impriment");
    menuPrint.getItems().addAll(toFileItm,toPrinterItm);
    menuFichier.getItems().addAll(nvItm, svItm,menuPrint, sp, qtItm);
    
    Menu menuAffichage = new Menu("Affichage");
    CheckMenuItem etatItm = new CheckMenuItem("Barre d'etat");
    CheckMenuItem toolItm = new CheckMenuItem("Barre d'outils");
    etatItm.setSelected(true);
    menuAffichage.getItems().addAll(etatItm,toolItm);
    
    qtItm.setOnAction(actionEvent->Platform.exit());
    menuBar.getMenus().addAll(menuFichier, menuAffichage);
    root.setTop(menuBar);
  
    primaryStage.setTitle("Les Menus");
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