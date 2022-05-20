package hw8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class XOwithGraphics extends JFrame {

    public XOwithGraphics() {
        JFrame frame = new JFrame();
        setBounds(500, 100, 300, 300);
        setTitle("HZ chto");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));

        JButton[] button = new JButton[9];
        for (int i = 0; i < 9; i++) {
            button[i] = new JButton();
            add(button[i]);
        }

        for (int i = 0; i < 9; i++) {
            button[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent actionEvent) {
                    JButton butt = (JButton) actionEvent.getSource();
                    if (butt.getText().equals("")) {
                        butt.setText("X");

                        if ((button[0].getText().equals("X") && button[1].getText().equals("X")
                                && button[2].getText().equals("X"))
                                || (button[3].getText().equals("X") && button[4].getText().equals("X")
                                && button[5].getText().equals("X"))
                                || (button[6].getText().equals("X") && button[7].getText().equals("X")
                                && button[8].getText().equals("X"))
                                || (button[0].getText().equals("X") && button[3].getText().equals("X")
                                && button[6].getText().equals("X"))
                                || (button[1].getText().equals("X") && button[4].getText().equals("X")
                                && button[7].getText().equals("X"))
                                || (button[2].getText().equals("X") && button[5].getText().equals("X")
                                && button[8].getText().equals("X"))
                                || (button[0].getText().equals("X") && button[4].getText().equals("X")
                                && button[8].getText().equals("X"))
                                || (button[2].getText().equals("X") && button[4].getText().equals("X")
                                && button[6].getText().equals("X"))) {

                            JOptionPane.showMessageDialog(null, "Ты выиграл");
                            return;
                        }

                        int sumButton = 0;
                        for (int i = 0; i < 9; i++) {
                            if (button[i].getText().equals("X") || button[i].getText().equals("O")) {
                                sumButton++;
                            }
                        }

                        if (sumButton == 9) {
                            JOptionPane.showMessageDialog(null, "Ничья");
                            return;
                        }

                        int rand;
                        do {
                            rand = (int) (Math.random() * 9);
                        } while (button[rand].getText().equals("X") || button[rand].getText().equals("O"));
                        button[rand].setText("O");

                        if ((button[0].getText().equals("O") && button[1].getText().equals("O")
                                && button[2].getText().equals("O"))
                                || (button[3].getText().equals("O") && button[4].getText().equals("O")
                                && button[5].getText().equals("O"))
                                || (button[6].getText().equals("O") && button[7].getText().equals("O")
                                && button[8].getText().equals("O"))
                                || (button[0].getText().equals("O") && button[3].getText().equals("O")
                                && button[6].getText().equals("O"))
                                || (button[1].getText().equals("O") && button[4].getText().equals("O")
                                && button[7].getText().equals("O"))
                                || (button[2].getText().equals("O") && button[5].getText().equals("O")
                                && button[8].getText().equals("O"))
                                || (button[0].getText().equals("O") && button[4].getText().equals("O")
                                && button[8].getText().equals("O"))
                                || (button[2].getText().equals("O") && button[4].getText().equals("O")
                                && button[6].getText().equals("O"))) {

                            JOptionPane.showMessageDialog(null, "Компьютер выиграл");
                            return;
                        }
                    }
                }
            });
        }
        setVisible(true);
    }

    public static void main(String[] args) {

        new XOwithGraphics();

    }

}
