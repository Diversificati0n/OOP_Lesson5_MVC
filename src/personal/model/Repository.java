package personal.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user);
    User updateUser(User user);
    void deleteUser(String userId);
}



