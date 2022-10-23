package Lab_6_j5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    public MyFrame(String title) throws HeadlessException {
        super(title);
        // завершение программы при закрытии пользователем окна приложения
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        series = new Linear(10, 2);
        n = 15;

        setLayout(new GridLayout(4, 2));
        add(new JLabel("First"));
        JTextField firstText = new JTextField("" + series.getA1());
        add(firstText);

        add(new JLabel("Step"));
        JTextField stepText = new JTextField("" + series.getStep());
        add(stepText);

        add(new JLabel("Count"));
        JTextField countText = new JTextField();
        add(countText);

        JButton calculateButton = new JButton("calculate");
        add(calculateButton);


        JTextField showText = new JTextField();
        add(showText);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sum = Double.parseDouble(firstText.getText()) + Double.parseDouble(stepText.getText());
                showText.setText("" + sum);
            }
        });
    }

    private Series series;
    int n;
}
