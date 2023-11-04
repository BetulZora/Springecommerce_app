package com.ecommerce.entities;

import com.ecommerce.Enums.CartState;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.math.BigInteger;

@Entity
@NoArgsConstructor
@Data
public class Cart extends BaseEntity{

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Discount discount;

    @Enumerated(EnumType.STRING)
    private CartState cartState;



}
