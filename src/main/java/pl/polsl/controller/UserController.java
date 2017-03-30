package pl.polsl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.polsl.domain.User;
import pl.polsl.service.UserService;

import java.util.List;

/**
 * Created by Jakub Majcher on 30.03.17.
 */

@RestController
@RequestMapping(path = "/api/organizer")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<User> getAllUsers() {
        return userService.getUsers();
    }

    @GetMapping(path = "/user/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User getUser(@PathVariable long id) {
        return userService.getUser(id);
    }
}
