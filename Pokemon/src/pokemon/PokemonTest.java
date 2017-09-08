package pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon p1 = new Pokemon("Alph","Aligatron",100);
		Pokemon p2 = new Pokemon("Bob","Bobinator",90);
		Pokemon p3 = new Pokemon("Chuck","Chuckatron",80);
		
		System.out.println(Pokemon.getCount());
		
		Pokedex pokedex = new Pokedex();
		Pokemon p4 = pokedex.createPokemon("Doug", "Dougintor", 70);
		System.out.println(Pokemon.getCount());

		pokedex.pokemonInfo(p1);
		pokedex.attackPokemon(p1);
		pokedex.pokemonInfo(p1);
		
		
	}

}
