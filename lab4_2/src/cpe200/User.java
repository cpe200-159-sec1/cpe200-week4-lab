package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;
    private String userPattern = "^[A-Za-z][A-Za-z0-9]{7,}$";
    private String passPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}$";

    public User()
    {}

    public User(String user, String pass) {
        setUserName(user);
        setPassword(pass);
    }

    public boolean setUserName(String name)
    {
        if(name.matches(userPattern))
        {
            userName = name;
        }
        return name.matches(userPattern);
    }

    public boolean setPassword(String name)
    {
        if(name.matches(passPattern))
        {
            password = name;
        }
        return name.matches(passPattern);
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
