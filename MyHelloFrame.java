import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * Frame 역할을 하는 MyHelloFrame 클래스 
 * 
 * @author (2018210025 현기호,2018315053 테라오카유이카 ) 
 * @version (2019.11.11)
 */
public class MyHelloFrame extends JFrame
{   
    
    public MyHelloFrame(){
        this.setTitle("실습_3(20191111)");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        MyHelloPanelListener mp = new MyHelloPanelListener();
        mp.setFocusable(true);//이게 없으면 KeyListener은 coponent를 작동시키지 않는다 .
        mp.requestFocus();
        this.add(mp);
        
        setVisible(true);
    }
}