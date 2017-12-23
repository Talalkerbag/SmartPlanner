package smartplanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author kerbag and Douglas
 */
public class Connectivity //create class Connectivity
{
    // JDBC driver name and database URL

    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private ArrayList<Category> category =  new ArrayList<>();
    private final String DB_URL = "jdbc:mysql://localhost:3306/planner";
    private Connection conn = null;//create object of Connection and define it null
    //  Database credentials
    private final String USER = "root";
    private final String PASS = "";

    public void dbConnect() throws ClassNotFoundException, SQLException {
        //STEP 2: Register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");
        //STEP 3: Open a connection
        System.out.println("Connecting to a selected database...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        //print on console
        System.out.println("Connected database successfully...");

        //create tatement
        Statement myStmt = conn.createStatement();
        //execute query
    }

    public void register(String firstName, String lastName, String email, String password, String phone) {

        try //try block
        {
             //STEP 2: Register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");
        //STEP 3: Open a connection
        System.out.println("Connecting to a selected database...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        //print on console
        System.out.println("Connected database successfully...");

        //create tatement
        Statement myStmt = conn.createStatement();
        //execute query

            String sql = "INSERT INTO user (first_name, last_name, email, password, phone)" + " values (?, ?, ?, ?, ?)";

            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, firstName);
            pst.setString(2, lastName);
            pst.setString(3, email);
            pst.setString(4, password);
            pst.setString(5, phone);
            System.out.print("regitered");
            pst.execute();
        } catch (SQLException se) //catch block
        {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) //catch block
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally //finally block
        {
            //finally block used to close resources
            try //try block
            {
                if (conn != null)//condition
                {
                    conn.close(); //close connection
                }
            } catch (SQLException se)//Handle errors
            {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!"); //print on console
    }

    public boolean login(String email, String password) {
        try {
             //STEP 2: Register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");
        //STEP 3: Open a connection
        System.out.println("Connecting to a selected database...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        //print on console
        System.out.println("Connected database successfully...");

        //create tatement
        Statement myStmt = conn.createStatement();
        //execute query           
            String sql = "Select email,password from user where email=? and password=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            } 
            else {
                return false;
            }
            
        } catch (Exception e) {
            return false;
        }
    }

    public int getNextRow() {
        try //try block
        {
             //STEP 2: Register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");
        //STEP 3: Open a connection
        System.out.println("Connecting to a selected database...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        //print on console
        System.out.println("Connected database for getRowsuccessfully...");

        //create tatement
        Statement myStmt = conn.createStatement();
        //execute query

            String sql = "SELECT COUNT(category_id)" + " FROM category";

            ResultSet rs =  myStmt.executeQuery(sql);
            
            rs.next();
            
            int rowCount =  rs.getInt(1);
            
            return rowCount;
            
            
            
        } catch (SQLException se) //catch block
        {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) //catch block
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally //finally block
        {
            //finally block used to close resources
            try //try block
            {
                if (conn != null)//condition
                {
                    conn.close(); //close connection
                }
            } catch (SQLException se)//Handle errors
            {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye! there was an error"); //print on console
        return 0;
    }
    
    public ArrayList<Category> getCategories(String email){
        try {
             //STEP 2: Register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");
        //STEP 3: Open a connection
        System.out.println("Connecting to a selected database...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        //print on console
        System.out.println("Connected database successfully...");

        //create tatement
        Statement myStmt = conn.createStatement();
        //execute query           
            String sql = "Select userID from user where email=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            
            int id = 0;
            if (rs.next()) {
                id =  rs.getInt(1); 
            } 
            
            String sqlQuery = "Select * from category where user_id=?";
            pst = conn.prepareStatement(sqlQuery);
            pst.setInt(1, id);
            rs = pst.executeQuery();

            while(rs.next()){
                String color = rs.getString("category_color");
                String name = rs.getString("category_name");
                int userID = rs.getInt("user_id");
                Category category1 =  new Category(color, name, userID);              
                category.add(category1);        
            }
            
            return category;


            
        } catch (Exception e) {
            System.out.println("Error");
        }
        return null;
    }
    
    public void addCategory(String name, String color, String email) {

        try //try block
        {
             //STEP 2: Register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");
        //STEP 3: Open a connection
        System.out.println("Connecting to a selected database...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        //print on console
        System.out.println("Connected database successfully...");

        //create tatement
        Statement myStmt = conn.createStatement();
        //execute query
        
        
        
            String sql = "Select userID from user where email=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
             int id = 0;
            if (rs.next()) {
                id =  rs.getInt(1); 
            } 

            sql = "INSERT INTO category (category_name, category_color, user_id)" + " values (?, ?, ?)";
            pst = conn.prepareStatement(sql);
            
            pst.setString(1, name);
            pst.setString(2, color);
            pst.setInt(3, id);
            System.out.print("category added");
            pst.execute();
        } catch (SQLException se) //catch block
        {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) //catch block
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally //finally block
        {
            //finally block used to close resources
            try //try block
            {
                if (conn != null)//condition
                {
                    conn.close(); //close connection
                }
            } catch (SQLException se)//Handle errors
            {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!"); //print on console
    }

}
