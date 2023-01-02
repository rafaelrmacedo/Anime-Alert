package AnimeAlert.animeAlert.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import AnimeAlert.animeAlert.entities.User;
import AnimeAlert.animeAlert.repositories.UserRepository;
import jakarta.persistence.Entity;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/register")
public class RegisterController {

    @GetMapping
    private void Register() {
        
    }

}
