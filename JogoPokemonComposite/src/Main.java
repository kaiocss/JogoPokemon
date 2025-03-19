public class Main {
    public static void main(String[] args) throws Exception {
        CartaPokemon bulbasaur = new PokemonSimples("Bulbasauro");
        CartaPokemon charmander = new PokemonSimples("Charmander");

        // Pokémon com Evolução
        PokemonEvoluido ivysaur = new PokemonEvoluido("Ivysauro");
        ivysaur.adicionarEvolucao(new PokemonSimples("Venusauro"));

        PokemonEvoluido charmeleon = new PokemonEvoluido("Charmeleon");
        charmeleon.adicionarEvolucao(new PokemonSimples("Charizard"));

        // Exibindo as informações
        bulbasaur.exibirInfo();
        charmander.exibirInfo();
        ivysaur.exibirInfo();
        charmeleon.exibirInfo();





    }
}
