package com.example.assignment1;

public class Pokemon {
    private Integer PokemonID;
    private String PokemonName;
    private Integer HP;
    private Integer Attack;
    private Integer Defense;
    private Integer SpAtk;
    private Integer SpDef;
    private Integer Speed;
    private Integer Total;

    public Pokemon(Integer PokemonID, String PokemonName, Integer HP, Integer Attack, Integer Defense, Integer SpAtk, Integer SpDef, Integer Speed, Integer Total){
        setPokemonID(PokemonID);
        setPokemonName(PokemonName);
        setHP(HP);
        setAttack(Attack);
        setDefense(Defense);
        setSpAtk(SpAtk);
        setSpDef(SpDef);
        setSpeed(Speed);
        setTotal(Total);
    }

    public Integer getPokemonID() {
        return PokemonID;
    }

    public void setPokemonID(Integer pokemonID) {
        this.PokemonID = pokemonID;
    }

    public Integer getHP() {
        return HP;
    }

    public void setHP(Integer HP) {
        this.HP = HP;
    }

    public String getPokemonName() {
        return PokemonName;
    }

    public void setPokemonName(String pokemonName) {
        if(pokemonName.length() <= 1){
            throw new IllegalArgumentException("Pokemon name must be more than 1 character");
        }
        this.PokemonName = pokemonName;
    }

    public Integer getAttack() {
        return Attack;
    }

    public void setAttack(Integer attack) {
        this.Attack = attack;
    }

    public Integer getDefense() {
        return Defense;
    }

    public void setDefense(Integer defense) {
        this.Defense = defense;
    }

    public Integer getSpAtk() {
        return SpAtk;
    }

    public void setSpAtk(Integer spAtk) {
        this.SpAtk = spAtk;
    }

    public Integer getSpDef() {
        return SpDef;
    }

    public void setSpDef(Integer spDef) {
        this.SpDef = spDef;
    }

    public Integer getSpeed() {
        return Speed;
    }

    public void setSpeed(Integer speed) {
        this.Speed = speed;
    }

    public Integer getTotal() {
        return Total;
    }

    public void setTotal(Integer total) {
        this.Total = total;
    }
}
