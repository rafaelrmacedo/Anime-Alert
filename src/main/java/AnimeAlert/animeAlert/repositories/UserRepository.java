package AnimeAlert.animeAlert.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import AnimeAlert.animeAlert.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    
}
