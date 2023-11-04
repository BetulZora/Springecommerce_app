package com.ecommerce.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Category extends BaseEntity{

    private String name;

    @ManyToMany(mappedBy = "categoryList")
    private List<Product> productList;
    //The potential size of the list is thousands
    // Comparented to List<Category> it is by degrees much more large

}
