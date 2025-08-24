abstract class Account {
    protected String accNo;
    protected double balance;

    Account(String accNo, double balance) {
        this.accNo = accNo; this.balance = balance;
    }
    abstract void calculateInterest(); // Abstract method
}

class Savings extends Account {
    Savings(String accNo,double bal){ super(accNo,bal); }
    void calculateInterest(){ System.out.println("Savings Interest: "+(balance*0.04)); }
}
class Current extends Account {
    Current(String accNo,double bal){ super(accNo,bal); }
    void calculateInterest(){ System.out.println("Current Interest: "+(balance*0.02)); }
}
class Loan extends Account {
    Loan(String accNo,double bal){ super(accNo,bal); }
    void calculateInterest(){ System.out.println("Loan Interest (to pay): "+(balance*0.1)); }
}

public class Bank {
    public static void main(String[] args){
        Account a1=new Savings("S101",10000);
        Account a2=new Current("C102",20000);
        Account a3=new Loan("L103",50000);
        a1.calculateInterest();
        a2.calculateInterest();
        a3.calculateInterest();
    }
}
