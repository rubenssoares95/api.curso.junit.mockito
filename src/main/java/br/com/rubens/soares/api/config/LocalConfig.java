package br.com.rubens.soares.api.config;

import br.com.rubens.soares.api.domain.User;
import br.com.rubens.soares.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository userRepository;

    @Bean
    public void startDB(){
        User u1 = new User(null, "Rubens", "rubens@mail.com", "123");
        User u2 = new User(null, "Luiz", "Luiz@mail.com", "123");

        userRepository.saveAll(List.of(u1, u2));
    }
}
