package Demo1;
class PaymentMethod {
    String paymentType;
    double amount;
    String date;

    // default constructor
    PaymentMethod() {
        paymentType = "Unknown";
        amount = 0.0;
        date = "Not Provided";
    }
    // parameterized constructor
    PaymentMethod(String paymentType, double amount, String date) {
        this.paymentType = paymentType;
        this.amount = amount;
        this.date = date;
    }

    void processPayment() {
        System.out.println("Processing generic payment of Rs." + amount);
    }

    void display() {
        System.out.println("Payment Type: " + paymentType);
        System.out.println("Amount: Rs." + amount);
        System.out.println("Date: " + date);
    }
} // class PaymentMethod ends here

class CreditCardPayment extends PaymentMethod {
    String cardNumber;
    String cardHolderName;
    String expiryDate;

    // default constructor
    CreditCardPayment() {
        super();
        cardNumber = "0000-0000-0000-0000";
        cardHolderName = "Unknown";
        expiryDate = "01/2030";
    }

    // parameterized constructor
    CreditCardPayment(String paymentType, double amount, String date, String cardNumber, String cardHolderName, String expiryDate) {
        super(paymentType, amount, date);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }

    void authorizeTransaction() {
        System.out.println("Authorizing transaction for card: " + cardNumber);
    }

    void display() {
        super.display();
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Expiry Date: " + expiryDate);
    }
} // class CreditCardPayment ends here

class PayPalPayment extends PaymentMethod {
    String email;
    String transactionId;

    // default constructor
    PayPalPayment() {
        super();
        email = "unknown@email.com";
        transactionId = "TXN0000";
    }

    // parameterized constructor
    PayPalPayment(String paymentType, double amount, String date, String email, String transactionId) {
        super(paymentType, amount, date);
        this.email = email;
        this.transactionId = transactionId;
    }

    void verifyAccount() {
        System.out.println("Verifying PayPal account linked with: " + email);
    }

    void display() {
        super.display();
        System.out.println("PayPal Email: " + email);
        System.out.println("Transaction ID: " + transactionId);
    }
} // class PayPalPayment ends here

class UpiPayment extends PaymentMethod {
    String upiId;
    String bankName;
    String transactionRef;

    // default constructor
    UpiPayment() {
        super();
        upiId = "unknown@upi";
        bankName = "Unknown Bank";
        transactionRef = "UPI0000";
    }

    // parameterized constructor
    UpiPayment(String paymentType, double amount, String date, String upiId, String bankName, String transactionRef) {
        super(paymentType, amount, date);
        this.upiId = upiId;
        this.bankName = bankName;
        this.transactionRef = transactionRef;
    }

    void confirmTransaction() {
        System.out.println("Confirming UPI payment for: " + upiId);
    }

    void display() {
        super.display();
        System.out.println("UPI ID: " + upiId);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Transaction Ref: " + transactionRef);
    }
} // class UpiPayment ends here
public class PaymentTest {
    public static void main(String[] args) {

        System.out.println("----- Credit Card Payment -----");
        CreditCardPayment c1 = new CreditCardPayment("Credit Card", 1500.75, "11-Nov-2025", "1234-5678-9012-3456", "Ayush Lakhapati", "12/2029");
        c1.display();
        c1.authorizeTransaction();
        System.out.println();

        System.out.println("----- PayPal Payment -----");
        PayPalPayment p1 = new PayPalPayment("PayPal", 2400.50, "11-Nov-2025", "ayush@gmail.com", "TXN91234");
        p1.display();
        p1.verifyAccount();
        System.out.println();

        System.out.println("----- UPI Payment -----");
        UpiPayment u1 = new UpiPayment("UPI", 850.00, "11-Nov-2025", "ayush@upi", "HDFC Bank", "UPI98765");
        u1.display();
        u1.confirmTransaction();
    }
} 
