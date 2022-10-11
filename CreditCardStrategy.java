package pattern;

public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cvv;
    private String dateOfExpiry;
    private String cardNo;

    public CreditCardStrategy(String name, String cvv, String dateOfExpiry, String cardNo) {
        this.name = name;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
        this.cardNo = cardNo;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }

}
