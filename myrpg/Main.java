package myrpg;

public class Main{
    public static void main(String[] args){
        GameCharacter character = new GameCharacter("Ser Bar");
        Player player = new Player(character, 1);
        
        System.out.println("hello " + player.character.name);

    }
}
