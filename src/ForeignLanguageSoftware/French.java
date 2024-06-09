/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForeignLanguageSoftware;

/**
 *
 * @author marcos
 */
public class French {

    //Method to display French words (used in main method)
    public void displayFrenchWords(){
        DisplayWords dw = new DisplayWords();
        
        dw.wordDisplay("./Words/French.txt");
    }
}
