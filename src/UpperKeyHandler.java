import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class UpperKeyHandler implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        e.setKeyChar(Character.toUpperCase(c));
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    
}
