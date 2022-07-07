package pets_amok;

public abstract class OrganicPet extends VirtualPet {


    protected int hunger;
    protected int thirst;
    protected int boredom;
    protected int waste;

    public OrganicPet(String petName, String description, int health,
                      int hunger, int thirst, int boredom, int waste,
                      int happiness) {
        super(petName, description, health, happiness);
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.waste = waste;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getWaste() {
        return waste;
    }

    public void feed() {
        this.hunger += 40;
        this.thirst -= 20;
        this.boredom -= 20;
        this.waste -= 20;
        this.happiness += 5;
    }

    public void watered() {
        this.hunger -= 10;
        this.thirst += 20;
        this.boredom -= 10;
        this.waste -= 10;
        this.happiness += 5;
    }

    public void waste() {
        this.hunger -= 10;
        this.thirst -= 10;
        this.boredom -= 10;
        this.waste += 20;
        this.happiness += 5;
    }
    @Override
    public void played() {
        this.hunger -= 10;
        this.thirst -= 10;
        this.boredom += 20;
        this.waste -= 10;
        this.happiness += 5;
    }

    @Override
    public void Tick() {

            this.hunger -= 10;
            this.thirst -= 10;
            this.boredom -= 10;
            this.waste -= 10;
            this.happiness -= 10;

    }
}