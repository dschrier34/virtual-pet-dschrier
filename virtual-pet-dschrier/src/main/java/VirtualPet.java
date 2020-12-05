

public class VirtualPet {
    private int hunger_thirst;
    private int play;
    private int bored;
    private int waste;

    public VirtualPet(int hunger_thirst, int play, int bored, int waste) {
        this.hunger_thirst = hunger_thirst;
        this.play = play;
        this.bored = bored;
        this.waste = waste;
    }

    public void tick() {
        hunger_thirst++;
        play++;
        bored--;
        waste--;
    }

    public int getHunger_thirst() {
        return hunger_thirst;
    }

    public int getPlay() {
        return play;
    }

    public int getBored() {
        return bored;
    }

    public int getWaste() {
        return waste;
    }


    public void chow() {
        this.hunger_thirst += 10;
        this.play -= 10;
        this.waste += 10;
    }

    public void activity() {
        this.play += 10;
        this.bored -= 10;
        this.hunger_thirst -= 10;
    }

    public void potty() {
        this.waste -= 10;
        this.hunger_thirst -= 10;
        this.play -= 10;
    }

}




