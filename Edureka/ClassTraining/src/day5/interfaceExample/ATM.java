package day5.interfaceExample;

import java.util.Scanner;

public class ATM {
    public static void main (String[] args) {
        Bank bank;

        Scanner sc = new Scanner(System.in);
        System.out.print("Select a bank [1. WellsFargo | 2. Bank Of America]: ");

        int cardType = sc.nextInt();

        switch (cardType){
            case 1:
                bank = new WellsFargo();
                break;
            case 2:
                bank = new BankOfAmerica();
                break;
            default:
                System.err.println("---- CARD READ ERROR ---- TRY AGAIN ----");
                sc.close();
                return;
        }
        System.out.println("===================================== Welcome To " +bank.getClass().getSimpleName()+ " =====================================");
        bank.deposit(10000);
        bank.withdraw(500.57f);

        System.out.println();

        System.out.println(Bank.n);
        System.out.println(WellsFargo.n);
        System.out.println(BankOfAmerica.n);
        System.out.println(Bank.n);

        System.out.println();

        bank.gstCalculation();
    }
}
