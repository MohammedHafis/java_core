package abstractClass;

abstract class Payment {
    private int amount;

    public Payment(int amount){
        this.amount=amount;
    }
    
    public abstract void processPayment();

    public void showAmount(){
        System.out.println("Payment amount: " + amount);
    }
}
class CreditCardPayment extends  Payment{

    private int cardNumber;

    public CreditCardPayment(int amount,int cardNumber){
        super(amount);
       this.cardNumber=cardNumber;
    }

    @Override
    public void processPayment(){
        System.out.println("Processing credit card payment using card: " + cardNumber);
    }
}
class UPIPayment extends Payment{

    private int upId;

    public UPIPayment(int amount,int upId){
        super(amount);
        this.upId=upId;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing UPI payment using ID: "+ upId );
        
    }
}
class Transaction{
    public static void main(String[] args){
        CreditCardPayment cardPayment = new CreditCardPayment(3000,4537);
        cardPayment.showAmount();
        cardPayment.processPayment();

        UPIPayment upiPayment = new UPIPayment(2400,237764);
        upiPayment.showAmount();
        upiPayment.processPayment();

    }
}