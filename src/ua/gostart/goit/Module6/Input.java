package ua.gostart.goit.Module6;

import javax.swing.*;
import java.util.Scanner;

// methods of input
public class Input {

    public int inputJ(){
        while (true) {
            try {
                int value = Integer.parseInt(JOptionPane.showInputDialog("Input, int"));
                return value;
            } catch (NumberFormatException eObj) {
                System.out.println("Wrong input");
            }
            finally {
                System.out.println("What do you want?Think about this!");
            }
        }
    }


    public int inputS() {
        while (true) {
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
