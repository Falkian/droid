package droids;

import java.net.MalformedURLException;
import java.util.Scanner;
import javax.swing.*;

public class Droid extends JFrame {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce un entero: ");
            int i = scanner.nextInt();
        } catch (Exception e) {
            try {
                new Droid();
            } catch (MalformedURLException e2) {
                System.out.println(e.getMessage());
            }
        }
    }

    public Droid() throws MalformedURLException {
        Icon icon = new ImageIcon("resources/exception.gif");
        JLabel label = new JLabel(icon);

        JFrame f = new JFrame("Animation");
        f.getContentPane().add(label);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

}
