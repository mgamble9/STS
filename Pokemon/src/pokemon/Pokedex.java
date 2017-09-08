package pokemon;

public class Pokedex extends PokeAbstract {
	
	@Override
	public void pokemonInfo(Pokemon pokemon) {
		System.out.println("Name: " + pokemon.getName() + " | Health: " +
				pokemon.getHealth() + " | Type: " + pokemon.getType());
	}
	
}
