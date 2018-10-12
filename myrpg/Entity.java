package myrpg;

import java.util.*;
import random;

/*
 * a definition of a character 
 */
public abstract class Entity{
    GameCharacter character;
    int life;
    int mana;
    int level;
    Random rand;

    private Entity(){
        rand = new Random();
    }

    public Entity(Entity entity){
        this();
        this.character = entity.character;
        this.life = entity.life;
        this.mana = entity.mana;
        this.level = entity.level;
    }

    public Entity(GameCharacter character, int level, int life, int mana){
        this();
        this.life = life;
        this.mana = mana;
        this.level = level;
        this.character = new GameCharacter(character); 
    }
    
    public Entity(GameCharacter character, int level){
        this();
        this.character = new GameCharacter(character); 
        this.fillHP();
        this.fillMP();
        this.level = level;
    }

    public void fillHP(){
        this.life = this.character.stats.maxHP;
    }

    public void fillMP(){
        this.life = character.stats.maxMP;
    }

    public abstract int attack(Entity entity){
        double critical_chance = rand.nextDouble();

        int damage = this.character.stats.atk;
        if(critical_chance < this.character.stats.critical_prob){
            damage *= this.character.stats.critical;
        }

        entity.damage(damage);
    }

    public int damage(int life_lose){
        life -= life_lose;
        return life_lose;
    }
}
