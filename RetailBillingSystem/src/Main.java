public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Retail Billing System\n");
        startBillingSystem();
    }
    private static void startBillingSystem(){
        BillDetails newBill = new BillDetails(10);
        float billValue = newBill.CalculateBill();
        System.out.println(billValue);
    }
}
