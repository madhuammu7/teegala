package applications;



//Assuming PrimeAcc is the correct superclass
public class GSprime extends GSprime {

 public GSPrime(int accNo, String accNm, float charges, boolean isPrime) {
     super(accNo, accNm, charges, isPrime);
 }

 public void bookProduct(float charges) {
     System.out.println("Hello user! Your prime account charges are: " + charges);
 }

 @Override 
 public String toString() {
     return "GSPrimeAcc [isPrime=" + isPrime + ", accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
 }

 public static void main(String[] args) {
     GSPrime primeAcc = new GSPrime(101, "Ravi", 499.99f, true);
     primeAcc.bookProduct(primeAcc.charges);
     System.out.println(primeAcc.toString());
 }
}
