package ti.tortora.service.impl;

import org.springframework.stereotype.Service;
import ti.tortora.domain.model.User;
import ti.tortora.domain.repository.UserRepository;
import ti.tortora.service.UserService;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (repository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This User ID already exists");
        }
        return repository.save(userToCreate);
    }

}
