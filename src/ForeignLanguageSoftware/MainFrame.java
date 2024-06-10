/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ForeignLanguageSoftware;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * MainFrame class for the GUI of the application Handles user interactions and
 * updates the UI accordingly
 *
 * @author marcos
 */
public class MainFrame extends javax.swing.JFrame {

    private int currentIndex = 0;
    private String[] currentWord;
    private String[] currentTranslation;
    private DisplayWords dw;
    private int score = 0;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        // Initialize DisplayWords object
        dw = new DisplayWords();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        selectLanguage = new javax.swing.JComboBox<>();
        displayWordsButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        knowIt = new javax.swing.JButton();
        dontKnow = new javax.swing.JButton();
        nextWord = new javax.swing.JButton();
        scoreCounter = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Welcome To The Foreign Language Learning Software");

        selectLanguage.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        selectLanguage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Language", "Spanish", "Italian", "French" }));
        selectLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectLanguageActionPerformed(evt);
            }
        });

        displayWordsButton.setBackground(new java.awt.Color(0, 0, 0));
        displayWordsButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        displayWordsButton.setForeground(new java.awt.Color(255, 255, 255));
        displayWordsButton.setText("Display Words");
        displayWordsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayWordsButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 0, 0));
        exitButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Words Will Display Here");
        jTextArea1.setToolTipText("");
        jScrollPane1.setViewportView(jTextArea1);

        knowIt.setBackground(new java.awt.Color(0, 0, 0));
        knowIt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        knowIt.setForeground(new java.awt.Color(255, 255, 255));
        knowIt.setText("I Know It");
        knowIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knowItActionPerformed(evt);
            }
        });

        dontKnow.setBackground(new java.awt.Color(0, 0, 0));
        dontKnow.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dontKnow.setForeground(new java.awt.Color(255, 255, 255));
        dontKnow.setText("I Don't Know It");
        dontKnow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dontKnowActionPerformed(evt);
            }
        });

        nextWord.setBackground(new java.awt.Color(0, 0, 0));
        nextWord.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nextWord.setForeground(new java.awt.Color(255, 255, 255));
        nextWord.setText("Next Word");
        nextWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextWordActionPerformed(evt);
            }
        });

        scoreCounter.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        scoreCounter.setText("0");

        scoreLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        scoreLabel.setText("Score:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(displayWordsButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(scoreLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(scoreCounter)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nextWord)
                        .addGap(118, 118, 118))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dontKnow)
                                .addGap(30, 30, 30)
                                .addComponent(knowIt)))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayWordsButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scoreLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scoreCounter))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dontKnow)
                    .addComponent(knowIt)
                    .addComponent(nextWord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectLanguageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectLanguageActionPerformed

    private void displayWordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayWordsButtonActionPerformed
        // Method to display words based on selected language
        String selectedLanguage = (String) selectLanguage.getSelectedItem();
        jTextArea1.setText("");
        
        // If-statement to verify language selection 
        if ("Select Language".equals(selectedLanguage)) {
            jTextArea1.setText("Please select a language");
        } else {

            switch (selectedLanguage) {
                case "Spanish":
                    dw.wordDisplay("./Words/Spanish.txt");
                    break;
                case "Italian":
                    dw.wordDisplay("./Words/Italian.txt");
                    break;
                case "French":
                    dw.wordDisplay("./Words/French.txt");
                    break;
            }

            currentWord = dw.getWords();
            currentTranslation = dw.getTranslations();
            currentIndex = 0;

            if (currentWord.length > 0) {
                jTextArea1.setText(currentWord[currentIndex]);
            } else {
                jTextArea1.setText("No words available for chosen language");
            }
        }
    }//GEN-LAST:event_displayWordsButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // Exit application
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void dontKnowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dontKnowActionPerformed
        // "I Don't Know It" button
        if (currentTranslation != null && currentIndex < currentTranslation.length) {
            jTextArea1.setText("The Correct Translation is: " + currentTranslation[currentIndex] + "\n(click Next Word button)");
        }
    }//GEN-LAST:event_dontKnowActionPerformed

    private void knowItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knowItActionPerformed
         //OpenAI. (2024). Code for "I Know It" button. Retrieved from OpenAI
        // "I Know It" button
        if (currentWord != null && currentIndex < currentWord.length) {
            String translationInput = JOptionPane.showInputDialog(this, "Enter the translation:");
            if (translationInput != null && translationInput.equalsIgnoreCase(currentTranslation[currentIndex])) {
                JOptionPane.showMessageDialog(this, "Correct translation!");
                score++;
                dw.incrementScore();
                scoreCounter.setText("" + score);
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect \nThe correct translation is: " + currentTranslation[currentIndex]);
            }

            currentIndex++;
            if (currentIndex < currentWord.length) {
                jTextArea1.setText(currentWord[currentIndex]);
            } else {
                jTextArea1.setText("No more words to display");
                dw.saveScores();
            }
        }
    }//GEN-LAST:event_knowItActionPerformed

    private void nextWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextWordActionPerformed
        // "Next Word" button
        currentIndex++;

        if (currentIndex < currentWord.length) {
            jTextArea1.setText(currentWord[currentIndex]);
        } else {
            jTextArea1.setText("No more words to display");
            dw.saveScores();
        }
    }//GEN-LAST:event_nextWordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton displayWordsButton;
    private javax.swing.JButton dontKnow;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton knowIt;
    private javax.swing.JButton nextWord;
    private javax.swing.JLabel scoreCounter;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JComboBox<String> selectLanguage;
    // End of variables declaration//GEN-END:variables
}
