import java.util.Random; 

public class PaymentState implements State {

    SmartCashier smartCash;
    private Random rand = new Random();

    public PaymentState(SmartCashier smartCash) {
        this.smartCash = smartCash;
    }

    public void scanBarcode() {
        System.out.println("Please wait, we're already giving you a payment code");
    }

    public void cancelScan() {
        System.out.println("Sorry, you already scanned the product");
    }

    public void returnCode() {
        int code = rand.nextInt(9999);
        System.out.println("This is your Payment code: " + code);
        smartCash.setState(smartCash.getNoScan());
    }

    public void alert() {
        System.out.println("You need to pay first");
    }

    public String toString() {
        return "Pay for your product";
    }
}
