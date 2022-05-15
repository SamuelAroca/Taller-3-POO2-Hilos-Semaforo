

package com.mycompany.taller2;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Jaylo
 */
public class Taller2 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Principal();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
