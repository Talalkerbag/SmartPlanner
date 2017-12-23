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
public class credentialTester {

    private String first;
    private String last;
    private String email;
    private String password1;
    private String password2;
    private Connectivity c =  new Connectivity();

    public credentialTester(String first, String last, String email, String password1, String password2) {
        this.first = first;
        this.last = last;
        this.email = email;
        this.password1 = password1;
        this.password2 = password2;
    }

    public boolean validName(String name) {
        return !(name.length() < 1 && name.length() > 13 && name.contains("[0-9]+"));
    }

    public boolean validEmail(String name) {
        return (atdotChecker(name) && validCom(name));
    }

    public boolean validPassword(String name) {
        return !(name.length() < 14 && name.length() > 6);
    }

    public boolean atdotChecker(String name) {
        int at = 0;
        int dot = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.substring(i, i + 1).equals("@")) {
                at++;
            } else if (name.substring(i, i + 1).equals(".")) {
                dot++;
            }
            if (dot > at) {
                return false;
            }
            if (at > 1 || dot > 1) {
                return false;
            }
        }
        return true;
    }

    public boolean validCom(String name) {
        int position = name.length();
        String com;
        for (int i = 0; i < name.length(); i++) {
            if (name.substring(i, i + 1).equals(".")) {
                com = name.substring(i + 1, position);
                return com.equals("com");
            }
        }
        return false;
    }

    public void registerCredentialTester() {
        int correct = 0;
        if (!(validName(this.first) && validName(this.last))) {
            System.out.println("Invalid Name");
        } else {
            correct++;
        }

        if (!validEmail(this.email)) {
            System.out.println("Invalid Email");
        } else {
            correct++;
        }

        if (validPassword(this.password1)) {
            System.out.println("Invalid Password");
        } else {
            correct++;
        }

        if (!this.password1.equals(this.password2)) {
            System.out.println("Passwords do not match");
        } else {
            correct++;
        }

        if (correct == 4) {
            c.register(this.first, this.last, this.email, this.password1, null);
            signIn obj1 = new signIn();
            obj1.setVisible(true);
            signUp obj2 = new signUp();
            obj2.dispose();
            
        }
    }

}
