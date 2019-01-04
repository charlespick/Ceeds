public class BankAccount {
    String name;
    double balance;
    double transactionFee = .05;
    public void deposit (double amount) {
    balance = balance + amount;
    }
    public void withdraw( double amount) {
        if((balance - amount - transactionFee)>0){
            balance = balance - amount - transactionFee;
        }    
    }  
    public String toString(){
        return name + ", " + balance;
    }
    public boolean transfer(BankAccount destination, double amount){
        if((balance-5-amount)<0){
            return false;
        }else{
            balance-=amount+5;
            destination.balance+=amount;
        }
        return true;
    }
}