import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class MyHelloPanelListener here.
 *
 * @author (2018210025현기호,2018315053테라오카 유이카)
 * @version (20191111)
 */
public class MyHelloPanelListener extends JPanel 
                                  implements KeyListener,MouseListener{
    private final int FLYING_UNIT = 10;
    public JLabel la;
    public MyHelloPanelListener(JLabel la){
        this.la = la;
    }
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode(); // 입력된 키의 키코드를 알아낸다.
        
        //키 코드 값(keyCode)에 따라 상,하,자,와 키를 판별하고 la의 위치를 이동시킨다.
        switch(keyCode) {
            case KeyEvent.VK_UP: //UP 키
            la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
            System.out.println(la.getX() + FLYING_UNIT);
            break;
            case KeyEvent.VK_DOWN: // DOWN 키
            la.setLocation(la.getX(), la.getY()+FLYING_UNIT); break;
            case KeyEvent.VK_LEFT: // DOWN 키
            la.setLocation(la.getX()-FLYING_UNIT, la.getY()); break;
            case KeyEvent.VK_RIGHT: // DOWN 키
            la.setLocation(la.getX()+FLYING_UNIT, la.getY()); break;

        }
    }
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
    public void mousePressed(MouseEvent e){
        la.setLocation(e.getX(),e.getY());
    }
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    
}
