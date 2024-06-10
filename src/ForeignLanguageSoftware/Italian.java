/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForeignLanguageSoftware;

/**
 * Italian class extends AbstractLanguage. Initializes the path to the Italian
 * words file
 *
 * @author marcos
 */
public class Italian extends AbstractLanguage {

    public Italian() {
        super("./Words/Italian.txt");
    }

    @Override
    public String getLanguageName() {
        return "Italian";
    }
}
