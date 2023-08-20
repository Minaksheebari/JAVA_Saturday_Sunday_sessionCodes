class Enemy {
    protected String name;
    protected int health;
    protected int damage;

    public Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void attack() {
        System.out.println(name + " attacks and deals " + damage + " damage!");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
    }
}

class Goblin extends Enemy {
    private int agility;

    public Goblin(String name, int health, int damage, int agility) {
        super(name, health, damage);
        this.agility = agility;
    }

    public void attack() {
        super.attack(); // Call the attack() method of the base class
        System.out.println("Goblin's agility allows it to strike quickly!");
    }

    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo() method of the base class
        System.out.println("Agility: " + agility);
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        Goblin goblin = new Goblin("Grugg", 50, 10, 15);
        goblin.attack();
        goblin.displayInfo();
    }
}
