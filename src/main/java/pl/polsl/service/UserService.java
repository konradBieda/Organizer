package pl.polsl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.polsl.domain.User;
import pl.polsl.repository.UserRepository;

import java.util.List;

/**
 * Created by Jakub Majcher on 30.03.17.
 */

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUser(long id) {
        return userRepository.findOne(id);
    }

<<<<<<< HEAD
    public void saveUser(User user) {
        userRepository.save(user);
    }
=======
>>>>>>> users
}
