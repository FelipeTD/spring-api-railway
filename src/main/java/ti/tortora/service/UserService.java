package ti.tortora.service;

import ti.tortora.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
