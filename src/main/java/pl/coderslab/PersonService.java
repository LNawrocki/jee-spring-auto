package pl.coderslab;

import org.springframework.stereotype.Component;

@Component
public class PersonService {
    private PersonRepository personRepo;

    public PersonRepository getPersonRepo() {
        return personRepo;
    }

    public void setPersonRepo(PersonRepository personRepo) {
        this.personRepo = personRepo;
    }
}
