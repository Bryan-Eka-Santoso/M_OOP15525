import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel2 extends JPanel {

    int xKotak, yKotak, xLingkaran, yLingkaran;
    Boolean started = false;

    public Panel2() {
        setLayout(null);
        setBounds(0, 0, 800, 550);
        setBackground(Color.RED);

        xKotak = 50;
        yKotak = 150;

        xLingkaran = 50;
        yLingkaran = 225;

        Button btnStart = new Button("Start");
        btnStart.setBounds(10, 10, 100, 30);
        btnStart.addActionListener(e -> {
            started = !started;
            gerak();
        });
        add(btnStart);
    }

    public void gerak() {
        Thread timerKotak = new Thread(() -> {
            while (started) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
        
                xKotak += 5;
                if (xKotak >= 750) {
                    xKotak = 0;
                }
                repaint();
            }
        });
        Thread timerLingkaran = new Thread(() -> {
            while (started) {
                try {
                    Thread.sleep(200);
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
    
                xLingkaran += 5;
                if (xLingkaran >= 750) {
                    xLingkaran = 0;
                }
                repaint();
            }
        });
        timerLingkaran.start();
        timerKotak.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawRect(50, 50, 75, 75);
        
        g.setColor(Color.green);
        g.fillRect(xKotak, yKotak, 50, 50);

        g.setColor(Color.MAGENTA);
        g.fillOval(xLingkaran, yLingkaran, 50, 75);

    }
    
    public void show() {
        setVisible(true);
    }

    public void close() {
        setVisible(false);
    }
}