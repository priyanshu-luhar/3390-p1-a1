import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hello {
    private JPanel panelMain;
    private JButton actButton;
    private JTextArea myName;

    public Hello() {
        actButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = "Hello World";
                JOptionPane.showMessageDialog(null, msg);
            }
        });
    }

    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Luhar Project-1 App-1");
        Hello hello = new Hello();
        int w = 500;
        int h = 600;

        myFrame.setSize(w, h);
        hello.panelMain.setBackground(Color.GRAY);
        hello.panelMain.setForeground(Color.lightGray);
        hello.panelMain.setPreferredSize(new Dimension(w, h));
        hello.actButton.setPreferredSize(new Dimension(350, 200));

        myFrame.setContentPane(hello.panelMain);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();

        myFrame.setVisible(true);
    }
}
