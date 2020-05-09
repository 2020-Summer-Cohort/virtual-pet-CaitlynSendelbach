package virtual_pet;

public class VirtualPet {
    private int sickness;
    private int hunger;
    private int thirst;
    private int boredom;

    public VirtualPet(int hunger, int thirst, int boredom, int sickness) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.sickness = sickness;
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

    public int getSickness() {
        return sickness;
    }

    public void tick() {
        hunger = hunger + 5;
        thirst = thirst + 5;
        boredom = boredom + 5;
    }

    public void hunger(int hungerGoesUp) {
        hunger = hunger + hungerGoesUp;
    }

    public void thirst(int thirstGoesUp) {
        thirst = thirst + thirstGoesUp;
    }

    public void boredom(int boredomGoesUp) {
        boredom = boredomGoesUp + boredom;
    }

    public void feed(int hungerGoesDown) {
        if (hunger > hungerGoesDown) {
            hunger = hunger - hungerGoesDown;
            thirst = thirst + 3;
        } else {
            hunger -= hunger;
            thirst = thirst + 3;
        }
    }

    public void water(int thirstGoesDown) {
        if (thirst > thirstGoesDown) {
            thirst = thirst - thirstGoesDown;
        } else {
            thirst -= thirst;
        }
    }

    public void play(int boredomGoesDown) {
        if (boredom > boredomGoesDown) {
            boredom = boredom - boredomGoesDown;
        } else {
            boredom -= boredom;
        }
        hunger = hunger + 3;
        sickness = sickness + 5;
    }

    public void goToVet(int sicknessGoesDown) {
        if (sickness > sicknessGoesDown) {
            sickness = sickness - sicknessGoesDown;
        } else {
            sickness -= sickness;
        }
    }
}

