package hw8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NoobKubik extends JFrame {

    int rand=6;


    public NoobKubik () {
        setBounds (500, 100, 300,400);
        setTitle ("NoobKubik");
        setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);

        Font fontNumber = new Font ("Arial", Font.BOLD, 120);
        Font fontButton = new Font ("Arial", Font.PLAIN,20);

        ImageIcon[] img = new ImageIcon[6];
        img[0] = new ImageIcon("src/main/java/hw8/1.jpg");
        img[1] = new ImageIcon("src/main/java/hw8/2.jpg");
        img[2] = new ImageIcon("src/main/java/hw8/3.jpg");
        img[3] = new ImageIcon("src/main/java/hw8/4.jpg");
        img[4] = new ImageIcon("src/main/java/hw8/5.jpg");
        img[5] = new ImageIcon("src/main/java/hw8/6.jpg");


        JLabel number = new JLabel ();
        number.setFont(fontNumber);
        number.setHorizontalAlignment (SwingConstants.CENTER);
        add (number, BorderLayout.CENTER);

        number.setText(String.valueOf("Run"));

        JButton runButton = new JButton("Бросай!");
        runButton.setFont(fontButton);
        add (runButton, BorderLayout.SOUTH);



        runButton.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {

                number.setText(String.valueOf(""));
                number.setIcon(img[(int) (Math.random()*rand)]);

            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {

        new NoobKubik();

    }

}
