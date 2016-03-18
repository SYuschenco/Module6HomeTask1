package ua.gostart.goit.Module6;

import javax.swing.*;

public class CicleSquare {

    CicleSquare() {
        while (true) {
            try {
                int radius = Integer.parseInt(JOptionPane.showInputDialog("Input radius, int"));
                //* Tips & Tricks
                //Exception handling is not supposed to replace a simple test
                //Do not micromanage exceptions
                //Make good use of the exception hierarchy
                //Do not squelch exceptions
                //When you detect an error, “tough love” works better than indulgence
                //Propagating exceptions is not a sign of shame
                if (radius < 0) {
                    System.out.println("Радиус не может быть отрицательным");
                    while (true) {
                        try {
                            radius = Integer.parseInt(JOptionPane.showInputDialog("Input radius, int"));
                            double circleSquare = Math.sqrt(radius) * Math.PI;
                            System.out.println("circleSquare=" + circleSquare);
                        } catch(NumberFormatException eObj){System.out.println("Warning!!! Errors detected!!!" +
                                " Input integer number  " + eObj);}
                    return;
                    }
                }
                double circleSquare = Math.sqrt(radius) * Math.PI;
                System.out.println("circleSquare=" + circleSquare);
                return;
            } catch (NumberFormatException eObj) {
                System.out.println("Warning!!! Errors detected!!! Input integer number  " + eObj);

            }

        }
    }
}
