package data.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Account {
    private User user;
    private String accountNumber;
    private BigDecimal accountBalance;

}
