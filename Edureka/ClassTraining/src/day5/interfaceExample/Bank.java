package day5.interfaceExample;

interface Bank {
    int n = 25; //public static final
    void deposit(float amt); // public abstract
   // void withdraw(float amt){}; // cannot have body
   // default void withdrawt(float amt){} // public abstract java 8
    void withdraw(float amt); // public abstract
    default void gstCalculation(){
        System.out.println(" ---- GST Calculation ---- ");
    }
}
