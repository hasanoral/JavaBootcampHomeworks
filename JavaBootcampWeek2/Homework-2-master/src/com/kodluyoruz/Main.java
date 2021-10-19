package com.kodluyoruz;

import java.util.Scanner;

public class Main {
    /**
     * This is the main class for the application, interacting
     * with the customer, adding to the cart different products to
     * be purchased and finally calculating the total amount to be paid
     */

    /**
     * Allows a cashier to enter the details for a product
     * to be purchased by a customer
     * @param cart the shopping cart of a given customer
     */
    public static void askCustomer(Cart cart){

        Scanner datas = new Scanner(System.in);
        while(true){
            System.out.println("If you want to buy some product enter 1, if you not please enter 0.");
            int user = datas.nextInt();
            datas.nextLine();
            if (user == 0){
                System.out.println(cart.toString());
                System.out.println("In total you have to pay " + cart.totalPrice()+ " TL");
                break;
            }else{
                System.out.println("What's the product name: ");
                String pName = datas.nextLine();

                System.out.println("What's the seller's name: ");
                String seller = datas.nextLine();

                System.out.println("Whats's the product or products' price: ");
                double price = datas.nextDouble();
                datas.nextLine();

                System.out.println("How many products do you want to buy?");
                int numberOfProduct = datas.nextInt();

                System.out.println("Is there any discount on your product if there is please enter the amount, if not enter 0 ?");
                double userSelection_D = datas.nextDouble();
                datas.nextLine();

                System.out.println("Does product have Buy2Take3 advantage?(y/n)");
                String userSelection_B = datas.nextLine();

                Product product = new Product(seller,pName,price);

                if (userSelection_D > 0 && userSelection_B.equals("y")) {
                    System.out.println("Please choose one option!");
                }

                if (userSelection_D != 0 && userSelection_B.equals("n")) {
                    Product p = new DiscountedProduct(product, userSelection_D);
                    cart.addProduct(p, numberOfProduct);
                    continue;
                }

                if (userSelection_B.equals("y") && (userSelection_D == 0)) {
                    Product p = new Buy2Take3Product(product);
                    cart.addProduct(p, numberOfProduct);
                    continue;
                }

                cart.addProduct(product, numberOfProduct);
          }
        }
    }

    // Main method to interact with a customer
    public static void main(String[] args) {
        System.out.println("Welcome to kodluyoruz shop");
        System.out.println("What’s your name?");

        Scanner scanner = new Scanner(System.in);

        String customer = scanner.nextLine();
        System.out.println("Hi " + customer + ". Please choose one of the following options:");
        System.out.println("");

        Cart cart = new Cart();
        askCustomer(cart);
    }
}
