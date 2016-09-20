package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User() {
    }

    public User(String userName,String password) {
        setUserName(userName);
        setPassword(password);
    }

    public boolean setUserName(String name) {
        String test1 = "[A-Za-z][\\w\\d]{7,}";
        if(name.matches(test1)){
            this.userName = name;
            return true;
        }else {
            return false;
        }
    }

    public boolean setPassword(String name) {
        String test2 = "(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d])[\\w\\d]{12,}";
        if(name.matches(test2)){
            this.password = name;
            return true;
        }else {
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
