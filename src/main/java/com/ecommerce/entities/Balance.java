package com.ecommerce.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Balance  extends BaseEntity {

    private BigDecimal amount;

    @OneToOne
    private Customer customer;
}
