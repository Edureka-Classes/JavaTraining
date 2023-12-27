package day5.interfaceExample;

public class CommandLineArgs {
    // Promgram to divide a number by  a number using command line argument
    public static void main (String[] args) {

        try{
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int z = x / y;
            System.out.println(x+ " / " + y + " = " + z);
        }catch (ArithmeticException ex){
            System.out.println("Cannot divvide by zero");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Please provide two min 2 cmd args");
        }catch (NumberFormatException ex){
            System.out.println("Please provide int type data as cmd args");
        }
        System.out.println(" ---- Done ---- ");
    }
}
