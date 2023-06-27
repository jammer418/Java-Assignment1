package com.example.assignment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;

import java.io.IOException;

public class PokemonGraphController {

        @FXML
        private CategoryAxis categoryAxis;

        @FXML
        private Button changeBtn;

        @FXML
        private NumberAxis numberAxis;

        @FXML
        private BarChart<String, Integer> pokemonGraph;



    @FXML
    private void loadTableView(ActionEvent event) throws IOException {
        SceneManager.changeScenes(event,"PokemonTableView.fxml");
    }

}
