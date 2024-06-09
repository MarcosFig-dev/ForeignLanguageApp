/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForeignLanguageSoftware;

/**
 *
 * @author marcos
 */
public class Spanish extends AbstractLanguage{

    public Spanish(){
        super("./Words/Spanish.txt");
    }
    
    @Override
    public String getLanguageName(){
        return "Spanish";
    }
}