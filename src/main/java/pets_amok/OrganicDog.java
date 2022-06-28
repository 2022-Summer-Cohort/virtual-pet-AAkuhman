package pets_amok;

public class OrganicDog extends OrganicPet {

    public OrganicDog(String petName, String description, int health, int hunger, int thirst, int boredom, int waste, int happiness) {
        super(petName, description, health, hunger, thirst, boredom, waste, happiness);
    }
    @Override
    public void showStatus() {
        System.out.println("Pet name " + petName + " Pet description "
                + getDescription() + " Pet Health " + getHealth()
                + " Pet Happiness " + getHappiness() + " Pet hunger " + getHunger() + " Pet thirst " + getThirst() + " Pet boredom " + getBoredom() + " Pet waste " + getWaste());

    }

    public void cleanDogCage() {
        this.hunger -= 10;
        this.thirst -= 10;
        this.boredom -= 10;
        this.waste = 0;
        this.happiness += 10;

    }

}

