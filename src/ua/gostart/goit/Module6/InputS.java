package ua.gostart.goit.Module6;

import javax.swing.*;
import java.util.Scanner;

// methods of input
public class InputS {

    InputS() {
    inputS();
    }

    private int inputS(){
        while(true) {
            try {
                System.out.println("Input rectangle sides size");
                Scanner scanner = new Scanner(System.in);
                int value = scanner.nextInt();
                return value;
            } catch (Exception E) {
                System.out.println("Wrong input");
            }
        }
    }

}
