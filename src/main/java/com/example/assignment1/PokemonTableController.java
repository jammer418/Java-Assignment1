package com.example.assignment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;



public class PokemonTableController implements Initializable {

    @FXML
    private TableColumn<Pokemon, Integer> AttackCol;

    @FXML
    private TableColumn<Pokemon, Integer> DefenseCol;

    @FXML
    private TableColumn<Pokemon, Integer> HPCol;

    @FXML
    private TableColumn<Pokemon, Integer> IDCol;

    @FXML
    private TableColumn<Pokemon, String> NameCol;

    @FXML
    private TableColumn<Pokemon, Integer> SpAtkCol;

    @FXML
    private TableColumn<Pokemon, Integer> SpDefCol;

    @FXML
    private TableColumn<Pokemon, Integer> SpeedCol;

    @FXML
    private TableColumn<Pokemon, Integer> TotalCol;

    @FXML
    private Button switchBtn;

    @FXML
    private TableView<Pokemon> tablePokemon;




    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try {
            ArrayList<Pokemon> pokemons = DBUtility.getPokemon();
            tablePokemon.getItems().addAll(pokemons);
            IDCol.setCellValueFactory(new PropertyValueFactory<>("PokemonID"));
            NameCol.setCellValueFactory(new PropertyValueFactory<>("PokemonName"));
            HPCol.setCellValueFactory(new PropertyValueFactory<>("HP"));
            AttackCol.setCellValueFactory(new PropertyValueFactory<>("Attack"));
            DefenseCol.setCellValueFactory(new PropertyValueFactory<>("Defense"));
            SpAtkCol.setCellValueFactory(new PropertyValueFactory<>("SpAtk"));
            SpDefCol.setCellValueFactory(new PropertyValueFactory<>("SpDef"));
            SpeedCol.setCellValueFactory(new PropertyValueFactory<>("Speed"));
            TotalCol.setCellValueFactory(new PropertyValueFactory<>("Total"));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    @FXML
    private void loadTableView(ActionEvent event) throws IOException {
        SceneManager.changeScenes(event,"PokemonGraphView.fxml");
    }


}
