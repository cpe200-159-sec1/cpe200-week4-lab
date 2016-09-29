package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User() {
    }

    public User(String name,String pass)
    {
        this.setUserName(name);
        this.setPassword(pass);
    }

    public boolean setUserName(String name)
    {
        if(name.matches("^[a-zA-Z][a-zA-Z0-9]{7,}$"))
        {
            this.userName=name;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean setPassword(String name)
    {
        if(name.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}$"))
        {
            this.password=name;
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getUserName()
    {
        return this.userName;
    }

    public String getPassword()
    {
        return this.password;
    }
}
