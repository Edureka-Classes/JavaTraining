package OOP.Abstraction;

import java.util.Scanner;

public class DrawingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Shape sh;
//        = new Shape(Red);

        System.out.print("Which shape you want work with? [1. Rectangle | 2. Circle | 3. Triangle]:  ");

        int shapeType = sc.nextInt();

        switch (shapeType){
            case 1:
                sh = new Rectangle("Yellow", 12, 6);
                break;

            case 2:
                sh = new Circle("Blue", 12.5f);
                break;

            case 3:
                sh = new Triangle("Green", 23, 14);
                break;

            default:
                System.err.println("INVALID SHAPE TYPE SELECTION ----- TRY AGAIN");
                return; //System.exit(0);
        }

        System.out.println();

        System.out.println("================== SHAPE SELECTED :: " +sh.getClass().getSimpleName() + " ==================");
        System.out.println("color of " + sh.getClass().getSimpleName()+ " = " + sh.color);
        sh.setColor("RED");
        sh.area();

    }
}
