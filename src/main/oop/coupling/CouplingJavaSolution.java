package main.oop.coupling;

class CartItem {
    public float price;
    public int quantity;

    public float getTotalPrice() {
        return price * quantity;
    }
}

class Cart {
    CartItem[] items;

    public float getTotalPrice(){
        float totalPrice = 0;
        for(CartItem item : items){
            totalPrice+= item.price * item.quantity;
        }
        return totalPrice;
    }
}


class COrder {
    private Cart cart;
    private float salesTax;

    public COrder(Cart cart, float salesTax) {
        this.cart = cart;
        this.salesTax = salesTax;
    }

    public float totalPrice() {
        return cart.getTotalPrice() * (1.0F + salesTax);
    }

}

public class CouplingJavaSolution {
}
