package cpe200;

import java.lang.ref.SoftReference;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;

    public User() {
        userName = "";
        password = "";
    }
    public User(String user,String password){
        this.userName = user;
        this.password = password;
    }

    public boolean setUserName(String name) {
        if(isUsernameValid(name)){
            this.userName = name;
            return true;
        }else return false;
    }


    public boolean setPassword(String name) {
        if(isPasswordValid(name)){
            this.password = name;
            return true;
        }else return false;

    }

    public boolean isUsernameValid(String name) {
        if (name.length() < 8){//check lengh >=8
            return false;
        }else if (Character.isDigit(name.charAt(0)) == true) {
            return false;
        }else {
            for (int i = 0; i < name.length(); i++) {
                if (Character.isAlphabetic(name.charAt(i)) == false) {
                    if (Character.isDigit(name.charAt(i)) == false){
                        return false;
                    }
                }
            }
            return true;


        }
    }

    public boolean isPasswordValid(String name){
        if (name.length() >=12){
            boolean haveDigit=false,haveCapital=false,haveSmall=false;
            for (int i=0;i<name.length();i++)
            {
                if(Character.isUpperCase(name.charAt(i))) haveCapital=true;
                else if(Character.isLowerCase(name.charAt(i))) haveSmall=true;
                else if(Character.isDigit(name.charAt(i))) haveDigit=true;
                if(haveCapital && haveDigit && haveSmall){
                    password = name;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
