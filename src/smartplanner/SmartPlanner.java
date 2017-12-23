/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartplanner;

import java.util.ArrayList;

/**
 *
 * @author kerbag and Douglas
 */
public class SmartPlanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchFieldException {
        // TODO code application logic here
        System.out.println("email: " + args[0]);
        System.out.println("main");
        mainInterfaceGUI myGUI = new mainInterfaceGUI();
        Load load = new Load();
        Connectivity c = new Connectivity();
        myGUI.createGUI(args[0]);
        System.out.println("email: " + args[0]);
        load.loadCategories(c.getCategories(args[0]));
        
        
//        Connectivity c=  new Connectivity();
//        ArrayList<Category> cat =  new ArrayList<>();
//        cat =  c.getCategories("kerbag@gmail.com");
//        
//       
//        for(int i = 0; i < cat.size(); i++){
//            System.out.println(cat.get(i).getName());
//            System.out.println(cat.get(i).getColor());
//            System.out.println(cat.get(i).getUniqueID());       
//        }
        
        
        
        
    }
    
}
