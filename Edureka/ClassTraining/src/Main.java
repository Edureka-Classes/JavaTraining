public class Main {

    static float addNumber(float a, float b){
        float sum = (int) (a + b);
        int floor = (int) Math.floor(sum);
        return floor;
    }
    public static void main(String[] args) {

        int addTwo = (int) Main.addNumber(1.89f, 2.33f);
        System.out.println(addTwo);
    }
}