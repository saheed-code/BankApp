package data.repositories;

import data.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserRepositoryImpl implements UserRepository{
    List<User> userDb = new ArrayList<>();
    @Override
    public User save(User user) {
        userDb.add(user);
        return user;
    }

    @Override
    public User findByEmail(String email) {
        for (User user: userDb) {
//            if(user.getEmail() == email) return user;
            if(Objects.equals(user.getEmail(), email)) return user;

        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return userDb;
    }
}
