public class RegionDragon extends Dragon {
    private String region;

    private static int RegionDragoncount = 0;
 
   
    public RegionDragon(String name, int health, int strength, double wingspan, String region) {
        super(name, health, strength, wingspan);
        this.region = region;
        RegionDragoncount++;
    }
 
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Регион: " + region);
        System.out.println("Количество созданных драконов региона " + region + ": " + RegionDragoncount);
    }
 
   
    public String getRegion() {
        return region;
    }
 
    public void setRegion(String region) {
        this.region = region;
    }
}

