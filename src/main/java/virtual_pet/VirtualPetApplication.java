package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        VirtualPet rustyTheDog = new VirtualPet(5, 5, 5, 0);

        System.out.println("Rusty the Dog");
        System.out.println("Hunger: " + rustyTheDog.getHunger());
        System.out.println("Thirst: " + rustyTheDog.getThirst());
        System.out.println("Boredom: " + rustyTheDog.getBoredom());
        System.out.println("Sickness: " + rustyTheDog.getSickness());

        System.out.println("What would you like to do?");
        System.out.println("1. Feed Rusty");
        System.out.println("2. Give Rusty water");
        System.out.println("3. Play with Rusty");
        System.out.println("4. Take Rusty to vet");
        System.out.println("5. Do nothing");
        System.out.println("6. Exit Game");
        String userInputDirection = userInput.nextLine();

        while (!userInputDirection.equals("6")) {
            if (userInputDirection.equals("1")) {
                rustyTheDog.feed(9);
                rustyTheDog.tick();
            }
            if (userInputDirection.equals("2")) {
                rustyTheDog.water(13);
                rustyTheDog.tick();
            }
            if (userInputDirection.equals("3")) {
                rustyTheDog.play(11);
                rustyTheDog.tick();
            }
            if (userInputDirection.equals("4")) {
                rustyTheDog.goToVet(10);
            }
            if (userInputDirection.equals("5")) {
                rustyTheDog.tick();
            }
            if (rustyTheDog.getHunger() >= 100) {
                System.out.println("Rusty got too hungry!");
                System.exit(0);
            }
            if (rustyTheDog.getSickness() >= 50) {
                System.out.println("Rusty got too sick!");
                System.exit(0);
            }
            if (rustyTheDog.getBoredom() >= 100) {
                System.out.println("Rusty got too bored and left home!");
                System.exit(0);
            }
            if (rustyTheDog.getThirst() >= 100) {
                System.out.println("Rusty got too thirsty!");
                System.exit(0);
            }

            System.out.println("Rusty the Dog");
            System.out.println("Hunger: " + rustyTheDog.getHunger());
            System.out.println("Thirst: " + rustyTheDog.getThirst());
            System.out.println("Boredom: " + rustyTheDog.getBoredom());
            System.out.println("Sickness: " + rustyTheDog.getSickness());

            System.out.println("What would you like to do?");
            System.out.println("1. Feed Rusty");
            System.out.println("2. Give Rusty water");
            System.out.println("3. Play with Rusty");
            System.out.println("4. Take Rusty to vet");
            System.out.println("5. Do nothing");
            System.out.println("6. Exit Game");
            userInputDirection = userInput.nextLine();

        }

    }

}
