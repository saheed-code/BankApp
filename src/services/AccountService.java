package services;

import data.model.Account;
import dto.requests.DepositRequest;
import dto.response.DepositResponse;

import java.math.BigDecimal;

public interface AccountService {
    DepositResponse deposit(DepositRequest depositRequest);
    void transfer(BigDecimal amount);
    BigDecimal checkBalance();
}
