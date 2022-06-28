package pets_amok;

public abstract class VirtualPet {

    protected String petName;
    protected String description;
    protected int health;
    protected int happiness;


    public VirtualPet(String petName, String description, int health, int happiness) {
        this.petName = petName;
        this.description = description;
        this.health = health;
        this.happiness = happiness;
    }

    public String getPetName() {
        return petName;
    }

    public String getDescription() {
        return description;
    }

    public int getHealth() {
        return health;
    }

    public int getHappiness() {
        return happiness;
    }

    public abstract void played();


    public abstract void Tick();

    public abstract void showStatus();
}

