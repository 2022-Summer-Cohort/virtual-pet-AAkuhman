package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class VirtualPetShelter {
    private int LitterBox = 0;

   protected Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();


    public void oilAllRoboticPets() {
        for (VirtualPet shelter : pets.values()) {

        }
    }

    public Collection<VirtualPet> shelter() {
        return pets.values();
    }

    public void addPet(VirtualPet petToAdd) {
        pets.put(petToAdd.getPetName(), petToAdd);
    }

    public VirtualPet findPet(String petName) {
        return pets.get(petName);
    }

    public Map<String, VirtualPet> getPets() {
        return pets;
    }

    public void getStatusAll() {
        for (Entry<String, VirtualPet> entry : pets.entrySet()) {
            entry.getValue().showStatus();

        }
    }
    public void removePet(String petName) {
        pets.remove(petName);

    }

    public void feedChargeAll() {
        for (Entry<String, VirtualPet> entry : pets.entrySet()) {

            if (entry.getValue() instanceof OrganicPet) {
                ((OrganicPet) entry.getValue()).feed();
            }
            else if (entry.getValue() instanceof RoboticPet) {
                ((RoboticPet) entry.getValue()).addBattery();
            }


        }
    }
    public void walkAll() {
        for (Entry<String, VirtualPet> entry : pets.entrySet()) {

            if (entry.getValue() instanceof OrganicDog) {
                ((OrganicDog) entry.getValue()).walk();
            }
            else if (entry.getValue() instanceof RoboticDog) {
                ((RoboticDog) entry.getValue()).walk();
            }


        }
    }

    public void wasteAll() {
        for (Entry<String, VirtualPet> entry : pets.entrySet()) {

            if (entry.getValue() instanceof OrganicPet) {
                ((OrganicPet) entry.getValue()).waste();
            }


        }
    }

    public void waterAll() {
        for (Entry<String, VirtualPet> entry : pets.entrySet()) {

            if (entry.getValue() instanceof OrganicPet) {
                ((OrganicPet) entry.getValue()).watered();
            }


        }
    }

    public void playAll() {
        for (Entry<String, VirtualPet> entry : pets.entrySet()) {

            entry.getValue().played();


        }
    }


    public void TickAll() {
        for (Entry<String, VirtualPet> entry : pets.entrySet()) {

            entry.getValue().Tick();
        }
    }
        }