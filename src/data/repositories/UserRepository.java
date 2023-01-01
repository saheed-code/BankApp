package data.repositories;

import data.model.User;

import java.util.List;

public interface UserRepository {
    User save(User user);
    User findByEmail(String email);
    List<User> findAll();
}
