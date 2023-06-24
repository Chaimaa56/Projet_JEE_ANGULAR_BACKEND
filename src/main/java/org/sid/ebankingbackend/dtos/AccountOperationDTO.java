package org.sid.ebankingbackend.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.ebankingbackend.entities.BankAccount;
import org.sid.ebankingbackend.enums.OperationType;

import javax.persistence.*;
import java.util.Date;


@Data
public class AccountOperationDTO {

    private long id;
    private Date operationsDate;
    private double amount;

    private OperationType type;
    private String description;
}
