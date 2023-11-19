package Egitim;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame {


    private final JPanel contentPanel;

    /**
     * Create the frame.
     */
    public menu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(350, 350, 400, 400);
        contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPanel);
        contentPanel.setLayout(null);

        JTextField tutartext = new JTextField("");
        tutartext.setBounds(59, 176, 97, 23);
        contentPanel.add(tutartext);


        JCheckBox ch1 = new JCheckBox("Pizza",null,false);


        ch1.setBounds(59, 47, 97, 23);
        contentPanel.add(ch1);
        ch1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (ch1.isSelected()) {
                    System.out.println(ch1.getText() + " Seçildi");
                    tutartext.setText("140");
                }
            }
        });

        JLabel lblNewLabel = new JLabel("LOKANTAMIZA HOSGELDİNİZ MENU");
        lblNewLabel.setBounds(59, 14, 300, 23);
        contentPanel.add(lblNewLabel);

        JCheckBox ch2 = new JCheckBox("Hamburger");
        ch2.setSelected(false);
        ch2.setBounds(59, 94, 97, 23);
        contentPanel.add(ch2);



        JLabel ch5 = new JLabel("Minimum tutarın altındasınız");
        ch5.setBounds(59, 249, 300, 23);
        ch5.setVisible(false);
        contentPanel.add(ch5);


        JCheckBox ch3 = new JCheckBox("Ayran");
        ch3.setBounds(59, 141, 97, 23);
        contentPanel.add(ch3);

        JButton btnNewButton = new JButton("GORUNTULE");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int tutar = 0;
                if (ch1.isSelected()) {
                    System.out.println(ch1.getText() + " Seçildi");
                    tutar += 140;
                }
                if (ch2.isSelected()) {
                    System.out.println(ch2.getText() + " Seçildi");
                    tutar += 80;
                }
                if (ch3.isSelected()) {
                    System.out.println(ch3.getText() + " Seçildi");
                    tutar += 15;
                }
                if (tutar < 80) {
                    ch5.setVisible(true);
                } else {
                    ch5.setVisible(false);
                }


                tutartext.setText(Integer.toString(tutar));


            }
        });
        btnNewButton.setBounds(173, 176, 109, 23);
        contentPanel.add(btnNewButton);
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    menu frame = new menu();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

