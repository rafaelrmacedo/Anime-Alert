package AnimeAlert.animeAlert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class AnimeAlertApplication {
	public static void main(String[] args) {
		SpringApplication.run(AnimeAlertApplication.class, args);
	}

}
