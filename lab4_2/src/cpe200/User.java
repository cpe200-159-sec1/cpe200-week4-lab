package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;
    private String userpattern = new String("^[A-Za-z][a-zA-Z0-9]{7,}$");
    private String passPattern = new String("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[a-zA-Z0-9]{12,}$");


    public User() {

    }

    public boolean setUserName(String name) {

        if (name.matches(userpattern)){                                 // check pattern
            userName = name;
            return true;
        }

        return false;
    }

    public boolean setPassword(String pass) {

        if(pass.matches(passPattern)){
            password = pass;
            return true;
        }

        return false;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
