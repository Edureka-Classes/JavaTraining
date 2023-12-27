public class TestIf {
    public static void main(String[] args) {

        int balance = 1000;
        boolean withdraw;

        if(balance < 0){
            withdraw = false;
        } else {
            withdraw = true;
        }

        System.out.println("Can I withdraw : "+withdraw);
    }
}
