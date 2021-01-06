public class NoScan implements State {
    SmartCashier smartCash;

    public NoScan(SmartCashier smartCash) {
        this.smartCash = smartCash;
    }

    public void scanBarcode() {
        System.out.println("You scanned a product");
        smartCash.setState(smartCash.getHasScanState());
    }

    public void cancelScan() {
        System.out.println("You haven't scanned a product");
    }

    public void returnCode() {
        System.out.println("No payment code returned");
    }

    public void alert() {
        System.out.println("You need to pay first");
    }

    public String toString() {
        return "waiting for scanning";
    }
}
