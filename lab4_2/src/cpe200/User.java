package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User() {
    }

    public User(String user, String pwd){
        setUserName(user);
        setPassword(pwd);
    }

    public boolean setUserName(String name) {
        String rexUser ="^[a-zA-Z][A-Za-z0-9]{7,}$";
        if(name.matches(rexUser)){
            userName = name;
            return true;
        }return false;
    }

    public boolean setPassword(String name) {
        String rexPass ="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}$";
        if(name.matches(rexPass)){
            password = name;
            return true;
        }return false;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
