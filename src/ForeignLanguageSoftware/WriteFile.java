/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForeignLanguageSoftware;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author marcos
 */
public class WriteFile {

    private int score;

    public WriteFile() {
        this.score = 0;
    }

    public void incrementScore() {
        this.score++;
    }

    public void writeToFile() {

        String userHome = System.getProperty("user.home");

        try {
            FileWriter fw = new FileWriter(userHome + "/Desktop/Scores.txt");

            fw.write("You got " + this.score + "/50, Well done!");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
