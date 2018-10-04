package myrpg;

public class Stats{
    int maxHP;
    int maxMP;
    public int atk;
    public int def;
    public double critical;

    public Stats(int atk, int def, double critical, int maxHP, int maxMP){
        this.atk = atk;
        this.def = def;
        this.critical = critical;
        this.maxHP = maxHP;
        this.maxMP = maxMP;
    }

    public Stats(){
        atk = 3;
        def = 2;
        critical = 0.05;
        maxHP = 10;
        maxMP = 0;
    }
}
