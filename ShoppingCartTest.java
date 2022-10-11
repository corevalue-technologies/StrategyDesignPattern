package pattern;

public class ShoppingCartTest {
    public static void main(String[] args) {
     //   System.out.println("Hello world!");
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PayPalStrategy("mohakgarg@example.com", "mypwd"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Mohak garg", "1234567890123456", "786", "12/15"));
    }
    }