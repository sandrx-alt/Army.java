package Soldier;
import java.util.ArrayList;
import java.util.List;


public class Unit {
    private String name;
    private List<Soldier> soldiers;

    public Unit(String name) {
        this.name = name;
        this.soldiers = new ArrayList<>();
    }

    public void addSoldier(Soldier soldier) {
        soldiers.add(soldier);
    }

    public List<Soldier> getSoldiers() {
        return soldiers;
    }
     @Override
     public String toString() {
        return "Unit{name= ' " + name + " ' ,soldiers=" + soldiers + "}";
     }
}
