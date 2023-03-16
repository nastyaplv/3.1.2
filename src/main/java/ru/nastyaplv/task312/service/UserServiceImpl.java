package ru.nastyaplv.task312.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.nastyaplv.task312.dao.UserDAO;
import ru.nastyaplv.task312.models.User;


import java.util.List;
@Repository
@Transactional
public class UserServiceImpl implements UserService {

    public UserDAO userDAO;
    @Autowired
    public UserServiceImpl(UserDAO userDAO){
        this.userDAO=userDAO;
    }


    public List<User> getAllUsers() {
            return userDAO.getAllUsers();
        }

        public User show(int id) {
            return userDAO.show(id);
        }

        public void save(User user) {
            userDAO.save(user);
        }

        public void update(int id, User updatedUser) {
            userDAO.update(id, updatedUser);
        }

        public void delete(int id) {
            userDAO.delete(id);
        }
}
