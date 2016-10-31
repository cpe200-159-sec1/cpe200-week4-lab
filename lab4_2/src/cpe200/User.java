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
        String checkName = new String("^[A-Za-z][0-9A-Za-z]{7,}$");
        if (name.matches(checkName) == true) {
            this.userName = name;
            return true;
        } else {
            return false;
        }
    }

    public boolean setPassword(String name) {
        String checkpassword = new String("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]{12,})$");
        if (name.matches(checkpassword) == true) {
            this.password = name;
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
