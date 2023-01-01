package data.repositories;

import data.model.Account;
import data.model.User;

public interface AccountRepository {

    Account assignAccount(User user, Account userAccount);
    Account findByUser(User user);

}
