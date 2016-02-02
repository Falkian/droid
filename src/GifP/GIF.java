package GifP;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.*;

public class GIF extends JFrame {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce un entero: ");
            int i = scanner.nextInt();
        } catch (InputMismatchException e) {
            new GIF();
        }
    }

    public GIF() {

        Icon icon = new ImageIcon("resources/exception.gif");
        JLabel label = new JLabel(icon);

        JFrame f = new JFrame("Esto no es un fallo");
        f.getContentPane().add(label);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}