package com.example.assignment1;

import java.util.ArrayList;
import java.sql.*;

public class DBUtility {
    private static String user="student";
    private static String password="student";
    private static String connectionURL="jdbc:mysql://localhost:3306/pokemonstats";

    public static ArrayList<Pokemon> getPokemon() throws SQLException {
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        String sql = "SELECT * FROM pokemonstats.pokemonbasestats;";
        try (
                Connection connection = DriverManager.getConnection(connectionURL, user, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next()) {
                Integer PokemonID = resultSet.getInt("PokemonID");
                String PokemonName = resultSet.getString("PokemonName");
                Integer HP = resultSet.getInt("HP");
                Integer Attack = resultSet.getInt("Attack");
                Integer Defense = resultSet.getInt("Defense");
                Integer SpAtk = resultSet.getInt("SpAtk");
                Integer SpDef = resultSet.getInt("SpDef");
                Integer Speed = resultSet.getInt("Speed");
                Integer Total = resultSet.getInt("Total");

                Pokemon pokemon = new Pokemon(PokemonID, PokemonName, HP, Attack, Defense, SpAtk, SpDef, Speed, Total);
                pokemons.add(pokemon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return pokemons;
    }

}
