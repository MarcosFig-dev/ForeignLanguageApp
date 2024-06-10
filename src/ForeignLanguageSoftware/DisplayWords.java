/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForeignLanguageSoftware;

import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class DisplayWords {
    
    private String[] words;
    private String[] translations;
    private int currentIndex = 0;
    
    //Method to display Spanish words (used in main method)
    public void wordDisplay(String fileName) {
        
        ReadFile fileReader = new ReadFile();
        fileReader.readWords(fileName);
        this.words = fileReader.getWords();
        this.translations = fileReader.getTranslations();
        
        //Initialize Scanner
        Scanner sc = new Scanner(System.in);

        //Initialize WriteFile
        WriteFile wf = new WriteFile();

        //Boolean variable to exit while loop
        boolean running = true;

        //While loop to create CUI
        while (running) {
            System.out.println("\nCurrent word: " + words[currentIndex]);
            System.out.println("Do you know this word?\n");
            System.out.println("(1) Yes (Enter Translation)");
            System.out.println("(2) No (Show Translation)");
            System.out.println("(3) Back to main menu\n");
            //String variable to store user input
            String input = sc.nextLine();

            //Switch statment to check user input
            switch (input) {
                case "1":
                    System.out.println("Enter translation: ");
                    String enteredTranslation = sc.nextLine();

                    if (enteredTranslation.equalsIgnoreCase(translations[currentIndex])) {
                        System.out.println("\nCorrect translation!");
                        wf.incrementScore();
                    } else {
                        System.out.println("\nIncorrect \nThe correct translation is: " + translations[currentIndex]);
                    }

                    if (currentIndex < words.length - 1) {
                        currentIndex++;
                    } else {
                        System.out.println("\nNo more words to display");
                        System.out.println("Scores saved to desktop as Scores.txt");
                        wf.writeToFile();
                        running = false;
                    }

                    break;
                case "2":
                    //If statment to check if there is a previous word
                    System.out.println("Translation: " + translations[currentIndex]);

                    if (currentIndex < words.length - 1) {
                        currentIndex++;
                    } else {
                        System.out.println("\nNo more words to display");
                        System.out.println("Scores saved to desktop as Scores.txt");
                        wf.writeToFile();
                        System.exit(0);
                    }
                    break;
                case "3":
                    running = false;
                    break;
                default:
                    //Exits the loop if any other String is inputted 
                    System.out.println("\nInvalid input, enter a valid number corresponding to one of the displayed options\n");
                    break;
            }

        }
    }
    
    public String[] getWords(){
        return words;
    }
    
    public String[] getTranslations(){
        return translations;
    }
    
}