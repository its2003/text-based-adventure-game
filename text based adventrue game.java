import java.util.Scanner;

public class AdventureGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Adventure Game!");
        System.out.println("You find yourself at the entrance of a mysterious cave.");

        startAdventure(scanner);
        scanner.close();
    }

    private static void startAdventure(Scanner scanner) {
        System.out.println("Do you want to enter the cave? (yes/no)");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("yes")) {
            enterCave(scanner);
        } else if (choice.equals("no")) {
            System.out.println("You decide not to enter the cave. The adventure ends here.");
        } else {
            System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
            startAdventure(scanner);
        }
    }

    private static void enterCave(Scanner scanner) {
        System.out.println("You enter the cave and find two paths ahead.");
        System.out.println("Do you want to take the left path or the right path? (left/right)");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("left")) {
            leftPath(scanner);
        } else if (choice.equals("right")) {
            rightPath(scanner);
        } else {
            System.out.println("Invalid choice. Please enter 'left' or 'right'.");
            enterCave(scanner);
        }
    }

    private static void leftPath(Scanner scanner) {
        System.out.println("You take the left path and encounter a friendly dragon.");
        System.out.println("The dragon offers you a treasure. Do you accept it? (yes/no)");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("yes")) {
            System.out.println("You accept the treasure and live a prosperous life. Congratulations, you win!");
        } else if (choice.equals("no")) {
            System.out.println("You decline the treasure and continue your adventure.");
            System.out.println("Unfortunately, you get lost in the cave and can't find your way out. The adventure ends here.");
        } else {
            System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
            leftPath(scanner);
        }
    }

    private static void rightPath(Scanner scanner) {
        System.out.println("You take the right path and encounter a deep pit.");
        System.out.println("Do you try to jump over the pit? (yes/no)");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("yes")) {
            System.out.println("You attempt to jump over the pit, but it's too wide.");
            System.out.println("You fall into the pit and the adventure ends here.");
        } else if (choice.equals("no")) {
            System.out.println("You decide not to risk jumping over the pit and turn back.");
            System.out.println("You safely make your way out of the cave. The adventure ends here.");
        } else {
            System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
            rightPath(scanner);
        }
    }
}