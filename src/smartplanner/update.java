/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartplanner;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.util.ArrayList;
import javax.swing.JButton;
import static smartplanner.mainInterfaceGUI.mainInterfacePanel;

/**
 *
 * @author kerbag and Douglas
 */
public class update {

    public update() {
    }

    public void updateCategory(ArrayList<Category> cat) {
        Connectivity c = new Connectivity();
        int size = cat.size()-1;
        String name = cat.get(size).getName();
        String color = cat.get(size).getColor();
        JButton but = new JButton();
        but.setText(name);
        Color col;
        try {
            Field field = Color.class.getField(color);
            col = (Color) field.get(null);

        } catch (Exception e) {
            col = null;
        }
        but.setBackground(col);
        but.setBounds(130+(105*size), 25, 90, 90);
        mainInterfacePanel.add(but);
        mainInterfacePanel.repaint();
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Category: " + but.getText());
            }
        });
    }
}
