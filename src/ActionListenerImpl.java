import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerImpl implements ActionListener {
    JButton button;
    public static void main(String[] args) {
        ActionListenerImpl actionListener = new ActionListenerImpl();
        actionListener.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        buttonInit();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setBackground(Color.GREEN);
        button.setText("You did it!");
    }

    private void buttonInit() {
        button = new JButton("Click me!");
        button.setBackground(Color.ORANGE);
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 25));
        button.addActionListener(this);

    }
}
