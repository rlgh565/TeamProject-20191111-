import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * 여기에 MyHelloFrame 클래스 설명을 작성하십시오.
 * 
 * @author (2018210025 현기호, 2018315053 테라오카유이카 ) 
 * @version (2019.11.11)
 */
public class MyHelloFrame extends JFrame
{   
    public JLabel la;
    
    public MyHelloFrame(){
        this.setTitle("실습_3(20191111)");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        
      
        la = new JLabel("Hello");
        
        
        setVisible(true);
    }
}