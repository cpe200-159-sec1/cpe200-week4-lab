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

        String regex = "^[A-Za-z][A-Za-z0-9]{7,}$";
           if(name.matches(regex)) {
                   this.userName = name;
                     return true;
           }
        return false;
    }

    public boolean setPassword(String name) {

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]{12,})$";
        if(name.matches(regex)) {
            this.password = name;
            return true;
        }
        return false;

    }

    public String getUserName() {
        return  this.userName;
    }

    public String getPassword() {
        return  this.password;
    }
}
