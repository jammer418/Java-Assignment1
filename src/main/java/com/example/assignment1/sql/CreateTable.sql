CREATE TABLE PokemonBaseStats (
  PokemonID INT NOT NULL PRIMARY KEY,
  PokemonName VARCHAR(50) NOT NULL,
  HP INT NOT NULL,
  Attack INT NOT NULL,
  Defense INT NOT NULL,
  SpAtk INT NOT NULL,
  SpDef INT NOT NULL,
  Speed INT NOT NULL,
  Total INT NOT NULL
);