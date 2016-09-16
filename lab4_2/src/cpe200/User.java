package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {

    private static final String USERNAME_PATTERN = "^[A-Za-z][A-Za-z0-9]{7,}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{12,}$";

    private String userName;
    private String password;

    public User() {
    }

    public boolean setUserName(String userName) {
        if (userName.matches(USERNAME_PATTERN)) {
            this.userName = userName;
            return true;
        }
        return false;
    }

    public boolean setPassword(String password) {
        if (password.matches(PASSWORD_PATTERN)) {
            this.password = password;
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
