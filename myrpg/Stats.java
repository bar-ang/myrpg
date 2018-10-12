package myrpg;

public class Stats{
    int maxHP;
    int maxMP;
    public int atk;
    public int def;
    public double critical;
    public double critical_prob;

    public Stats(int atk, int def, double critical, double critical_prob, int maxHP, int maxMP){
        this.atk = atk;
        this.def = def;
        this.critical = critical;
        this.critical_prob = critical_prob;
        this.maxHP = maxHP;
        this.maxMP = maxMP;
    }

    public static Stats defaultStats(){
        return new Stats(3, 3, 1.2, 0.05, 10, 0);
    }
}
