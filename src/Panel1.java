import javax.swing.JPanel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel1 extends JPanel{
    public Panel1(){
        setLayout(null);
        setBounds(0, 0, 800, 550);
        setBackground(Color.BLUE);

        Button button1 = new Button("Button1");
        button1.setBounds(50, 50, 100, 30);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Tombol 1 Klik");
            }
        });
        add(button1);

        Button button2 = new Button("Button2");
        button2.setBounds(50, 100, 100, 30);
        button2.addActionListener(e -> {
            System.out.println("Tombol 2 Klik");
        });
        add(button2);

        TextArea textArea = new TextArea();
        textArea.setBounds(50, 150, 200, 100);
        textArea.setBackground(Color.WHITE);
        textArea.setForeground(Color.RED);
        textArea.setFont(new Font("Arial", Font.ITALIC, 12));
        textArea.addKeyListener(new UpperKeyHandler());
        add(textArea);

        TextField textField = new TextField();
        textField.setBounds(50, 300, 200, 30);
        textField.setBackground(Color.WHITE);
        textField.setForeground(Color.GREEN);
        textField.setFont(new Font("Courier New", Font.PLAIN, 10));
        textField.addKeyListener(new UpperKeyHandler());
        add(textField);

        setVisible(true);
    }
}
