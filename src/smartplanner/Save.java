/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartplanner;

/**
 *
 * @author kerbag and Douglas
 */
public class Save {

    public Save() {
    }
    
    public void saveCategory(String name, String color, String email){
        Connectivity c =new Connectivity();
        c.addCategory(name, color, email);
    
    }
    
}
