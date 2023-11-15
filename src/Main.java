import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Carrot Carrot1 = new Carrot("Mike", 100);
        Carrot Carrot2 = new Carrot("Micah", 80);
        Carrot Carrot3 = new Carrot("Niko", 90);


        // Creating our array list to hold all of our produce
        ArrayList<Produce> Produce_Object_List = new ArrayList<>();
        Produce_Object_List.add(Carrot1);
        Produce_Object_List.add(Carrot2);
        Produce_Object_List.add(Carrot3);

// ------------Choosing the next produce to battle----------------------------------------------------------------
        Produce resultObject = null;

        for (Produce obj : Produce_Object_List) {
            if (obj.getHealth() > 0) {
                if (resultObject == null) {
                    resultObject = obj;
                } else {
                    // Both objects have health greater than 0, so the loop continues
                    resultObject = null;
                    break;
                }
            }
        }

        if (resultObject != null) {
            System.out.println("The object with health greater than 0: " + resultObject.toString());
        } else {
            System.out.println("No object has health greater than 0, or there are multiple such objects.");
        }


        Random random = new Random();
        Produce Object1 = null;
        Produce Object2 = null;
        while (Object1 == null || Object2 == null) {
            int randomIndex = random.nextInt(Produce_Object_List.size());
            Produce selectedObject = Produce_Object_List.get(randomIndex);

            if (selectedObject.getHealth() > 0) {
                if (Object1 == null) {
                    Object1 = selectedObject;
                } else if (Object2 == null && !selectedObject.equals(Object1)) {
                    Object2 = selectedObject;
                }
            }

            // Check if there are no more eligible objects
            if (Produce_Object_List.stream().noneMatch(obj -> obj.getHealth() > 0)) {
                System.out.println("Game Over! No more objects with health greater than 0.");
                break;
            }

        }
        System.out.println("\n\nUp next is, " + Object1.getName() + " VS. " + Object2.getName() + "!");
// ------------Battle (Including user choose)-----------------------
        int userChoice = getUserChoice(Object1);

        switch (userChoice) {
            case 1:
                Object1.attack(Object2);
                break;
            case 2:
                Object1.heal(Object1);
                break;
            case 3:
                Object1.give_up(Object1);
                break;
            case 4:
                Object1.special_move(Object2, Object1);
                break;
            default:
                System.out.println("An error occurred, exciting program");
                System.exit(0);
        }

// ----------Display results-----------------------------------------
        System.out.println("\n" + Object1.getName() + " now has " + Object1.getHealth() + " health points, and "
                + Object2.getName() + " now has " + Object2.getHealth() + " health points");
// Game end conditions




    } // End of main

    // -------User Choosing Logic--------------------------------------------------------

    /**
     *
     * @param currentProduce - Produce - Whoever's turn it is to go.
     * @return userChoice - int - Number corresponds for a move type that will be executed.
     */
    public static int getUserChoice(Produce currentProduce){
        Scanner input = new Scanner(System.in);

        String[] list_options = {
                "Attack",
                "Heal",
                "Give Up",
                "Special Move"
        };

        System.out.println("Select an option for " + currentProduce.getName());

        // Display options with corresponding numbers
        for (int i = 0; i < list_options.length; i++) {
            System.out.println((i + 1) + ". " + list_options[i]);
        }

        System.out.print("Enter the number of your choice: ");

        // Validate user input
        int userChoice = 0;
        while (true) {
            if (input.hasNextInt()) {
                userChoice = input.nextInt();
                if (userChoice >= 1 && userChoice <= list_options.length) {
                    break;
                } else {
                    System.out.print("Invalid input. Please enter a number between 1 and " + list_options.length + ": ");
                }
            } else {
                System.out.print("Invalid input. Please enter a number: ");
                input.next(); // Consume invalid input
            }
        }

        // Display the chosen option
        System.out.println(currentProduce.getName() + " will: " + list_options[userChoice - 1]);

        return userChoice;
    }
}