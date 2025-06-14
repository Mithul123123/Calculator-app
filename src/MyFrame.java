import javax.swing.*;

public class MyFrame extends JFrame
{

    MyPanel panel=new MyPanel();
    ImageIcon icon1=new ImageIcon("C:\\Users\\Admin\\IdeaProjects\\Calculator\\out\\calculator-icon-8199.png");
    public MyFrame()
    {
        this.setLayout(null);
        this.setSize(300,400);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Calculator");
        this.setLocationRelativeTo(null);
        this.add(panel);
        this.setIconImage(icon1.getImage());
        this.setResizable(false);



    }
}
