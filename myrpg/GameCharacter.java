package myrpg;

import java.util.*;

/*
 * TODO should be abstract
 */
public class GameCharacter{
    public Stats stats;
    public String name;
    public int level;

    public GameCharacter(String name, int level){
        this.name = name;
        this.level = level;
        this.stats = new Stats();
    }
    //List<Skill> skills;
}
