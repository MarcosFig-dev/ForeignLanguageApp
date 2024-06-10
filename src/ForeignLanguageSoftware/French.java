/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForeignLanguageSoftware;

/**
 * French class extends AbstractLanguage. Initializes with the path to the
 * French words file
 *
 * @author marcos
 */
public class French extends AbstractLanguage {

    public French() {
        super("./Words/French.txt");
    }

    @Override
    public String getLanguageName() {
        return "French";
    }
}
