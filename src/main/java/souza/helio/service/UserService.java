package souza.helio.service;

import souza.helio.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
