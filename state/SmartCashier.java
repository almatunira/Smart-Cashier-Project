public class SmartCashier {
    
    State noScan;
    State hasScanState;
    State paymentState;
    State soldState;    

    State state;    

    public SmartCashier() {        
        noScan = new NoScan(this);
        hasScanState = new HasScanState(this);
        soldState = new SoldState(this);
        paymentState = new PaymentState(this);
       
        state = noScan;        
    }

    public void scanBarcode() {
        state.scanBarcode();
    }

    public void cancelScan() {
        state.cancelScan();
    }

    public void returnCode() {
        state.returnCode();        
    }

    void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }

    public State getNoScan() {
        return noScan;
    }

    public State getHasScanState() {
        return hasScanState;
    }

    public State getPaymentState() {
        return paymentState;
    }

    public State getSoldState() {
        return soldState;
    }    

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nSmart Cashier, Inc.");      

        result.append("\n" + state + "\n");
        return result.toString();
    }
}
