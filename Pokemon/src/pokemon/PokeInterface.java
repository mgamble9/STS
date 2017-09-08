package pokemon;

public interface PokeInterface {

	Pokemon createPokemon(String name, String type, int health);
	void attackPokemon(Pokemon pokemon);	
	void pokemonInfo(Pokemon pokemon);
}
