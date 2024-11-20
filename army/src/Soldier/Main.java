package Soldier;

public class Main {
    public static void main(String[] args) {
        Soldier soldier1 = new Soldier("John", 100);
        Soldier soldier2 = new Soldier("Alice", 90);
        Soldier soldier3 = new Soldier("Peter", 80);
        Soldier soldier4 = new Soldier("Martin", 90);
        Soldier soldier5 = new Soldier("Laura", 70);
        Soldier soldier6 = new Soldier("Jozef", 80);


        Unit unit1 = new Unit("Alpha");
        unit1.addSoldier(soldier1);
        unit1.addSoldier(soldier2);
        unit1.addSoldier(soldier3);
        unit1.addSoldier(soldier4);
        unit1.addSoldier(soldier5);
        unit1.addSoldier(soldier6);

        Army army = new Army("Infatry");
        army.addUnit(unit1);

        System.out.println(army);

        //Simulate damage
        soldier1.takeDamage(10);
        System.out.println("After batlle: " + soldier1);
    }
}