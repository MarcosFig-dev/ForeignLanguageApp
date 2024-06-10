/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForeignLanguageSoftware;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author marcos
 */
public class MainFrame extends JFrame{
    
    private JComboBox<String> languageComboBox;
    private JTextArea displayArea;
    private JButton displayButton;
    private JButton exitButton;
    
    private Language spanish;
    private Language italian;
    private Language french;
    
    public MainFrame(){
        spanish = new Spanish();
        italian = new Italian();
        french = new French();
        
        setTitle("Foreign Language Software");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        String[] languages = {"Select a language", "Spanish", "Italian", "French"};
        languageComboBox = new JComboBox<>(languages);
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayButton = new JButton("Display Words");
        exitButton = new JButton("EXIT");
        
        displayButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                displaySelectedLanguage();
            }
        });
        
        exitButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(new JLabel("Select Language:"));
        topPanel.add(languageComboBox);
        
        JPanel bottomPanel = new JPanel(new FlowLayout());
        bottomPanel.add(displayButton);
        bottomPanel.add(exitButton);
        
        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }
    
    public void displaySelectedLanguage(){
        String selectedLanguage = (String) languageComboBox.getSelectedItem();
        displayArea.setText("");
        
        if(selectedLanguage.equals("Select a language")){
            displayArea.append("Please select a language\n");
        }
        else{
            displayArea.append("Displaying " + selectedLanguage + " words\n");
            
            switch(selectedLanguage){
                case "Spanish": 
                    displayWords("./Words/Spanish.txt");
                    break;
                case "Italian":
                    displayWords("./Words/Italian.txt");
                    break;
                case "French":
                    displayWords("./Words/French.txt");
                    break;
            }
        }
    }
    
    private void displayWords(String fileName){
        DisplayWords dw = new DisplayWords();
        dw.wordDisplay(fileName);
        
        String[] words = dw.getWords();
        String[] translations = dw.getTranslations();
        
        for(int i = 0; i < words.length; i++){
            displayArea.append(words[i] + "-" + translations[i] + "\n");
        }
    }
}
