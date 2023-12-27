package OOP.Examples.account;

public class Account {
    long accNo;
    String name;
    float bal;

    public Account(long accNum, String accName, float accBal ){
        this.accNo = accNum;
        this.name = accName;
        this.bal = accBal;
    }

    void deposit(float amt){
        this.bal += amt;
        System.out.println("$" +amt+ " Created | Balance: "+this.bal);
    }

    void withdraw(float amt){

        if(this.bal >= amt){
            this.bal -= amt;
            System.out.println("$" +amt+ " Debited | Balance: "+this.bal);
        }else {
            System.err.println("ERROR: INSUFFICIENT BALANCE!!");
        }
    }

    void getBalance(){

        System.out.println("A/C NO: " +this.accNo+ " | NAME: " +this.name + " | BALANCE: "+this.bal);

    }


}
