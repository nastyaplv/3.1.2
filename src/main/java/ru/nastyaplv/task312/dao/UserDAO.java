package ru.nastyaplv.task312.dao;


import ru.nastyaplv.task312.models.User;

import java.util.List;
public interface UserDAO {
    public List<User> getAllUsers();

    public User show(int id);

    void save(User user);

    void update(int id, User updatedUser);

    void delete(int id);
}
