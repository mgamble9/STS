package pokemon;

public abstract class PokeAbstract implements PokeInterface {

	@Override
	public Pokemon createPokemon(String name, String type, int health) {
		Pokemon pokemon = new Pokemon(name,type,health);
		return pokemon;
	}
	
	@Override
	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth() - 10);
		System.out.println(pokemon.getName() + " loses 10 health.");
	}

}
