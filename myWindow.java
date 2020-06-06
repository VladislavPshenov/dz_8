package my_project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myWindow extends JFrame {
    private JTextField textField;
    private String a;
    private JButton w_1, w_2, w_3, w_4, w_5, w_6, w_7,w_8, w_9, w_10;

    public myWindow ()
    {
        JTextField textField = new JTextField(30);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == w_1)
                    textField.getText();
                else if (e.getSource() == w_2)
                    textField.getText();
                else if(e.getSource() == w_3)
                    textField.getText();
                else if(e.getSource() == w_4)
                    textField.getText();
                else if(e.getSource() == w_5)
                    textField.getText();
                else if(e.getSource() == w_6)
                    textField.getText();
                else if(e.getSource() == w_7)
                    textField.getText();
                else if(e.getSource() == w_8)
                    textField.getText();
                else if(e.getSource() == w_9)
                    textField.getText();
                else if (e.getSource() == w_10)
                    textField.getText();
            }
        });

        setVisible(true);
        setSize(400,400);
        setLocation(500,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JButton w_1 = new JButton ("Word_1");
        w_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Изучаемое слово: Apple ");
            }
        });
        JButton w_2 = new JButton ("Translat_word_1");
        w_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText ("Перевод: Яблоко. ");
            }
        });
        JButton w_3 = new JButton("Word_2");
        w_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText ("Изучаемое слово: Apricot. ");
            }
        });
        JButton w_4 = new JButton ("Translat_word_2");
        w_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText ("Перевод: Абрикос. ");
            }
        });
        JButton w_5 = new JButton ("Word_3");
        w_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText ("Изучаемое слово: Orange. ");
            }
        });
        JButton w_6 = new JButton ("Translat_word_3");
        w_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText ("Перевод: Апельсин. ");
            }
        });
        JButton w_7 = new JButton ("Word_4");
        w_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText ("Изучаемое слово: cherry. ");
            }
        });
        JButton w_8 = new JButton ("Translat_word_4");
        w_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText ("Перевод: Вишня. ");
            }
        });
        JButton w_9 = new JButton ("Word_5");
        w_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText ("Изучаемое слово: Banana. ");
            }
        });
        JButton w_10 = new JButton ("Translat_word_5");
        w_10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText ("Перевод: Банан. ");
            }
        });
        JPanel panel1 = new JPanel(new GridLayout(1,1));
        panel1.add(textField);

        JPanel panel = new JPanel(new GridLayout(5,2));
        panel.add(w_1);
        panel.add(w_2);
        panel.add(w_3);
        panel.add(w_4);
        panel.add(w_5);
        panel.add(w_6);
        panel.add(w_7);
        panel.add(w_8);
        panel.add(w_8);
        panel.add(w_9);
        panel.add(w_10);

        add(panel, BorderLayout.CENTER);
        add(panel1,BorderLayout.NORTH);

        setVisible(true);
    }
}
