/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForeignLanguageSoftware;

/**
 *
 * @author Marcos
 */
public abstract class AbstractLanguage implements Language{
    protected String fileName;
    
    public AbstractLanguage(String fileName){
        this.fileName = fileName;
    }
    
    public void displayWords(){
        DisplayWords dw = new DisplayWords();
        dw.wordDisplay(fileName);
    }
    
    public abstract String getLanguageName();
}
