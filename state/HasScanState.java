import java.util.Random;

public class HasScanState implements State {    
    SmartCashier smartCash;

    public HasScanState(SmartCashier smartCash) {
        this.smartCash = smartCash;
    }

    public void scanBarcode() {
        System.out.println("You can't scan another product");
    }

    public void cancelScan() {        
        smartCash.setState(smartCash.getNoScan());
    }

    public void returnCode() {
        System.out.println("Return code...");            
        smartCash.setState(smartCash.getPaymentState());
        smartCash.returnCode();
    }

    public void alert() {
        System.out.println("You need to pay first");
    }

    public String toString() {
        return "Product has scanned";
    }
}
