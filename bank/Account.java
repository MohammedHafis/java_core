package bank;

class Account {
    private int balance;
    private int accountNum;

    public Account(int accountNum, int balance){
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public void deposit(int amount){
        balance = balance + amount;
        System.out.println("The deposit amount is credited " + amount);  
    }

    public void withdraw(int amount){
        if (amount > balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance = balance - amount;
            System.out.println("Withdraw "+amount + ". Balance is "+ balance);
        }
    }
    public int getBalance(){
        return balance;
    }

    public int getAccountNum(){
        return accountNum;
    }

    public static void main(String[] args ){
        Account cus1 = new Account(23456,1500);
        Account cus2 = new Account(23487,2000);

        cus1.deposit(250);
        cus1.withdraw(1600);
        System.out.println("The final balance cus1 : " + cus1.getBalance());

        cus2.deposit(600);
        cus2.withdraw(3000);
        System.out.println("The final balance cus2 : " + cus2.getBalance());

    }
}
