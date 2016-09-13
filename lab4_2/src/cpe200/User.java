package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User() {
    }

    public User(String user,String password) {
        setUserName(user);
        setPassword(password);
    }

    public boolean setUserName(String name) {
        String rx = "[A-Za-z][0-9A-Za-z]{7,}";
        if (name.matches(rx))
        {
            this.userName = name;
            return true;
        }
        else return false;
    }

    public boolean setPassword(String name) {
        String rx = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}";
        if (name.matches(rx))
        {
            this.password = name;
            return true;
        }
        else return false;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }
}
