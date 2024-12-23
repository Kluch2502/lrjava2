abstract class Monster {
    private String name;
    private int health;
    private int strength;

    public Monster() {
        this.name = "";
        this.health = 100;
        this.strength = 10;
    }

    public Monster(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }


    public abstract void displayInfo();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}