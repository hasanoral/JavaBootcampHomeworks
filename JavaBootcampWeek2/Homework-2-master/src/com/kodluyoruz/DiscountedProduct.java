package com.kodluyoruz;

/**
 * Subclass representing a discounted product to be
 * purchased. It extends the Product class with two instance variables
 */
public class DiscountedProduct extends Product {
    // Original product
    private final Product original;

    // Discount in percent (%)
    private final double discount;

    /**
     * Construct a discounted product
     * @param original
     * @param discount
     */
    public DiscountedProduct(Product original, double discount) {
        super(original);

        if(original.canBeReduced()==false){
            System.out.println("Price can not be reduced!");
            //System.exit(1);
            throw new IllegalArgumentException("Error!");
        }
        else{
            this.original = original;
            this.discount = discount;
        }

    }

    /**
     * Return the price of this discounted product
     * @param cart shopping cart
     * @return discounted price
     */
    public double getPrice(Cart cart) {
        // code here
        double firstPrice = this.original.getPrice(cart);
        double discountedValue = (this.original.getPrice(cart)) * ((this.discount)/100);
        return firstPrice - discountedValue;

    }

    /**
     * Return the string representation of the product
     * Example: CD [discounted 20 %]
     */
    public String toString() {
        // code here

        return this.original.getName() + " [discounted " + this.discount + " %]" + this.original.toString();
    }
}
