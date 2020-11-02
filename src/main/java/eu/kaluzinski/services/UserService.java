package eu.kaluzinski.services;

import eu.kaluzinski.domain.User;

public interface UserService extends CRUDService<User> {

    User findByUsername(String username);

}
