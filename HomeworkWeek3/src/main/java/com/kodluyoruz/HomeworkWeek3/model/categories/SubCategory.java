package com.kodluyoruz.HomeworkWeek3.model.categories;

import com.kodluyoruz.HomeworkWeek3.model.Products;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public class SubCategory extends MainCategory{
    private List<Products> listOfProducts = new ArrayList<>();
    private String subCatName;

    public SubCategory(String mainCatName, String subCatName) {
        super(mainCatName);
        this.subCatName = subCatName;
    }

    public void addProduct(Products products){
        listOfProducts.add(products);
    }
}
