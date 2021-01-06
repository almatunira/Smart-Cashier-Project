public class SmartCashierTestDrive {

    public static void main(String[] args) {
        SmartCashier smartCash = new SmartCashier();

        System.out.println(smartCash);

        smartCash.scanBarcode();
        smartCash.returnCode();

        System.out.println(smartCash);

        smartCash.scanBarcode();
        smartCash.returnCode();
        smartCash.scanBarcode();
        smartCash.returnCode();

        System.out.println(smartCash);
    }
}
