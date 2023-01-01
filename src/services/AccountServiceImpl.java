package services;

import data.model.Account;
import data.repositories.AccountRepository;
import data.repositories.AccountRepositoryImpl;
import dto.requests.DepositRequest;
import dto.response.DepositResponse;

import java.math.BigDecimal;

public class AccountServiceImpl implements AccountService{
    AccountRepository accountRepository = new AccountRepositoryImpl();
    Account account;
    BigDecimal balance;


    @Override
    public DepositResponse deposit(DepositRequest depositRequest) {
        balance = account.getAccountBalance();
        if(depositRequest.getDepositAmount().compareTo(BigDecimal.ZERO) > 0){
            balance = balance.add(depositRequest.getDepositAmount());
        }
        return null;
    }

    @Override
    public void transfer(BigDecimal transferAmount) {
        balance = account.getAccountBalance();
        if(transferAmount.compareTo(balance) < 0){
            balance = balance.add(transferAmount);
        }
    }

    @Override
    public BigDecimal checkBalance() {
        return account.getAccountBalance();
    }
}
