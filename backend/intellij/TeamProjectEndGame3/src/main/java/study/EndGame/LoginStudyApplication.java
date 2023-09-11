package study.EndGame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class LoginStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginStudyApplication.class, args);
    }

}
