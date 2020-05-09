package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetTest {

    @Test
    public void shouldHaveDefaultHungerThirst() {
        VirtualPet petTest = new VirtualPet(5, 5, 0, 0);
        int timePassageHunger = petTest.getHunger();
        int timePassageThirst = petTest.getThirst();
        assertEquals(5, timePassageHunger);
        assertEquals(5, timePassageThirst);
    }

    @Test
    public void hungerShouldGoUp() {
        VirtualPet petTest = new VirtualPet(0, 0, 0, 0);
        petTest.hunger(5);
        int timePassage = petTest.getHunger();
        assertEquals(5, timePassage);
    }

    @Test
    public void hungerShouldGoDownFromBeingFed() {
        VirtualPet petTest = new VirtualPet(5, 5, 0, 0);
        petTest.feed(5);
        int timePassage = petTest.getHunger();
        assertEquals(0, timePassage);
    }

    @Test
    public void thirstShouldGoUp() {
        VirtualPet petTest = new VirtualPet(0, 0, 0, 0);
        petTest.thirst(5);
        int timePassage = petTest.getThirst();
        assertEquals(5, timePassage);
    }

    @Test
    public void thirstShouldGoDownFromDrink() {
        VirtualPet petTest = new VirtualPet(5, 5, 0, 0);
        petTest.water(5);
        int timePassage = petTest.getThirst();
        assertEquals(0, timePassage);
    }

    @Test
    public void hungerShouldGoDownThirstShouldGoUp() {
        VirtualPet petTest = new VirtualPet(5, 5, 0, 0);
        petTest.feed(5);
        petTest.thirst(5);
        int hunger = petTest.getHunger();
        int thirst = petTest.getThirst();
        assertEquals(0, hunger);
        assertEquals(10, thirst);
    }

    @Test
    public void boredomShouldGoUp() {
        VirtualPet petTest = new VirtualPet(0, 0, 0, 0);
        petTest.boredom(5);
        int timePassage = petTest.getBoredom();
        assertEquals(5, timePassage);
    }

    @Test
    public void boredomShouldGoDownFromPlay() {
        VirtualPet petTest = new VirtualPet(0, 0, 10, 0);
        petTest.play(5);
        int timePassage = petTest.getBoredom();
        assertEquals(5, timePassage);
    }

    @Test
    public void sicknessShouldGoUpFromPlay() {
        VirtualPet petTest = new VirtualPet(0, 0, 0, 5);
        petTest.play(5);
        int timePassage = petTest.getSickness();
        assertEquals(10, timePassage);
    }

    @Test
    public void sicknessShouldGoDownFromVet() {
        VirtualPet petTest = new VirtualPet(0, 0, 0, 5);
        petTest.goToVet(5);
        int timePassage = petTest.getSickness();
        assertEquals(0, timePassage);
    }


}
