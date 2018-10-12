package myrpg;

import java.util.*;

/*
 * TODO should be abstract
 */
public class GameCharacter{
    public Stats stats;
    public String name;

    public GameCharacter(GameCharacter character){
        this.stats = character.stats;
        this.name = character.name;
    }

    public GameCharacter(String name){
        this.name = name;
        this.stats = Stats.defaultStats();
    }
    //List<Skill> skills;
}
