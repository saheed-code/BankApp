package data.repositories;

import data.model.Account;
import data.model.User;

import java.util.HashMap;
import java.util.Objects;

public class AccountRepositoryImpl implements AccountRepository {
    HashMap<User, Account> userAccountDB = new HashMap<>();
    @Override
    public Account assignAccount(User user, Account userAccount) {
        userAccountDB.put(user, userAccount);
        return userAccount;
    }

    @Override
    public Account findByUser(User user) {
        return userAccountDB.get(user);
    }



}
