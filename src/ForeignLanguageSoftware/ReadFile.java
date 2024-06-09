/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForeignLanguageSoftware;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcos
 */
public class ReadFile {

    private String[] words;
    private String[] translations;

    public String[] getWords() {
        return words;
    }

    public String[] getTranslations() {
        return translations;
    }

    public ReadFile() {
    }

    public void readWords(String fileName) {
        //ArrayList to store the words read from the file
        List<String> wordList = new ArrayList<>();
        List<String> translationList = new ArrayList<>();

        //OpenAI. (2024). Code for reading words from a file. Retrieved from OpenAI.
        //BufferedReader to read lines of text from the .txt file
        try ( BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            //While loop to reach each line of the .txt file
            while ((line = reader.readLine()) != null) {
                //Splitting each line into Spanish words and their translations
                words = line.split("\\s+");
                for (int i = 0; i < words.length; i += 2) {
                    //Checking if there are both Spanish words and translations available
                    if (i + 1 < words.length) {
                        //Adding Spanish words to the wordList
                        wordList.add(words[i]);
                        //Adding translations to the translationList
                        translationList.add(words[i + 1]);
                    }
                }
            }
        } catch (IOException e) {
            //Printing the stack trace if an IOException occurs
            e.printStackTrace();
        }
        //Converting wordList to an array and assigning it to spanishWords
        words = wordList.toArray(new String[0]);
        //Converting translationList to an array and assigning it to translations
        translations = translationList.toArray(new String[0]);
    }
}
