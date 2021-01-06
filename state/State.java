public interface State {

    public void scanBarcode();
    public void cancelScan();
    public void returnCode();
    public void alert();
}
