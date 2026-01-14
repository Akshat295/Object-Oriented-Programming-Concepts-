class BankAccount {
    private double balance; 
    
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

class PrivateDemo {
    public static void main(String[] args) {
        BankAccount acnt = new BankAccount();
        
        // System.out.println(acnt.balance);  Throws an error
        System.out.println(acnt.getBalance());
    }
}