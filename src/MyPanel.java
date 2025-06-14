import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel
{

    MyTextBox textbox=new MyTextBox();
    MyPanel2 panel2=new MyPanel2();
public MyPanel()
{
    this.setLayout(null);
    this.setBackground(Color.BLACK);
    this.setOpaque(true);
    this.setBounds(0,0,300,400);

   ButtonPrepare buttonpanel=new ButtonPrepare(textbox,panel2);
  buttonpanel.buttonadding(this);
  //buttonpanel.lb();

    JTextField l =buttonpanel.ff();
    this.add(l);

    this.add(panel2);




}
}
