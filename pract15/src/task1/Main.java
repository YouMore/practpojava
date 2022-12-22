package task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    Main() {
        setSize(400, 300);
        String[] items = {"Австралия", "Англия", "Китай", "Россия"};
        String[] facts = {"Численность населения: 30 миллиона", "Численность населения: 55,98 миллиона", "Численность населения: 1,412 миллиарда", "Численность населения: 170 миллиона"};
        JComboBox menu = new JComboBox(items);
        JPanel pan1 = new JPanel();
        JPanel pan2 = new JPanel();
        JLabel label = new JLabel("Выберите страну");
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox) e.getSource();
                label.setText(facts[box.getSelectedIndex()]);
            }
        });
        pan2.add(label);
        setLayout(new BorderLayout());
        pan1.add(menu);
        add(menu, BorderLayout.NORTH);
        add(pan2, BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main();
    }
}
