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

    public void getShelter() {
        for (Entry<String, VirtualPet> entry : pets.entrySet()) {
            entry.getValue().showStatus();

        }
    }
    public void removePet(String petName) {
        pets.remove(petName);

    }

    public void feedChargeAll() {
        for (Entry<String, VirtualPet> entry : pets.entrySet()) {

            if (entry instanceof OrganicPet) {
                ((OrganicPet) entry.getValue()).feed();
            }
            else if (entry instanceof RoboticPet) {
                ((RoboticPet) entry.getValue()).addBattery();
            }


        }
    }


    public void TickAll() {
        for (Entry<String, VirtualPet> entry : pets.entrySet()) {

            entry.getValue().Tick();
        }
    }
        }