package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "accounts")
public class Account {
    @Id
    private int id;
    private String name;
    private String createdAt;
    //whether an expense, income or investment account
    private String accountType;

}
