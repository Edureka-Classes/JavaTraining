package assigment1.ifElseConditions;

public class VotingEligibility {
    public static void main(String[] args) {

        /* Write a program to check if acandidate is eligible for voting or not */
        int age = -1;

        if (age >= 18){
            System.out.println("You are Eligible to Vote.");
        } else if (age < 18 && age > 0) {
            System.out.println("You are NOT Eligible to Vote.");
        } else {
            System.out.println("Invalid seletion.. Retry again. ");
        }
    }
}
