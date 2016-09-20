package cpe200;

import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    private ArrayList<User> userList;

    public Users(){
        userList = new ArrayList<User>();
    }

    public Users(User user){
        addUser(user);
    }

    public void addUser(User user)    {
        userList.add(user);
    }

    public void addUser(String userName, String password) {
        User nUser = new User(userName, password);
        userList.add(nUser);
    }

    public void deleteUser(User user){
        userList.remove(user);

    }

    public boolean exists(User user){
        return userList.contains(user);
    }

    public boolean usernameExists(String username){
        for (User user: userList){
            if(user.getUserName().matches(username)){
                return true;
            }
        }return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName){
        for (User user: userList){
            if(user.getUserName().matches(userName)){
                return user;
            }
        }return null;
    }

    public int count(){
        return userList.size();
    }

    public User[] getUserArray(){
        return userList.toArray(new User[count()]);
    }
}
