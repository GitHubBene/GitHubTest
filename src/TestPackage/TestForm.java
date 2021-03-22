package TestPackage;

import javax.swing.*;

public class TestForm {
    private JPanel panelMain;
    private JButton buttonTest;
    private JLabel labelTest;

    public TestForm() {
        labelTest.setText("");

        buttonTest.addActionListener(e -> labelTest.setText("That worked!"));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Window");
        frame.setContentPane(new TestForm().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
