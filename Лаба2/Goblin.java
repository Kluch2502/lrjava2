class Goblin extends Monster {
    private String weapon;

    private static int goblinCount = 0;

    public Goblin() {
        super();
        this.weapon = "";
        goblinCount++;
    }

    public Goblin(String name, int health, int strength, String weapon) {
        super(name, health, strength);
        this.weapon = weapon;
        goblinCount++;
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя гоблина: " + getName());
        System.out.println("Здоровье: " + getHealth());
        System.out.println("Сила: " + getStrength());
        System.out.println("Оружие: " + weapon);
        System.out.println("Количество созданных гоблинов: " + goblinCount);
    }


    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
   }
}
