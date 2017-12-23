/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartplanner;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.io.*;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kerbag and Douglas
 */
public class mainInterfaceGUI {

    String categoryName;
    String categoryColor;
    JFrame mainInterfaceFrame;
    public static JPanel mainInterfacePanel;
    JButton addCategory;
    Connectivity c = new Connectivity();
    Save save = new Save();
    Load load = new Load();
    update update = new update();

    public mainInterfaceGUI() {
    } //Default Constructor

    public void createGUI(String email) {
        //This method will initate the starting Interface as the user logs in
        mainInterfaceFrame = new JFrame("Smart Planner");
        mainInterfaceFrame.setSize(1300, 650);
        mainInterfaceFrame.setLocationRelativeTo(null); //if set to null, centers in the middle of the screen
        mainInterfaceFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //States what happens on closing of frame. Very important
        mainInterfaceFrame.setLayout(null);
        mainInterfaceFrame.setVisible(true);

        mainInterfacePanel = new JPanel();
        mainInterfacePanel.setSize(1300, 650);
        mainInterfacePanel.setBorder(new TitledBorder("Categories"));
        mainInterfacePanel.setLayout(null);

        addCategory = new JButton();
        addCategory.setText("+");
        addCategory.setFont(new Font("Arial", Font.PLAIN, 40));
        addCategory.setForeground(java.awt.Color.GRAY);
        addCategory.setBackground(java.awt.Color.WHITE);
        addCategory.setToolTipText("Add a Category");
        addCategory.setBounds(25, 25, 90, 90);

        mainInterfaceFrame.add(mainInterfacePanel);
        mainInterfacePanel.add(addCategory);
        addCategory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Create Category");
                try {
                    categoryPopUp(email);
                } catch (NoSuchFieldException ex) {
                    Logger.getLogger(mainInterfaceGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    public void categoryPopUp(String email) throws NoSuchFieldException {
        JFrame parent = new JFrame();
        String name = JOptionPane.showInputDialog(parent,
                        "Category Title", null);
        String color = JOptionPane.showInputDialog(parent,
                        "Category Color", null);
        save.saveCategory(name, color,email);
        update.updateCategory(c.getCategories(email));
        
    }
}
