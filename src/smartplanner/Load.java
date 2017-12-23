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
public class Load {
    
    public Load() {
    }
    public void loadCategories(ArrayList<Category> cat) throws NoSuchFieldException {
        int xPosition = 130;
        int yPosition = 25;
        for (int i = 0; i < cat.size(); i++){
            String name = cat.get(i).getName();
            String color = cat.get(i).getColor();
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
            but.setBounds(xPosition, yPosition, 90, 90);
            xPosition = xPosition + 105;
            mainInterfacePanel.add(but);
            but.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Category: " + but.getText());
                }
            });
        }
    }
}
