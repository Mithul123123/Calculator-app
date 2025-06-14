import javax.swing.*;
import java.awt.*;

public class MyPanel2 extends JLabel
{
    public MyPanel2()
    {

        this.setBounds(10,30,266,30);
        this.setBackground(Color.gray);
        this.setOpaque(true);
        this.setBackground(Color.gray);
        this.setFont(new Font("Consola",Font.BOLD,22));
        this.setBorder(BorderFactory.createLineBorder(Color.lightGray,2));

    }
}
