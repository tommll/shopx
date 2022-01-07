package command.user_account;

import command.Command;
import db.UserDB;

public class SignUpCommand implements Command {
    UserDB db;
    String name;
    String password;

    public SignUpCommand(UserDB db) {
        this.db = db;
    }

    public void setParameters(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void execute(){
        db.signUp(name, password);
    }
}
