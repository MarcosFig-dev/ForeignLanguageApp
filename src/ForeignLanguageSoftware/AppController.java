/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForeignLanguageSoftware;
import java.util.Scanner;
/**
 *
 * @author mattia
 */
public class AppController {
    public void startApp() {
        // Initialize instance of Scanner
        Scanner sc = new Scanner(System.in);

        // Initialize language objects
        Spanish spanish = new Spanish();
        Italian italian = new Italian();
        French french = new French();

        // Boolean variable to exit while loop
        boolean validation = false;

        // While loop to create CUI
        while (!validation) {
            printMenu();
            // String variable to store user input
            String choice = sc.nextLine();
            
            // switch statement to check user input
            switch (choice) {
                case "1":
                    // Run method from Spanish class to display words
                    spanish.displaySpanishWords();
                    break;
                case "2":
                    // Run method from Italian class to display words
                    italian.displayItalianWords();
                    break;
                case "3":
                    // Run method from Italian class to display words
                    french.displayFrenchWords();
                    break;
                case "4":
                    System.out.println("\n                                    GoodBye!");
                    System.exit(0);
                default:
                    System.out.println("\nInvalid Choice");
                    break;
            }
        }
    }
    private void printMenu(){
          System.out.println("\n                       === Language Selection Menu === \n");
        System.out.println("                               1. Spanish Words");
        System.out.println("                               2. Italian Words");
        System.out.println("                               3. French Words");
        System.out.println("                               4. Exit Program");
        System.out.print("\n                               Enter your choice: ");
    }
}
    

