package com.example.assignment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneManager {

    static public void changeScenes(ActionEvent event, String fxmlName) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PokemonApplication.class.getResource(fxmlName));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Pokemon Graph");
        stage.setScene(scene);
        stage.show();    }

}
