package day5.interfaceExample;

public class WellsFargo implements Bank{
    @Override
    public void deposit (final float amt) {
        System.out.println("$"+amt+" Credited to WellsFargo account");
    }

    @Override
    public void withdraw (final float amt) {
        System.out.println("$"+amt+" Debited from WellsFargo account");
    }
}
