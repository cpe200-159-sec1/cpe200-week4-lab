package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;

    public User() {

    }

    public boolean setUserName(String name) {
        String z = "[a-zA-Z][a-zA-Z0-9]{7,}";
        if (name.matches(z)) {
            userName = name;
            return true;
        }
        return false;
    }

    public boolean setPassword(String name) {
        String z = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}";
        if (name.matches(z)) {
            password = name;
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
