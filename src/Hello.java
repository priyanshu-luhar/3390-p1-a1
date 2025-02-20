import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hello {
    private JPanel panelMain;
    private JButton actButton;

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
        JFrame myFrame = new JFrame("Project-1 App-1");
        Hello hello = new Hello();

        myFrame.setSize(800, 400);

        myFrame.setContentPane(hello.panelMain);

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myFrame.pack();

        myFrame.setVisible(true);
    }
}
