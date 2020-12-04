import java.sql.SQLOutput;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPet myPet = new VirtualPet(50, 50, 50, 50);

        String decision = "";
        while (!decision.equalsIgnoreCase("Yes")) {

            System.out.println("\nBob the dog");
            System.out.println("\nHunger and thirst: " + myPet.getHunger_thirst());
            System.out.println("Play: " + myPet.getPlay());
            System.out.println("Bored: " + myPet.getBored());
            System.out.println("Waste: " + myPet.getWaste());

            String optionEntered = "";

            System.out.println("\nChoose an option below");
            System.out.println("1. Feed and Water Bob");
            System.out.println("2. Play with Bob");
            System.out.println("3. Bob is bored, needs attention");
            System.out.println("4. Take Bob outside to potty");
            optionEntered = input.nextLine();

            int hunger_thirst = 10;
            int play = 10;
            int bored = 10;
            int waste = 10;

            if (optionEntered.equals("1")) {
                myPet.chow();
                System.out.printf("Yeah you fed Bob a %s point treat", hunger_thirst);
                System.out.println("\nUh Oh, Bob needs to go potty and he is a little bored");

            } else if (optionEntered.equals("2")) {

            }


        }
    }
}
