import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ButtonPrepare  implements ActionListener, KeyListener
{
   // MyPanel panel=new MyPanel();
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button10;
    JButton button11;
    JButton button12;
    JButton button13;
    JButton button14;

    JButton button16;
    JButton button17;
    JButton button18;
    JTextField Text;
    String operator=null;
    double value1;
    double value2;
    int count=0;
    int countop1=0;
    int countop2=0;
    int countop3=0;
    int countop4=0;
    int countop5=0;
    String op1=null;
    String op2=null;
    String op3=null;
    String op4=null;



    double tota;
    JLabel panel2;

    public  ButtonPrepare(JTextField textaa,JLabel panel2)
    {
     this.Text=textaa;
     this.panel2=panel2;
        Text.addKeyListener(this);

    }
    public JPanel buttonadding(JPanel panel)

    {
        button1=new JButton("1");
        button1.setBounds(10,143,50,50);
        button1.setFocusable(false);
        button1.setFont(new Font("Consola",Font.BOLD,22));
        button1.setBackground(new Color(96,96,96));
        button1.setForeground(Color.white);
        button1.setBorderPainted(false);
        button1.addActionListener(this);
        //button2
        button2=new JButton("2");
        button2.setBounds(64,143,50,50);
        button2.setFocusable(false);
        button2.setFont(new Font("Consola",Font.BOLD,22));
        button2.setBackground(new Color(96,96,96));
        button2.setForeground(Color.white);
        button2.setBorderPainted(false);
        button2.addActionListener(this);
        //button3
        button3=new JButton("3");
        button3.setBounds(118,143,50,50);
        button3.setFocusable(false);
        button3.setFont(new Font("Consola",Font.BOLD,22));
        button3.setBackground(new Color(96,96,96));
        button3.setForeground(Color.white);
        button3.setBorderPainted(false);
        button3.addActionListener(this);
        //button4
        button4=new JButton("4");
        button4.setBounds(10,197,50,50);
        button4.setFocusable(false);
        button4.setFont(new Font("Consola",Font.BOLD,22));
        button4.setBackground(new Color(96,96,96));
        button4.setForeground(Color.white);
        button4.setBorderPainted(false);
        button4.addActionListener(this);
        //button5
        button5=new JButton("5");
        button5.setBounds(64,197,50,50);
        button5.setFocusable(false);
        button5.setFont(new Font("Consola",Font.BOLD,22));
        button5.setBackground(new Color(96,96,96));
        button5.setForeground(Color.white);
        button5.setBorderPainted(false);
        button5.addActionListener(this);

        //button6
        button6=new JButton("6");
        button6.setBounds(118,197,50,50);
        button6.setFocusable(false);
        button6.setFont(new Font("Consola",Font.BOLD,22));
        button6.setBackground(new Color(96,96,96));
        button6.setForeground(Color.white);
        button6.setBorderPainted(false);
        button6.addActionListener(this);
        //button7
        button7=new JButton("7");
        button7.setBounds(10,251,50,50);
        button7.setFocusable(false);
        button7.setFont(new Font("Consola",Font.BOLD,22));
        button7.setBackground(new Color(96,96,96));
        button7.setForeground(Color.white);
        button7.setBorderPainted(false);
        button7.addActionListener(this);
        //button8
        button8=new JButton("8");
        button8.setBounds(64,251,50,50);
        button8.setFocusable(false);
        button8.setFont(new Font("Consola",Font.BOLD,22));
        button8.setBackground(new Color(96,96,96));
        button8.setForeground(Color.white);
        button8.setBorderPainted(false);
        button8.addActionListener(this);
        //button9
        button9=new JButton("9");
        button9.setBounds(118,251,50,50);
        button9.setFocusable(false);
        button9.setFont(new Font("Consola",Font.BOLD,22));
        button9.setBackground(new Color(96,96,96));
        button9.setForeground(Color.white);
        button9.setBorderPainted(false);
        button9.addActionListener(this);
        //button10
        button10=new JButton("0");
        button10.setBounds(10,305,50,50);button1.setFocusable(false);
        button10.setFont(new Font("Consola",Font.BOLD,22));
        button10.setBackground(new Color(96,96,96));
        button10.setForeground(Color.white);
        button10.setFocusable(false);
        button10.setBorderPainted(false);
        button10.addActionListener(this);
        //button11
        button11=new JButton("+");
        button11.setBounds(172,143,50,50);
        button11.setFocusable(false);
        button11.setFont(new Font("Consola",Font.BOLD,22));
        button11.setBackground(new Color(64,64,64));
        button11.setForeground(Color.white);
        button11.setBorderPainted(false);
        button11.addActionListener(this);
        //button12
        button12=new JButton("-");
        button12.setBounds(172,197,50,50);
        button12.setFocusable(false);
        button12.setFont(new Font("Consola",Font.BOLD,22));
        button12.setBackground(new Color(64,64,64));
        button12.setForeground(Color.white);
        button12.setBorderPainted(false);
        button12.addActionListener(this);
        //button13
        button13=new JButton("*");
        button13.setBounds(172,251,50,50);
        button13.setFocusable(false);
        button13.setFont(new Font("Consola",Font.BOLD,22));
        button13.setBackground(new Color(64,64,64));
        button13.setForeground(Color.white);
        button13.setBorderPainted(false);
        button13.addActionListener(this);
        //button14
        button14=new JButton("/");
        button14.setBounds(172,305,50,50);
        button14.setFocusable(false);
        button14.setFont(new Font("Consola",Font.BOLD,22));
        button14.setBackground(new Color(64,64,64));
        button14.setForeground(Color.white);
        button14.setBorderPainted(false);
        button14.addActionListener(this);


        //button16
        button16=new JButton(".");
        button16.setBounds(64,305,104,50);
        button16.setFocusable(false);
        button16.setFont(new Font("Consola",Font.BOLD,22));
        button16.setBackground(new Color(96,96,96));
        button16.setForeground(Color.white);
        button16.setBorderPainted(false);
        button16.addActionListener(this);
        //button17
        button17=new JButton("ce");
        button17.setBounds(226,143,50,104);
        button17.setFocusable(false);
        button17.setFont(new Font("Consola",Font.BOLD,13));
        button17.setBackground(new Color(64,64,64));
        button17.setForeground(Color.white);
        button17.setBorderPainted(false);
        button17.addActionListener(this);
        //button18
        button18=new JButton("=");
        button18.setBounds(226,251,50,104);
        button18.setFocusable(false);
        button18.setFont(new Font("Consola",Font.BOLD,22));
        button18.setBackground(new Color(64,64,64));
        button18.setForeground(Color.white);
        button18.setBorderPainted(false);
        button18.addActionListener(this);
        //add buttons
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button10);
        panel.add(button16);
        panel.add(button11);
        panel.add(button12);
        panel.add(button13);
        panel.add(button14);
        panel.add(button17);
        panel.add(button18);
        return panel;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object xx=e.getSource();
        if(e.getSource()==button1)
        {
            countop5=0;

            this.Text.setText(Text.getText()+button1.getText());
            button13.setBackground(new Color(64, 64, 64));
            button14.setBackground(new Color(64, 64, 64));
            button11.setBackground(new Color(64, 64, 64));
            button12.setBackground(new Color(64, 64, 64));



        }else if(e.getSource()==button2)
        {
            countop5=0;
            button13.setBackground(new Color(64, 64, 64));
            button14.setBackground(new Color(64, 64, 64));
            button11.setBackground(new Color(64, 64, 64));
            button12.setBackground(new Color(64, 64, 64));
            this.Text.setText(Text.getText()+button2.getText());


        }else if(e.getSource()==button3)
        {
            countop5=0;
            button13.setBackground(new Color(64, 64, 64));
            button14.setBackground(new Color(64, 64, 64));
            button11.setBackground(new Color(64, 64, 64));
            button12.setBackground(new Color(64, 64, 64));
            this.Text.setText(Text.getText()+button3.getText());


        }else if(e.getSource()==button4)
        {
            countop5=0;
            button13.setBackground(new Color(64, 64, 64));
            button14.setBackground(new Color(64, 64, 64));
            button11.setBackground(new Color(64, 64, 64));
            button12.setBackground(new Color(64, 64, 64));
            this.Text.setText(Text.getText()+button4.getText());


        }else if(e.getSource()==button5)
        {
            countop5=0;
            button13.setBackground(new Color(64, 64, 64));
            button14.setBackground(new Color(64, 64, 64));
            button11.setBackground(new Color(64, 64, 64));
            button12.setBackground(new Color(64, 64, 64));
            this.Text.setText(Text.getText()+button5.getText());


        }else if(e.getSource()==button6)
        {
            countop5=0;
            button13.setBackground(new Color(64, 64, 64));
            button14.setBackground(new Color(64, 64, 64));
            button11.setBackground(new Color(64, 64, 64));
            button12.setBackground(new Color(64, 64, 64));
            this.Text.setText(Text.getText()+button6.getText());


        }else if(e.getSource()==button7)
        {
            countop5=0;
            button13.setBackground(new Color(64, 64, 64));
            button14.setBackground(new Color(64, 64, 64));
            button11.setBackground(new Color(64, 64, 64));
            button12.setBackground(new Color(64, 64, 64));
            this.Text.setText(Text.getText()+button7.getText());


        }else if(e.getSource()==button8)
        {
            countop5=0;
            button13.setBackground(new Color(64, 64, 64));
            button14.setBackground(new Color(64, 64, 64));
            button11.setBackground(new Color(64, 64, 64));
            button12.setBackground(new Color(64, 64, 64));
            this.Text.setText(Text.getText()+button8.getText());


        }else if(e.getSource()==button9)
        {
            countop5=0;
            button13.setBackground(new Color(64, 64, 64));
            button14.setBackground(new Color(64, 64, 64));
            button11.setBackground(new Color(64, 64, 64));
            button12.setBackground(new Color(64, 64, 64));
            this.Text.setText(Text.getText()+button9.getText());


        }else if(e.getSource()==button10)
        {
            countop5=0;
            button13.setBackground(new Color(64, 64, 64));
            button14.setBackground(new Color(64, 64, 64));
            button11.setBackground(new Color(64, 64, 64));
            button12.setBackground(new Color(64, 64, 64));
            this.Text.setText(Text.getText()+button10.getText());


        }else if(e.getSource()==button16)
        {
               if((count==0)&&(!(Text.getText().matches("[.]")))){
                   this.Text.setText(Text.getText() + button16.getText());
                   count++;
               }

            button13.setBackground(new Color(64, 64, 64));
            button14.setBackground(new Color(64, 64, 64));
            button11.setBackground(new Color(64, 64, 64));
            button12.setBackground(new Color(64, 64, 64));
//********************************operator + ********************************************************************
        }else if(e.getSource()==button11)
        {


          //  if(operator==null) {

            if (!(Text.getText().trim().isEmpty())/*&&(!(panel2.getText().trim().isEmpty()))*/ && (!(Text.getText().equals("."))) && (!(Text.getText().matches("[a-zA-Z~`!@#$%^&*()_+=/\"';:,<>|{} ]")))) {

                         count = 0;
                op1=button11.getText();
                         if(countop1>0)
                         {
                             value2 = Double.parseDouble(Text.getText());
                             tota = value1 + value2;
                             Text.setText(Double.toString(tota));
                             panel2.setText(Double.toString(tota));
                         }else if (countop2>0)
                         {
                             value2 = Double.parseDouble(Text.getText());
                             tota = value1 - value2;
                             Text.setText(Double.toString(tota));
                             panel2.setText(Double.toString(tota));
                         } else if (countop3>0) {
                             value2 = Double.parseDouble(Text.getText());
                             tota = value1 * value2;
                             Text.setText(Double.toString(tota));
                             panel2.setText(Double.toString(tota));
                         } else if (countop4>0) {
                             value2 = Double.parseDouble(Text.getText());
                             tota = value1 / value2;
                             Text.setText(Double.toString(tota));
                             panel2.setText(Double.toString(tota));
                         }
                         operator = button11.getText();
                         //this.Text.setText(Text.getText()+button1.getText());
                         button11.setBackground(Color.ORANGE);
                         button12.setBackground(new Color(64, 64, 64));
                         button13.setBackground(new Color(64, 64, 64));
                         button14.setBackground(new Color(64, 64, 64));
                         //logic


                         value1 = Double.parseDouble(Text.getText());
                         panel2.setText(Double.toString(value1));
                         Text.setText(null);
                          countop1++;

                         countop5=0;
                         countop2=0;
                         countop3=0;
                         countop4=0;

                }
            //}
//********************************operator - ********************************************************************
        }else if(e.getSource()==button12)
        {

            //if(operator==null) {
                if(!(Text.getText().trim().isEmpty())/*&&(!(panel2.getText().trim().isEmpty()))*/&&(!(Text.getText().equals(".")) )&&(!(Text.getText().matches("[a-zA-Z~`!@#$%^&*()_+=/\"';:,<>|{} ]")) )){

                    count = 0;
                    op2=button12.getText();
                    if(countop2>0)


                        {
                            value2 = Double.parseDouble(Text.getText());
                            tota = value1 - value2;
                            Text.setText(Double.toString(tota));
                            panel2.setText(Double.toString(tota));
                        } else if (countop1>0)
                    {
                        value2 = Double.parseDouble(Text.getText());
                        tota = value1 + value2;
                        Text.setText(Double.toString(tota));
                        panel2.setText(Double.toString(tota));
                    } else if (countop3>0) {
                        value2 = Double.parseDouble(Text.getText());
                        tota = value1 * value2;
                        Text.setText(Double.toString(tota));
                        panel2.setText(Double.toString(tota));
                    } else if (countop4>0) {
                        value2 = Double.parseDouble(Text.getText());
                        tota = value1 / value2;
                        Text.setText(Double.toString(tota));
                        panel2.setText(Double.toString(tota));
                    }

                    operator = button12.getText();
                    //this.Text.setText(Text.getText()+button1.getText());
                    button12.setBackground(Color.ORANGE);
                    button13.setBackground(new Color(64, 64, 64));
                    button14.setBackground(new Color(64, 64, 64));
                    button11.setBackground(new Color(64, 64, 64));
                    //hadanna

                        value1 = Double.parseDouble(Text.getText());
                        panel2.setText(Double.toString(value1));
                        Text.setText(null);

                    countop2++;
                    countop5=0;
                    countop1=0;
                    countop3=0;
                    countop4=0;


            }
        //}
//********************************operator * ********************************************************************
        }else if(e.getSource()==button13)
        {

           // if(operator==null) {
            if(!(Text.getText().trim().isEmpty())/*&&(!(panel2.getText().trim().isEmpty()))*/&&(!(Text.getText().equals(".")) )&&(!(Text.getText().matches("[a-zA-Z~`!@#$%^&*()_+=/\"';:,<>|{} ]")) )){

                op3=button13.getText();

                    count = 0;

                if(countop3>0)
                {
                    value2 = Double.parseDouble(Text.getText());
                    tota = value1 * value2;
                    Text.setText(Double.toString(tota));
                    panel2.setText(Double.toString(tota));
                }else if (countop1>0)
                {
                    value2 = Double.parseDouble(Text.getText());
                    tota = value1 + value2;
                    Text.setText(Double.toString(tota));
                    panel2.setText(Double.toString(tota));
                } else if (countop2>0) {
                    value2 = Double.parseDouble(Text.getText());
                    tota = value1 - value2;
                    Text.setText(Double.toString(tota));
                    panel2.setText(Double.toString(tota));
                } else if (countop4>0) {
                    value2 = Double.parseDouble(Text.getText());
                    tota = value1 / value2;
                    Text.setText(Double.toString(tota));
                    panel2.setText(Double.toString(tota));
                }
                    //this.Text.setText(Text.getText()+button1.getText());
                operator = button13.getText();
                    button13.setBackground(Color.ORANGE);
                    button14.setBackground(new Color(64, 64, 64));
                    button11.setBackground(new Color(64, 64, 64));
                    button12.setBackground(new Color(64, 64, 64));
                    value1 = Double.parseDouble(Text.getText());
                    panel2.setText(Double.toString(value1));
                    Text.setText(null);
                    countop3++;
                    countop5=0;
                    countop1=0;
                    countop2=0;
                    countop4=0;

            }
        //}

//********************************operator / ********************************************************************
        }else if(e.getSource()==button14)
        {

            //if(operator==null) {
            if(!(Text.getText().trim().isEmpty())/*&&(!(panel2.getText().trim().isEmpty()))*/&&(!(Text.getText().equals(".")) )&&(!(Text.getText().matches("[a-zA-Z~`!@#$%^&*()_+=/\"';:,<>|{} ]")) )){

                    count = 0;
                op4=button14.getText();
                    if(countop4>0)
                    {
                        value2 = Double.parseDouble(Text.getText());
                        tota = value1 / value2;
                        Text.setText(Double.toString(tota));
                        panel2.setText(Double.toString(tota));
                    }
                    else if (countop1>0)
                    {
                        value2 = Double.parseDouble(Text.getText());
                        tota = value1 + value2;
                        Text.setText(Double.toString(tota));
                        panel2.setText(Double.toString(tota));
                    } else if (countop3>0) {
                        value2 = Double.parseDouble(Text.getText());
                        tota = value1 * value2;
                        Text.setText(Double.toString(tota));
                        panel2.setText(Double.toString(tota));
                    } else if (countop2>0) {
                        value2 = Double.parseDouble(Text.getText());
                        tota = value1 - value2;
                        Text.setText(Double.toString(tota));
                        panel2.setText(Double.toString(tota));
                    }
                    operator = button14.getText();
                    //this.Text.setText(Text.getText()+button1.getText());
                    button14.setBackground(Color.ORANGE);
                    button13.setBackground(new Color(64, 64, 64));
                    button11.setBackground(new Color(64, 64, 64));
                    button12.setBackground(new Color(64, 64, 64));
                    value1 = Double.parseDouble(Text.getText());
                    panel2.setText(Double.toString(value1));
                    Text.setText(null);
                    countop4++;
                    countop5=0;
                    countop1=0;
                    countop2=0;
                    countop3=0;
                }
            
        //}

        }else if(e.getSource()==button17)
        {
            value2=0;
            value1=0;
           countop5=0;            //this.Text.setText(Text.getText()+button1.getText());
           Text.setText("");
           panel2.setText("");
            button13.setBackground(new Color(64, 64, 64));
            button14.setBackground(new Color(64, 64, 64));
            button11.setBackground(new Color(64, 64, 64));
            button12.setBackground(new Color(64, 64, 64));

        }
        //*******************************************************operator =************************************************
        else if(e.getSource()==button18)
        {
            if(!(Text.getText().trim().isEmpty())&&(!(panel2.getText().trim().isEmpty()))&&(!(Text.getText().equals(".")) )&&(!(Text.getText().matches("[a-zA-Z~`!@#$%^&*()_+=/\"';:,<>|{} ]")) )){
                countop5++;
                     if(countop5==1)
                     {
                    switch (operator) {
                        case "+" -> {
                            value2 = Double.parseDouble(Text.getText());
                            tota = value1 + value2;
                            Text.setText(Double.toString(tota));
                            panel2.setText(Double.toString(tota));
                        }
                        case "-" -> {
                            value2 = Double.parseDouble(Text.getText());
                            tota = value1 - value2;
                            Text.setText(Double.toString(tota));
                            panel2.setText(Double.toString(tota));
                        }
                        case "*" -> {
                            value2 = Double.parseDouble(Text.getText());
                            tota = value1 * value2;
                            Text.setText(Double.toString(tota));
                            panel2.setText(Double.toString(tota));
                        }
                        case "/" -> {
                            value2 = Double.parseDouble(Text.getText());
                            tota = value1 / value2;
                            Text.setText(Double.toString(tota));
                            panel2.setText(Double.toString(tota));
                        }
                    }
                     }
                    countop1=0;
                    countop2=0;
                    countop3=0;
                    countop4=0;
                }
            }




    }
    public JTextField ff()
    {
        return this.Text;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar())
        {
            case '+'->{ e.consume();if (!(Text.getText().trim().isEmpty())/*&&(!(panel2.getText().trim().isEmpty()))*/ && (!(Text.getText().equals("."))) && (!(Text.getText().matches("[a-zA-Z~`!@#$%^&*()_+=/\"';:,<>|{} ]")))) {

                count = 0;
                op1=button11.getText();
                if(countop1>0)
                {
                    value2 = Double.parseDouble(Text.getText());
                    tota = value1 + value2;
                    Text.setText(Double.toString(tota));
                    panel2.setText(Double.toString(tota));
                }
                operator = button11.getText();
                //this.Text.setText(Text.getText()+button1.getText());
                button11.setBackground(Color.ORANGE);
                button12.setBackground(new Color(64, 64, 64));
                button13.setBackground(new Color(64, 64, 64));
                button14.setBackground(new Color(64, 64, 64));
                //logic


                value1 = Double.parseDouble(Text.getText());
                panel2.setText(Double.toString(value1));
                Text.setText(null);
                countop1++;

                countop5=0;
                countop2=0;
                countop3=0;
                countop4=0;

            }break;}

            case '-'->{e.consume();if(!(Text.getText().trim().isEmpty())/*&&(!(panel2.getText().trim().isEmpty()))*/&&(!(Text.getText().equals(".")) )&&(!(Text.getText().matches("[a-zA-Z~`!@#$%^&*()_+=/\"';:,<>|{} ]")) )){

                count = 0;
                op2=button12.getText();
                if(countop2>0)


                {
                    value2 = Double.parseDouble(Text.getText());
                    tota = value1 - value2;
                    Text.setText(Double.toString(tota));
                    panel2.setText(Double.toString(tota));
                }

                operator = button12.getText();
                //this.Text.setText(Text.getText()+button1.getText());
                button12.setBackground(Color.ORANGE);
                button13.setBackground(new Color(64, 64, 64));
                button14.setBackground(new Color(64, 64, 64));
                button11.setBackground(new Color(64, 64, 64));
                //hadanna

                value1 = Double.parseDouble(Text.getText());
                panel2.setText(Double.toString(value1));
                Text.setText(null);

                countop2++;
                countop5=0;
                countop1=0;
                countop3=0;
                countop4=0;


            } break;}

            case '*'-> {e.consume();
                if (!(Text.getText().trim().isEmpty())/*&&(!(panel2.getText().trim().isEmpty()))*/ && (!(Text.getText().equals("."))) && (!(Text.getText().matches("[a-zA-Z~`!@#$%^&*()_+=/\"';:,<>|{} ]")))) {

                    op3 = button13.getText();

                    count = 0;

                    if (countop3 > 0) {
                        value2 = Double.parseDouble(Text.getText());
                        tota = value1 * value2;
                        Text.setText(Double.toString(tota));
                        panel2.setText(Double.toString(tota));
                    }
                    //this.Text.setText(Text.getText()+button1.getText());
                    operator = button13.getText();
                    button13.setBackground(Color.ORANGE);
                    button14.setBackground(new Color(64, 64, 64));
                    button11.setBackground(new Color(64, 64, 64));
                    button12.setBackground(new Color(64, 64, 64));
                    value1 = Double.parseDouble(Text.getText());
                    panel2.setText(Double.toString(value1));
                    Text.setText(null);
                    countop3++;
                    countop5 = 0;
                    countop1 = 0;
                    countop2 = 0;
                    countop4 = 0;
                }
                break;
            }

            case '/'->{ e.consume();if(!(Text.getText().trim().isEmpty())/*&&(!(panel2.getText().trim().isEmpty()))*/&&(!(Text.getText().equals(".")) )&&(!(Text.getText().matches("[a-zA-Z~`!@#$%^&*()_+=/\"';:,<>|{} ]")) )) {

                count = 0;
                op4 = button14.getText();
                if (countop4 > 0) {
                    value2 = Double.parseDouble(Text.getText());
                    tota = value1 / value2;
                    Text.setText(Double.toString(tota));
                    panel2.setText(Double.toString(tota));
                }
                operator = button14.getText();
                //this.Text.setText(Text.getText()+button1.getText());
                button14.setBackground(Color.ORANGE);
                button13.setBackground(new Color(64, 64, 64));
                button11.setBackground(new Color(64, 64, 64));
                button12.setBackground(new Color(64, 64, 64));
                value1 = Double.parseDouble(Text.getText());
                panel2.setText(Double.toString(value1));
                Text.setText(null);
                countop4++;
                countop5 = 0;
                countop1 = 0;
                countop2 = 0;
                countop3 = 0;
            }
                break;
            }

            case '='->{e.consume();if(!(Text.getText().trim().isEmpty())&&(!(panel2.getText().trim().isEmpty()))&&(!(Text.getText().equals(".")) )&&(!(Text.getText().matches("[a-zA-Z~`!@#$%^&*()_+=/\"';:,<>|{} ]")) )){
                countop5++;
                if(countop5==1)
                {
                    switch (operator) {
                        case "+" -> {
                            value2 = Double.parseDouble(Text.getText());
                            tota = value1 + value2;
                            Text.setText(Double.toString(tota));
                            panel2.setText(Double.toString(tota));
                        }
                        case "-" -> {
                            value2 = Double.parseDouble(Text.getText());
                            tota = value1 - value2;
                            Text.setText(Double.toString(tota));
                            panel2.setText(Double.toString(tota));
                        }
                        case "*" -> {
                            value2 = Double.parseDouble(Text.getText());
                            tota = value1 * value2;
                            Text.setText(Double.toString(tota));
                            panel2.setText(Double.toString(tota));
                        }
                        case "/" -> {
                            value2 = Double.parseDouble(Text.getText());
                            tota = value1 / value2;
                            Text.setText(Double.toString(tota));
                            panel2.setText(Double.toString(tota));
                        }
                    }
                }
                countop1=0;
                countop2=0;
                countop3=0;
                countop4=0;
            }
                break;
            }

            case '.'->{e.consume();
                if((count==0)&&(!(Text.getText().matches("[.]")))){
                    this.Text.setText(Text.getText() + button16.getText());
                    count++;
                }
                button13.setBackground(new Color(64, 64, 64));
                button14.setBackground(new Color(64, 64, 64));
                button11.setBackground(new Color(64, 64, 64));
                button12.setBackground(new Color(64, 64, 64));
                break;
            }


        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
if(e.getKeyCode()==10)
{
    e.consume();if(!(Text.getText().trim().isEmpty())&&(!(panel2.getText().trim().isEmpty()))&&(!(Text.getText().equals(".")) )&&(!(Text.getText().matches("[a-zA-Z~`!@#$%^&*()_+=/\"';:,<>|{} ]")) )){
        countop5++;
        if(countop5==1)
        {
            switch (operator) {
                case "+" -> {
                    value2 = Double.parseDouble(Text.getText());
                    tota = value1 + value2;
                    Text.setText(Double.toString(tota));
                    panel2.setText(Double.toString(tota));
                }
                case "-" -> {
                    value2 = Double.parseDouble(Text.getText());
                    tota = value1 - value2;
                    Text.setText(Double.toString(tota));
                    panel2.setText(Double.toString(tota));
                }
                case "*" -> {
                    value2 = Double.parseDouble(Text.getText());
                    tota = value1 * value2;
                    Text.setText(Double.toString(tota));
                    panel2.setText(Double.toString(tota));
                }
                case "/" -> {
                    value2 = Double.parseDouble(Text.getText());
                    tota = value1 / value2;
                    Text.setText(Double.toString(tota));
                    panel2.setText(Double.toString(tota));
                }
            }
        }
        countop1=0;
        countop2=0;
        countop3=0;
        countop4=0;
    }
}else if(e.getKeyCode()==8)
{
    countop5=0;            //this.Text.setText(Text.getText()+button1.getText());
    Text.setText("");
    panel2.setText("");
    button13.setBackground(new Color(64, 64, 64));
    button14.setBackground(new Color(64, 64, 64));
    button11.setBackground(new Color(64, 64, 64));
    button12.setBackground(new Color(64, 64, 64));
}
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("code is "+ e.getKeyCode());
    }
    /*public JLabel lb()
    {

        return this.panel2;
    }*/


}
