package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;

    public User() {
        setUserName("");
        setPassword("");
    }

    public boolean setUserName(String name) {
        String a = "[a-zA-Z][A-Za-z0-9]{7,}";
        if(name.matches(a)){
            userName = name;
            return true;
        }
        return false;
    }

    public boolean setPassword(String name) {
        String b = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{12,}";
        if(name.matches(b)){
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
