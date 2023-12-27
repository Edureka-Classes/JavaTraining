package day4.Abstraction;

import java.util.Scanner;

public class DrawingApp {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape sh = null;

        System.out.print("Which shape do you want to work with? [1. Rectangle | 2. Circe | 3. Triangle] ");
        int shapeType = sc.nextInt();

        switch (shapeType){
            case 1:
                sh = new Rectangle("Blue", 12, 8);
                break;
            case 2:
                sh = new Circle("Green", 7);
                break;
            case 3:
                sh = new Triangle("Red", 5, 4);
                break;
            default:
                System.err.println("INVALID SHAPE SELECTION --- TRY AGAIN");
                return; //Or System.exit(0);
        }

        System.out.println("\n================== SHAPE SELECTED :: " +sh.getClass().getSimpleName().toUpperCase()+ " ==================");
        System.out.println("Color of \"" +sh.getClass().getSimpleName() + "\" = " +sh.getColor());
        sh.setColor("Yellow");
        sh.area();
    }
}
