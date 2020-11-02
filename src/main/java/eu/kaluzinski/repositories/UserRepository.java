package eu.kaluzinski.repositories;

import eu.kaluzinski.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
    User findByUsername(String username);
}
