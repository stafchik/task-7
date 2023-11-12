package web.dao;


import web.model.User;

import java.util.List;

public interface UserDAO {
    void saveUser(User user);
    void deleteUserById(Long id);
    User getUserById(Long id);
    List<User> getAllUsers();
    void updateUser(User user);
}
