package ru.sibsutis.barter.crud;

import ru.sibsutis.barter.NotFoundException;
import ru.sibsutis.barter.databases.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User get(Long id) {
        return repository.findById(id)
                .orElse(null);
    }

    public List<User> getAll() {
        return repository.findAll();
    }

    public User create(User user) {
        return repository.save(user);
    }

    public User update(Long id) {
        User savedUser = repository.findById(id).orElseThrow(NotFoundException::new);
        return repository.save(savedUser);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
