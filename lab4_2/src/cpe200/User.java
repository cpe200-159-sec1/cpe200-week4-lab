package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;

    public User()
    {
        /* your code here */
    }

    public boolean setUserName(String name)
    {
        String K = "[a-zA-Z][A-Za-z0-9]{7,}";
        if (name.matches(K)){
            userName = name;
            return true;
        }
        return false;
    }

    public boolean setPassword(String name)
    {
        String L = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}";
        if (name.matches(L)) {
            password = name;
            return true;
        }

        else return false;
    }

    public String getUserName()
    {
        /* your code here */
        return this.userName;
    }

    public String getPassword()
    {
        /* your code here */
        return this.password;
    }
}

