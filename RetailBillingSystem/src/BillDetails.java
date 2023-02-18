public class BillDetails {
    public BillDetails(int x){
        totalBill = 10.8F + x;
    }
    float totalBill;
    public float CalculateBill(){

        return totalBill;
    }
}
