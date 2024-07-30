import java.util.Scanner;
import java.util.Random;

public class SimpleTextGame {
    public static int health = 100;
    public static int score = 0;

    public static void main(String[] args) {
        System.out.println("Welcome To The Text Adventure Game!");
        System.out.println(); System.out.println();
        startGame();
        clear();
    }
    public static void confir()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Start The Game");
        System.out.println("2. End The Game");
        System.out.print("Enter Your Choice: ");

        int choice = scanner.nextInt();

        if(choice == 1)
            startGame();
        else
        {
            System.out.println();
            System.out.println("Game Over!");
            System.out.println("You Health Score: "+ health);
            System.out.println("You Collected Score: "+ score);
        }
        pause();
        clear();
        scanner.close();
    }

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You Find Youself In A Mysterious Place: ");
        System.out.println("1. Explore The Dark Cave");
        System.out.println("2. Walk Through The Enchanted Forest");
        System.out.print("Enter Your Choice: ");

        int choice = scanner.nextInt();
        System.out.println();

        clear();
        if (choice == 1)
        {
            exploreCave();
        }
        else if (choice == 2)
        {
            enterForest();
        }
        else
        {
            System.out.println("Invalid Choice. Game Over!");
        }

        clear();
        scanner.close();
    }

    public static void exploreCave() {
        System.out.println("You Enter The Dark Cave And Discover A Treasure Chest!");
        System.out.println("1. Open The Chest");
        System.out.println("2. Leave The Cave");
        System.out.print("Enter Your Choice: ");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        System.out.println(); System.out.println();

        if (choice == 1) {
            int z = exploreRandom();
            if(z == 0)
            {
                System.out.println("A Dragon Comes Out & It Eats You Alive");
                System.out.println("Sorry! You Died.");
                System.out.println("You Collected Score: "+ score);
                pause();
            }
            else
            {
                System.out.println("You Find Out Tresure!");
                score = score + 20;
                System.out.println("Your Score: "+ score);
                System.out.println("You Are Now Good To Go Ahead");
                pause();
                clear();
                confir();
            }
        }
        else if (choice == 2)
        {
            System.out.println("You Leave The Cave And Continue Your Adventure.");
            confir();
        }
        else
        {
            System.out.println("Invalid Choice. Game Over!");
        }

        scanner.close();
    }

    public static int exploreRandom() {
        Random rand = new Random();
        int ran = rand.nextInt(2);
        return ran;
    }

    public static void enterForest() {
        System.out.println("You Walk Through The Enchanted Forest And Encounter A Dangerous Creature");
        System.out.println("1. Fight With The Creature");
        System.out.println("2. Continue Walking");
        System.out.print("Enter Your Choice: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        clear();
        if (choice == 1)
        {
            int z = exploreRandom();
            if(z == 0)
            {
                System.out.println("The Creature Wins & Ate You Alive");
                System.out.println("Sorry! You Died.");
                System.out.println("You Collected Score: "+ score);
                pause();
            }
            else
            {
                System.out.println("You Win The Battle");
                score = score + 20;
                System.out.println("Your Score: "+ score);
                System.out.println("You Are Now Good To Go Ahead");
                pause();
                clear();
                confir();
            }
        }
        else if (choice == 2)
        {
            System.out.println("You Continue Walking Through The Forest");
            confir();
        }
        else
        {
            System.out.println("Invalid Choice. Game Over!");
        }

        scanner.close();
    }
    public static void pause() {
        Scanner s = new Scanner(System.in);
        s.next();
        s.close();
    }
    public static void clear()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}