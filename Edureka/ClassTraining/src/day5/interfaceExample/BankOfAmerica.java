package day5.interfaceExample;

public class BankOfAmerica implements Bank{
    @Override
    public void deposit (float amt) {
        System.out.println("$. "+amt+" Credited to WellsFargo account");
    }

    @Override
    public void withdraw (float amt) {
        System.out.println("$. "+amt+" Debited from WellsFargo account");
    }
}
