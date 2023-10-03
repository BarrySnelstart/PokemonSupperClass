import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <BasePokemon> pokemonList = new ArrayList <>();
        Fire Charmander = new Fire("Charmander ","Fire",50, "Char Char", "Blaze", "Water");
        pokemonList.add(Charmander);
        Grass Bulbasaur = new Grass("Bulbasaur", "grass",70,"Bulba Bulba", "Overgrow", "fire");
        pokemonList.add(Bulbasaur);
        Electric Pikachu = new Electric("Pikachu ","Electric" ,65,"Pika Pika", "Static", "ground");
        pokemonList.add(Pikachu);
        Water Poliwag = new Water("Poliwag","Water",90, "Poli Poli", "Damp", "Grass");
        pokemonList.add(Poliwag);

        // use all methodes in baseclass
        for (BasePokemon name:pokemonList) {
        name.printName();
        name.playSound();
        name.battleCry();
        System.out.println("**** ------------------------------------------****");
        }

        // use a set methode in baseclass
        Bulbasaur.setType("Grass");

        // Feed a pokemon
        Charmander.feedPokemon("fire", "resberry");
        System.out.println("**** ------------------------------------------****");
        Charmander.setHitpoints(70);

        Charmander.feedPokemon("fire", "resberry");
        System.out.println("**** ------------------------------------------****");
        Charmander.feedPokemon("fire", "fireberry");

        Poliwag.feedPokemon("Water", "Waterberry");

        // add electric Pokemon with 2 types
        Electric wetPicashoe = new Electric("wetPicashoe","Electric", 150, "blub blub", "Sploenk", "Panncakes", "water" );
        wetPicashoe.setType("Electric");
        System.out.println("a double type Pokemon is " +wetPicashoe.getName() +" It has 2 types Type one is " +wetPicashoe.getType() + " and the second type is " +wetPicashoe.getSecondType() );

    }
}
