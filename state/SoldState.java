public class SoldState implements State {
    SmartCashier smartCash;

    public SoldState(SmartCashier smartCash) {
        this.smartCash = smartCash;
    }

    public void scanBarcode() {
        System.out.println("You can't scan this product, the product is sold out");
    }

    public void cancelScan() {
        System.out.println("You haven't scanned a product yet");
    }

    public void returnCode() {
        System.out.println("No Payment code returned");
    }

    public void alert() {
        System.out.println("You need to pay first");
    }

    public String toString() {
        return "sold out";
    }
}
