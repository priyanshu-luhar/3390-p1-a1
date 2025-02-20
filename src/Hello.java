import javax.swing.*;
import java.awt.*;
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
        int w = 500;
        int h = 800;

        myFrame.setSize(w, h);

        hello.panelMain.setPreferredSize(new Dimension(w, h));
        hello.actButton.setPreferredSize(new Dimension(350, 200));

        myFrame.setContentPane(hello.panelMain);
        myFrame.pack();

        myFrame.setVisible(true);
    }
}
