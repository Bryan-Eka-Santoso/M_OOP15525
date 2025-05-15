import java.awt.Button;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Layar extends JFrame {
    public Layar(){
        setTitle("Main Form");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        Panel1 panel1 = new Panel1();
        Panel2 panel2 = new Panel2();
        
        Panel panelContainer = new Panel();
        panelContainer.setLayout(null);
        panelContainer.setBounds(0, 50, 800, 550);
        panelContainer.setBackground(Color.WHITE);
        add(panelContainer);
        panelContainer.add(panel1);


        Button btnPanel1 = new Button("Panel 1");
        btnPanel1.setBounds(0, 0, 100, 30);
        btnPanel1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                panelContainer.removeAll();
                panelContainer.add(panel1);
                panelContainer.revalidate();
                panelContainer.repaint();
            }
        });
        add(btnPanel1);

        Button btnPanel2 = new Button("Panel 2");
        btnPanel2.setBounds(125, 0, 100, 30);
        btnPanel2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                panelContainer.removeAll();
                panelContainer.add(panel2);
                panelContainer.revalidate();
                panelContainer.repaint();
            }
        });
        add(btnPanel2);

    }

    public void showLayar(){
        this.setVisible(true);
    }
}
