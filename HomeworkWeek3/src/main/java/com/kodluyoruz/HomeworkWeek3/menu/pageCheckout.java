package com.kodluyoruz.HomeworkWeek3.menu;

import com.kodluyoruz.HomeworkWeek3.model.cart.Cart;
import com.kodluyoruz.HomeworkWeek3.model.categories.Category;
import com.kodluyoruz.HomeworkWeek3.model.checkout.Bill;
import lombok.Data;
import org.springframework.stereotype.Component;
import com.kodluyoruz.HomeworkWeek3.service.CheckoutService;

import java.util.Scanner;

@Component
@Data
public class pageCheckout {
    private Bill bill;
    private final Scanner scanner;
    private final CheckoutService checkoutService;

    private final pagePayment pagePayment;
    private pageMenu pageMenu;

    public void checkout(Category category, Cart cart){

        bill = checkoutService.checkoutService(cart);

        System.out.println("What page do you want to go - if it is Main Menu enter 1, if it is Payment Page enter 2: ");
        int select = scanner.nextInt();

        if(select == 1){
            // TODO: 19.10.2021 mainmenu yap - ekle
            pageMenu.mainRun(category);

        }else{
            pagePayment.doPayment(bill);
        }




    }
}
