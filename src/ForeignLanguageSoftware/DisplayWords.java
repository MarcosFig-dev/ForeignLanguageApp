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
import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class DisplayWords {

    private String[] words;
    private String[] translations;
    private int currentIndex = 0;
    private ReadFile fileReader;
    private WriteFile writeFile;

    public DisplayWords() {
        fileReader = new ReadFile();
        writeFile = new WriteFile();
    }

    //Method to display Spanish words (used in main method)
    public void wordDisplay(String fileName) {
        fileReader.readWords(fileName);
        words = fileReader.getWords();
        translations = fileReader.getTranslations();
    }

    public String[] getWords() {
        return words;
    }

    public String[] getTranslations() {
        return translations;
    }

}
