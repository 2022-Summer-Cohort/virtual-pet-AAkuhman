package pets_amok;

public class OrganicCat extends OrganicPet{


    public OrganicCat(String petName, String description, int health, int hunger, int thirst, int boredom, int waste, int happiness) {
        super(petName, description, health, hunger, thirst, boredom, waste, happiness);
    }

    @Override
    public void showStatus() {
        System.out.println("Pet name " + petName + " Pet description "
                + getDescription() + " Pet Health " + getHealth()
                + " Pet Happiness " + getHappiness() + " Pet hunger " + getHunger() + " Pet thirst " + getThirst() + " Pet boredom " + getBoredom() + " Pet waste " + getWaste());

    }
}
