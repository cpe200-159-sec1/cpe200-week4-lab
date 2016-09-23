package cpe200;
import java.util.ArrayList;
public class Users {
     public ArrayList<User> userList ;

            public Users() {
                userList = new ArrayList<>();

                    }

    public void addUser(User user)
    {
                userList.add(user);
    }

    public void addUser(String userName, String password)
    {
               User temp = new User();
                temp.setUserName(userName);
                temp.setPassword(password);
                userList.add(temp);
    }

    public void deleteUser(User user)
    {
                        userList.remove(user);
    }

    public boolean exists(User user)
    {

               return userList.contains(user);
    }

    public boolean usernameExists(String username)
    {
                for(int i = 0 ; i < userList.size() ; i++){
                   if(userList.get(i).getUserName()== username)
                            return true;
                }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
               for(int i = 0 ; i < userList.size() ; i++){
                    if(userList.get(i).getUserName() == userName){
                            return userList.get(i);
                       }
               }
        return null;
    }

    public int count()
    {

                return userList.size();
    }

    public User[] getUserArray()
    {
                       return userList.toArray(new User[1]);
    }
}