package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;

    public String userNameForm = "^[a-zA-Z][a-zA-Z0-9]{7,}";
    public String passwordForm = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}";

    public User() {

        userName = "";
        password = "";
    }


    public boolean setUserName(String name) {
        if (name.matches(userNameForm)) {
            userName = name;
            return true;

        } else {
            return false;
        }

    }

    public boolean setPassword(String name) {
        if (name.matches(passwordForm)) {
            password = name;
            return true;

        } else {

            return false;
        }
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}