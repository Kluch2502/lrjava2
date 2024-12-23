class Dragon extends Monster {
    private double wingspan; 
 
    private static int dragonCount = 0;
 
    public Dragon() {
        super();
        this.wingspan = 5.0; 
        dragonCount++;
    }
 
   
    public Dragon(String name, int health, int strength, double wingspan) {
        super(name, health, strength);
        this.wingspan = wingspan;
        dragonCount++;
    }
 
    @Override
    public void displayInfo() {
        System.out.println("Имя дракона: " + getName());
        System.out.println("Здоровье: " + getHealth());
        System.out.println("Сила: " + getStrength());
        System.out.println("Размах крыльев: " + wingspan + " метров");
        System.out.println("Количество созданных драконов: " + dragonCount);
    }
 
   
    public double getWingspan() {
        return wingspan;
    }
 
    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }
}