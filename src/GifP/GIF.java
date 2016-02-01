package GifP;

import java.net.MalformedURLException;
import java.util.Scanner;
import javax.swing.*;

public class GIF extends JFrame {

    /*public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce un entero: ");
            int i = scanner.nextInt();
        } catch (Exception e) {
            try {
                new GIF();
            } catch (MalformedURLException e2) {
                System.out.println(e.getMessage());
            }
        }
    }*/

    public GIF(String path) {
        Icon icon = new ImageIcon(path);
        JLabel label = new JLabel(icon);

        JFrame f = new JFrame("Esto no es un fallo");
        f.getContentPane().add(label);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

}
