package Client_fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import server.models.Course;

/**
 * Classe principale de client_fx
 */
public class Client_fx extends Application {
    @Override
    /**
     * Méthode start de client_fx
     */
    public void start(Stage stage) {
        Modele leModele = new Modele();
        Vue laVue = new Vue();
        Controleur leControleur = new Controleur(leModele, laVue);
        Scene scene = new Scene(laVue, 600, 600);

        stage.setTitle("Inscription UdeM");
        stage.setScene(scene);
        stage.show();


    }
}
