import javax.swing.*;
import java.awt.event.*;

public class TextTest extends JFrame {
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    JTextField textField = new JTextField(30);
    JLabel label1 = new JLabel();

    public TextTest(){

        label1.setBounds(200,200,500,50);
        panel.add(label1);


        setTitle("The Word Screen Putter Thingymabob");
        setVisible(true);
        setSize(700,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
            label1.setText(textField.getText());
            }
        });

        panel.add(textField);
        add(panel);
    }
}
