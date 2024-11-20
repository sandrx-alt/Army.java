package Soldier;

public class Soldier {
    private String name;
    private int health;

    public Soldier(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {

        return name;
    }

    public int getHealth() {

        return health;
    }

    public void takeDamage(int damage) {

        this.health -= damage;
    }

    @Override
    public String toString() {

        return "Soldier{name=' " + name + " ', health´" + health + "}";
    }
}