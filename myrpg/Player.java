package myrpg;

import java.util.*;

/*
 * a definition of a character 
 */
public class Player extends Entity{

    public Player(GameCharacter character, int level){
        super(character, level);
    }

    public int attack(Entity entity){
        entity.damage(1);
        return 1;
    }
}
