package com.kodluyoruz;

/**
 * Subclass representing a product to be purchased
 * (using the formula "buy 2 take 3")
 * It extends the Product class with one instance variable
 */

public class Buy2Take3Product extends Product {
    //original product
    private final Product original;

    /**
     * Construct a Buy2Take3 product
     * If the price of this product can not be reduced
     * you should print a message to the user and terminate the
     * program
     * @param original
     */
    public Buy2Take3Product(Product original) {
        // if the price can not be reduced you should print a message and
        // terminate the program. Use IllegalArgumentException to terminate.
        // code here
        super(original);

        /*if(original instanceof DiscountedProduct){
            new IllegalArgumentException("Mistake!");
        }
        this.original = original;*/
        if(original.canBeReduced()==false){
            System.out.println("Price can not be reduced!");
            //System.exit(1);
            throw new IllegalArgumentException("Error!");
        }
        else{
            this.original = original;
        }

    }

    /**
     * Return false if the product price can not be
     * reduced
     * @return
     */
    public boolean canBeReduced() {
        // You can not discount the price of Buy2Take3 product
        // code here
        boolean flag;
        if(this.original instanceof DiscountedProduct){
            flag = false;
        }else{
            flag = true;
        }

        return flag;

    }

    /**
     * Return the unit price of a product using the
     * formula "Buy2Take3"
     * @param cart shopping cart
     * @return unit price
     */
    public double getPrice(Cart cart) {
        double finalPrice = 0;
        int sameProducts = 0;
        for (int i = 0; i < cart.getProducts().size(); i++){
            if (cart.getProducts().get(i).getName().equals(this.original.getName())){
                sameProducts++;

            }
        }
        int division = sameProducts/3;

        if (division > 0){
            int subs = sameProducts - division;

            double totalPrice = subs * this.original.getPrice(cart);

            finalPrice = totalPrice / sameProducts;
        }

        return finalPrice;

    }
}
