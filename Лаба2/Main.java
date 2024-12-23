public class Main {
    public static void main(String[] args) {
 
        Goblin goblin1 = new Goblin("Добби", 0, 15,  "Кинжал");
        goblin1.displayInfo();
 
        Mermaid mermaid1 = new Mermaid("Ариэль", 90, 12, "Синий");
        mermaid1.displayInfo();
 
        Dragon dragon1 = new Dragon("Смауг", 300, 50, 5.5);
        dragon1.displayInfo();

        RegionDragon dragon3 = new RegionDragon("Володимир", 300, 50, 10.5,  "Россия");
        dragon3.displayInfo();
 
        Goblin goblin2 = new Goblin();
        goblin2.setName("Грог");
        goblin2.setHealth(70);
        goblin2.setStrength(14);
        
        goblin2.displayInfo();

        Dragon dragon2 = new Dragon("Норберта", 100, 30, 6);

        dragon2.displayInfo();
    }
 }