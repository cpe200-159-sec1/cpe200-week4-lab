package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;

    public User() {
        userName = new String();
        password = new String();

    }
    public User(String userName,String password){

    }

    public boolean setUserName(String name) {
        if (name.length() >= 8){

            if (Character.isDigit(name.charAt(0)) != true) {

                for (int i = 0; i <= name.length(); i++) {
                    if (i == name.length()) {
                        userName=name; return true;
                    }if (Character.isAlphabetic(name.charAt(i)) != true && Character.isDigit(name.charAt(i)) != true)
                        return false;
                }
            }
        }else return false;

        return false;
    }


    public boolean setPassword(String name){
        if (name.length() >= 12) {
            boolean haveNumber=false, haveUpper=false, haveLower=false;
            for (int i = 0; i < name.length(); i++) {
                if (Character.isDigit(name.charAt(i))) haveNumber = true;
                else if (Character.isUpperCase(name.charAt(i))) haveUpper = true;
                else if (Character.isLowerCase(name.charAt(i))) haveLower = true;
                if (haveNumber && haveUpper && haveLower) {
                    password = name;
                    return true;
                }
            }return false;
        }return false;
    }


    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
