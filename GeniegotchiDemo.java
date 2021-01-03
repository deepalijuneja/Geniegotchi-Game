import java.util.Scanner;
/**
 * This program contains two public class. The first class instantiates a Geniegotchi object, prints the menu in the second class, and asks for user input until the user selects 0. The second class 'printMenu' prints 6 different statements depending on user input.  
 * @author Deepali Juneja 
 * @version 02/28/2020
 */
public class GeniegotchiDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Geniegotchi myGenie = new Geniegotchi(); // the Genie has been created as myGenie in this class
        printMenu();
        int UserInput = -1;
        while (UserInput != 0) {
            // the while loop is effective as the loops goes on until UserInput becomes 0
            System.out.print("Enter your choice: ");
            UserInput = keyboard.nextInt(); // takes the user input as an integer value
            switch (UserInput) {
                // the switch statements below asks for user to enter menu options and print the appropriate message
                case 1:
                System.out.print("Enter new name for Geniegotchi: ");
                String name = keyboard.next();
                myGenie.setName(name);
                break;

                case 2:
                myGenie.genieInfo();
                break;

                case 3:
                myGenie.feed();
                break;

                case 4:
                myGenie.play();
                break;

                case 5:
                myGenie.askFortune();
                break;

                case 6:
                printMenu();
                break;

                case 0:
                break;

                default:
                System.out.println("Sorry, this Input is invalid");
                break;
            }
        }
    }

    public static void printMenu() {
        // this method prints a welcoming message and the menu
        System.out.println("Welcome to GenieGotchi!");
        System.out.println("0- Quit");
        System.out.println("1- Rename your Geniegotchi");
        System.out.println("2- Get current stats on Geniegotchi");
        System.out.println("3- Feed your Geniegotchi");
        System.out.println("4- Play with your Geniegotchi");
        System.out.println("5- Ask your fortune!");
        System.out.println("6- Print Menu");
    }

}

