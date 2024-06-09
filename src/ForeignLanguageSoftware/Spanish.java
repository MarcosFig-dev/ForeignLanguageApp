/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForeignLanguageSoftware;

/**
 *
 * @author marcos
 */
public class Spanish {

    //Method to display Spanish words (used in main method)
    public void displaySpanishWords(){
        DisplayWords dw = new DisplayWords();
        
        dw.wordDisplay("./Words/Spanish.txt");
    }
}