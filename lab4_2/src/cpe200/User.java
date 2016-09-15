package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User(){

    }

    public User(String userName,String password) {
        setUserName(userName);
        setPassword(password);
    }

    public boolean setUserName(String name) {
        String tmp = "[A-Za-z][A-Za-z0-9]{7,}";
        if(name.matches(tmp)) {
            userName = name;
            return true;
        }else return false;

    }

    public boolean setPassword(String id) {
        String tmp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}$";
        if(id.matches(tmp)) {
            password = id;
            return true;
        }else return false;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
