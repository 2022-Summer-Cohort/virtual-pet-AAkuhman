package pets_amok;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void shouldReturnPetName(){
        VirtualPet underTest = new OrganicDog("Mia","dog",10, 10, 10, 10, 10, 10);
        String test = underTest.getPetName();
        assertEquals(test, "Mia");
    }
    @Test
    public void shouldReturnPetDescription(){
        VirtualPet underTest = new OrganicDog("Mia","dog",10, 10, 10, 10, 10, 10);
        String test = underTest.getDescription();
        assertEquals(test, "dog");
    }
    @Test
    public void shouldReturnPetHealth(){
        VirtualPet underTest = new OrganicDog("Mia","dog",10, 10, 10, 10, 10, 10);
        int test = underTest.getHealth();
        assertEquals(test, 10);
    }
    @Test
    public void shouldReturnPetHappiness(){
        VirtualPet underTest = new OrganicDog("Mia","dog",10, 10, 10, 10, 10, 15);
        int test = underTest.getHappiness();
        assertEquals(test, 15);
    }
}
