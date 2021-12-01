package cs3318assignment3tdd.cs3318javatdd;

import java.util.ArrayList;
import java.util.List;

public class UserList {

    private final ArrayList<User>  ListOfUsers = new ArrayList<>();

    public UserList(){
    }

    public void addUser(User newUser) {
        this.validateIsNotDuplicateUser(newUser);
        this.ListOfUsers.add(newUser);
    }

    private void validateIsNotDuplicateUser(User newUser) {
        for( User currentUser : ListOfUsers) {
            if(currentUser.hasSameEmailAddress(newUser)) {
                throw new DuplicateUserException("User already linked to this email address",new RuntimeException());
            }
        }
    }

    public List<User> getListOfUsers() {
        return this.ListOfUsers;
    }
}
