package pl.coderslab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.coderslab.PersonService;

@Configuration
@ComponentScan("pl.coderslab.beans")
public class AppConfig {
    @Bean
    public PersonService personService(){
        return new PersonService();
    }
}
