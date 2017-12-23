package smartplanner;

/**
 *
 * @author kerbag and Douglas
 */

public class Category {
    private String color;
    private String name;
    private int uniqueID;
    
    
    public Category(String color, String name, int uniqueID) {
        this.color = color;
        this.name = name;
        this.uniqueID = uniqueID;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUniqueID(Connectivity c) {       
        int nextRow = c.getNextRow() + 1;
        this.uniqueID = nextRow;
    }
    


    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getUniqueID() {      
        return uniqueID;
    }
    
    
}
