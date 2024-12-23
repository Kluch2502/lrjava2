class Mermaid extends Monster {
    private String colorOfTail;

    private static int mermaidCount = 0;


   public Mermaid() {
       super();
       this.colorOfTail = "";
       mermaidCount++;
   }

   public Mermaid(String name, int health, int strength, String colorOfTail) {
       super(name, health, strength);
       this.colorOfTail = colorOfTail;
       mermaidCount++;
   }

   @Override
   public void displayInfo() {
       System.out.println("Имя русалки: " + getName());
       System.out.println("Здоровье: " + getHealth());
       System.out.println("Сила: " + getStrength());
       System.out.println("Цвет хвоста: " + colorOfTail);
       System.out.println("Количество созданных русалок: " + mermaidCount);
   }

   public String getColorOfTail() {
       return colorOfTail;
   }

   public void setColorOfTail(String colorOfTail) {
       this.colorOfTail = colorOfTail;
   }
}