package pets_amok;

public abstract class RoboticPet extends VirtualPet{

    protected int oil;
    protected int battery;


    public RoboticPet(String petName, String description, int health, int oil, int battery, int happiness) {
        super(petName, description, health, happiness);
        this.oil = oil;
        this.battery = battery;
    }
    public int getOil() {
        return oil;
    }
    public int getBattery() {
        return battery;
    }

    public void addOil(){
        this.oil += 20;
        this.battery -= 0;
        this.happiness += 5;
    }
    public void addBattery(){
        this.oil -= 0;
        this.battery += 20;
        this.happiness += 5;
    }

    @Override
    public void Tick(){
        this.oil -=10;
        this.battery -=10;
        this.happiness -=10;
    }
    @Override
    public void played() {
        this.battery -= 10;
        this.oil -= 10;
        this.happiness += 5;
    }
    public void showStatus() {
        System.out.println("Pet name " + petName + "Pet description "
                + getDescription() + " Pet Health " + getHealth()
                + " Pet Happiness " + getHappiness() + " Pet hunger " + getBattery() + " Pet oil " + getOil());

    }

    }





