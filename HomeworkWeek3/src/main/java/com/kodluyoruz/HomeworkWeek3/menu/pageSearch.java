package com.kodluyoruz.HomeworkWeek3.menu;

import com.kodluyoruz.HomeworkWeek3.model.Products;
import com.kodluyoruz.HomeworkWeek3.model.cart.Cart;
import com.kodluyoruz.HomeworkWeek3.model.cart.CartItem;
import com.kodluyoruz.HomeworkWeek3.model.categories.Category;
import com.kodluyoruz.HomeworkWeek3.model.categories.MainCategory;
import com.kodluyoruz.HomeworkWeek3.model.categories.SubCategory;
import com.kodluyoruz.HomeworkWeek3.model.checkout.Bill;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class pageSearch {
    private Products products = null;
    private Bill bill;
    private final Cart cart;
    private final pageMenu pageMenu;
    private final pageCheckout pageCheckout;
    private final Scanner scanner;

    public void search(Category category){
        int count = 0;
        while (count == 0){
            System.out.println("What do you want to search: ");
            String search = scanner.nextLine();

            List<Products> productsList = new ArrayList<>();
            List<MainCategory> mainCategories = category.getListOfMainCat().stream()
                    .filter(mainCategory -> mainCategory.toString().contains(search))
                    .collect(Collectors.toList());

            for (MainCategory mainCategory : mainCategories){
                for (SubCategory subCategory : mainCategory.getListOfSubcat()){
                    for (Products products : subCategory.getListOfProducts()){
                        if(products.getName().contains(search)){
                            count++;
                            productsList.add(products);
                        }
                    }
                }
            }

            if(count > 0){
                System.out.println("Product: ");
                String product = scanner.nextLine();

                for (int i = 0; i < productsList.size(); i++){
                    if (product.equals(productsList.get(i))){
                        System.out.println("Product Description: " + productsList.get(i).getDesc());
                        products = productsList.get(i);
                    }
                }
                if (products != null){
                    System.out.println("How many products do you want to buy?");
                    int quantity = scanner.nextInt();

                    CartItem cartItem = CartItem.builder()
                            .product(products)
                            .quantity(quantity)
                            .build();
                    cart.addItem(cartItem);

                    System.out.println("What page do you want to go - if it is Main Menu enter 1, if it is Payment Page enter 2: ");
                    int select = scanner.nextInt();

                    if(select == 1){
                        // TODO: 19.10.2021 main menü yap ekle
                        pageMenu.mainRun(category);

                    }else{
                        pageCheckout.checkout(category, cart);
                    }
                }
            }
        }
    }

}
