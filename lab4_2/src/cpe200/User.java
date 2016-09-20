package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;
    private String userPattern = "^[A-Za-z][A-Za-z0-9]{7,}$";
    private String passPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}$";

    public User() {
    }

    public boolean setUserName(String name) {

        if(name.matches(userPattern)){
            userName = name;
            return true;
        }
        return false;
    }

    public boolean setPassword(String PS) {

        if(PS.matches(passPattern)) {
            password = PS;
            return true;
        }
        return  false;
    }

    public String getUserName() {

        return userName;
    }

    public String getPassword() {

        return password;
    }
}
