package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;
    protected String userNamePattern = "^[a-zA-Z][a-zA-Z0-9]{7,}";
    protected String passwordPattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}";

    public User()
    {
        userName = "";
        password ="";
    }

    public User(String User , String Pass)
    {
        setUserName(User);
        setPassword(Pass);
    }

    public boolean setUserName(String name)
    {
        if(name.matches(userNamePattern))
        {
            userName = name;
        }
        return name.matches(userNamePattern);
    }

    public boolean setPassword(String name)
    {
        if(name.matches(passwordPattern))
        {
            password = name;
        }
        return name.matches(passwordPattern);
    }

    public String getUserName()
    {
        return userName;
    }

    public String getPassword()
    {
        return password;
    }
}
