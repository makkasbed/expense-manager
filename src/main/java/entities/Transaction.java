package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "transactions")
public class Transaction {
    @Id
    private int id;
    private double amount;
    private String transactionDate;
    private String debitAccount;
    private String creditAccount;
    private String narration;
    private String status;
}
