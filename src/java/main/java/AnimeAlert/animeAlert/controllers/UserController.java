package AnimeAlert.animeAlert.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import AnimeAlert.animeAlert.entities.User;
import AnimeAlert.animeAlert.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/users")
    public String listAll() {
        List<User> userList = userRepository.findAll();
        return "users";
    }

}