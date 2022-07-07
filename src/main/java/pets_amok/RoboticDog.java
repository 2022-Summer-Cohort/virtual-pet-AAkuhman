package pets_amok;

public class RoboticDog extends RoboticPet implements WalkDog {


    public RoboticDog(String petName, String description, int health, int oil, int battery, int happiness) {
        super(petName, description, health, oil, battery, happiness);
    }


    @Override
    public void Tick() {

    }

    @Override
    public void walk() {
        this.battery -= 5;
        this.oil -= 5;
        this.happiness += 10;
    }
}

