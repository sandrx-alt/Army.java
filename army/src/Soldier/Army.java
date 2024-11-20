package Soldier;
import java.util.ArrayList;
import java.util.List;

public class Army {
    private String name;
    private List<Unit> units;

    public Army(String name) {
        this.name = name;
        this.units = new ArrayList<>();
    }

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    public List<Unit>getUnits() {
        return units;
    }
    @Override
    public String toString() {
        return "Army{name=' " + name + " ', units=" + units + "}";
    }
}
