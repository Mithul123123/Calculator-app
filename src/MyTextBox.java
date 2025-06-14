import javax.swing.*;
import java.awt.*;

public class MyTextBox extends JTextField
{
public MyTextBox()
{
    this.setBounds(10,80,266,30);
    //ButtonPrepare prepare=new ButtonPrepare(this);
    //prepare.mm(this);
  //prepare.ff();
    this.setText(null);
    this.setBorder(null);
    this.setBackground(Color.lightGray);
    this.setFont(new Font("Consola",Font.BOLD,22));


}


}
