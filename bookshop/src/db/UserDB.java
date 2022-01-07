package db;

import java.util.*;

public class UserDB {
    List<UserAccount> userAccountList = new ArrayList<>();
    Set<String> userNames = new HashSet<>();

    public boolean signUp(String name, String password){
        if (userNames.contains(name))
            return false;

        userNames.add(name);
        userAccountList.add(new UserAccount(name, password));
        return true;
    }

    public boolean login(String name, String password){
        for (UserAccount x : userAccountList){
            if (x.name.equals(name) && x.password.equals(password)){
                return true;
            }
        }
        return false;
    }
}

class UserAccount{
    String name;
    String password;

    public UserAccount(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
