package myrpg;

import java.util.*;

/*
 * a definition of a character 
 */
public abstract class Entity{
    GameCharacter character;
    int life;
    int mana;

    public Entity(){
        life = 3;
        mana = 1;
        character = new GameCharacter("bobo", 2); 
    }

    public abstract int attack(Entity entity);

    public int damage(int life_lose){
        life -= life_lose;
        return life_lose;
    }
}
