package applications;

public class Gsnormal {
    private int accNo;
    private String accNm;
    private float charges;
    private float deliveryCharge;

    public Gsnormal(int accNo, String accNm, float charges, float deliveryCharge) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.charges = charges;
        this.deliveryCharge = deliveryCharge;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getAccNm() {
        return accNm;
    }

    public float getCharges() {
        return charges;
    }

    public float getDeliveryCharge() {
        return deliveryCharge;
    }

    public void bookProduct(float charges) {
        System.out.println("Hi NormalAcc user! Your product charges are: " + charges +
                " and the delivery charges are: " + deliveryCharge);
    }

    @Override
    public String toString() {
        return "Gsnormal [deliveryCharge=" + deliveryCharge +
                ", accNo=" + accNo +
                ", accNm=" + accNm +
                ", charges=" + charges + "]";
    }

    // Main method to run the program
    public static void main(String[] args) {
        Gsnormal acc = new Gsnormal(101, "Ravi Kumar", 5000.0f, 150.0f);
        acc.bookProduct(acc.getCharges());
        System.out.println(acc);
    }
}
