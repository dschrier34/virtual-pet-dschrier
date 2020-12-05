import java.sql.SQLOutput;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPet myPet = new VirtualPet(50, 50, 50, 50);

        String decision = "";
        while (!decision.equalsIgnoreCase("Yes")) {

            System.out.println("\nEarl the dog");
            System.out.println("\nHunger and thirst: " + myPet.getHunger_thirst());
            System.out.println("Play: " + myPet.getPlay());
            System.out.println("Bored: " + myPet.getBored());
            System.out.println("Waste: " + myPet.getWaste());

            String optionEntered = "";

            System.out.println("\nChoose an option below");
            System.out.println("1. Feed and Water Earl");
            System.out.println("2. Play with Earl");
            System.out.println("3. Earl is bored, needs attention");
            System.out.println("4. Take Earl outside to potty");
            System.out.println("5. Earl has overstayed his welcome");
            optionEntered = input.nextLine();

            int hunger_thirst = 10;
            int play = 10;
            int bored = 10;
            int waste = 10;

            if (optionEntered.equals("1")) {
                myPet.chow();
                System.out.printf("Yeah you fed Earl a %s point treat", hunger_thirst);
                System.out.println("\nUh Oh, Earl needs to go potty and he is a little bored");

            } else if (optionEntered.equals("2")) {
                myPet.activity();
                System.out.println("\nAll that play has Earl exhausted and now he's a little hungry.");

            } else if (optionEntered.equals("3")) {
                myPet.activity();
                System.out.println("You gave Earl extra attention and he stopped chewing on furniture.");
                System.out.println("But now he's looking at you with puppy dog eyes because his stomach is growling.");
            } else if (optionEntered.equals("4")) {
                System.out.println("Earl needs to go outside. Tell Earl to 'get busy'!");
                System.out.println("Earl left a present for the neighbors and now it's chow time");

            } else {
                optionEntered.equals("5");
                System.out.println("Are you sure you want to kick Earl to the curb?");
                System.out.println("Enter Yes or No");
                decision = input.nextLine();

                if (decision.equalsIgnoreCase("Yes")) {
                    System.out.println("Earl looks at you with a tear in his eye");
                    System.out.println("Sorry.... ");
                    System.out.println("Good Bye Earl!");
                } else if
                (decision.equalsIgnoreCase("No")) {
                    System.out.println("Earl's happy to stay....");
                    System.out.println("But is that a steak in your hand?");
                }
            }


        }
        input.close();


    }
}

