package ua.gostart.goit.Module6;

import java.util.Scanner;

public class RectangleSquare {

     private static int readScanner(){
        while(true) {
            try {
                System.out.println("Input rectangle sides size");
                Scanner scanner = new Scanner(System.in);
                return scanner.nextInt();
            } catch (Exception E) {
                System.out.println("Wrong input");
            }
        }
    }

    RectangleSquare() {
        int rectangleSide1 = readScanner();
        int rectangleSide2 = readScanner();
        double rectangleSquare = rectangleSide1 * rectangleSide2;
        System.out.println("rectangleSquare="+rectangleSquare);
    }
}
