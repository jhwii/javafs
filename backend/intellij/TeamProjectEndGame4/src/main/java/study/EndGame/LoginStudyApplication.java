package study.EndGame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //Base_Entity 에 있는 날짜 자동 입력 활성화@SpringBootApplication
@SpringBootApplication
public class LoginStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginStudyApplication.class, args);
    }

}
