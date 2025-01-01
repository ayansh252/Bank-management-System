package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup extends JFrame implements ActionListener {

    JRadioButton r1,r2,m1,m2,m3;

    JButton next;
    JTextField textname,textfname,textEmail,textAdd,textcity,textpin,textstate;
    JDateChooser dateChooser;
    Random ran=new Random();
    long first4=(ran.nextLong()%9000L)+1000L;
    String first=" "+Math.abs(first4);
    signup(){
        super("APPILICATION FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.jpeg"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("APPILICATION FORM NO."+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

       JLabel label2=new JLabel("Page 1");
       label2.setFont(new Font("Raleway",Font.BOLD,22));
       label2.setBounds(330,70,600,30);
       add(label2);

       JLabel label3=new JLabel("Personal Details");
       label3.setFont(new Font("Raleway",Font.BOLD,22));
       label3.setBounds(290,90,600,30);
       add(label3);

       JLabel laabelName=new JLabel("Name :");
       laabelName.setFont(new Font("Raleway",Font.BOLD,20));
       laabelName.setBounds(100,190,100,30);
       add(laabelName);

       textname=new JTextField();
       textname.setFont(new Font("Raleway",Font.BOLD,14));
       textname.setBounds(300,190,400,30);
       add(textname);

       JLabel labelfname=new JLabel("Father's Name :");
       labelfname.setFont(new Font("Raleway",Font.BOLD,20));
       labelfname.setBounds(100,240,200,30);
       add(labelfname);

     textfname=new JTextField();
     textfname.setFont(new Font("Raleway",Font.BOLD,14));
     textfname.setBounds(300,240,400,30);
     add(textfname);

     JLabel DOB=new JLabel("Date of Birth");
     DOB.setFont(new Font("Raleway",Font.BOLD,20));
     DOB.setBounds(100,340,200,30);
     add(DOB);

     dateChooser =new JDateChooser();
     dateChooser.setForeground(new Color(105,105,105));
     dateChooser.setBounds(300,340,400,30);
     add(dateChooser);

     JLabel labelG=new JLabel("Gender");
     labelG.setFont(new Font("Raleway",Font.BOLD,20));
     labelG.setBounds(100,290,200,30);
     add(labelG);

     r1=new JRadioButton("Male");
     r1.setFont(new Font("Raleway",Font.BOLD,14));
     r1.setBackground(new Color(222,255,228));
     r1.setBounds(300,290,60,30);
     add(r1);

     r2=new JRadioButton("Female");
     r2.setFont(new Font("Raleway",Font.BOLD,14));
     r2.setBackground(new Color(222,255,228));
     r2.setBounds(450,290,90,30);
     add(r2);

     ButtonGroup buttonGroup=new ButtonGroup();
     buttonGroup.add(r1);
     buttonGroup.add(r2);


        JLabel labelEmail=new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail=new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelms=new JLabel("Marrital Status :");
        labelms.setFont(new Font("Raleway",Font.BOLD,20));
        labelms.setBounds(100,440,200,30);
        add(labelms);

        m1=new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBounds(300,440,100,30);
        m1.setBackground(new Color(222,255,228));
        add(m1);

        m2=new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBounds(450,440,100,30);
        m2.setBackground(new Color(222,255,228));
        add(m2);

        m3=new JRadioButton("Other");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBounds(635,440,100,30);
        m3.setBackground(new Color(222,255,228));
        add(m3);

        ButtonGroup buttonGroup2=new ButtonGroup();
        buttonGroup2.add(m1);
        buttonGroup2.add(m2);
        buttonGroup2.add(m3);


        JLabel labelAdd=new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textAdd=new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        JLabel labelcity=new JLabel("City :");
        labelcity.setFont(new Font("Raleway",Font.BOLD,20));
        labelcity.setBounds(100,540,200,30);
        add(labelcity);

        textcity=new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD,14));
        textcity.setBounds(300,540,400,30);
        add(textcity);

        JLabel labelpin=new JLabel("Pin Code :");
        labelpin.setFont(new Font("Raleway",Font.BOLD,20));
        labelpin.setBounds(100,590,200,30);
        add(labelpin);

        textpin=new JTextField();
        textpin.setFont(new Font("Raleway",Font.BOLD,14));
        textpin.setBounds(300,590,400,30);
        add(textpin);

        JLabel labelstate=new JLabel("State :");
        labelstate.setFont(new Font("Raleway",Font.BOLD,20));
        labelstate.setBounds(100,640,200,30);
        add(labelstate);

        textstate=new JTextField();
        textstate.setFont(new Font("Raleway",Font.BOLD,14));
        textstate.setBounds(300,640,400,30);
        add(textstate);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.black);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno=first;
        String name=textname.getText();
        String fname=textfname.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender="Male";
        }
        else if (r2.isSelected()){
            gender="Female";
        }
        String email=textEmail.getText();
        String marital=null;
        if(m1.isSelected())
        {
            marital="Married";
        }
        else if(m2.isSelected()){
            marital="Unmarried";
        }
        else if(m3.isSelected()){
            marital="Other";
        }
        String address=textAdd.getText();
        String city=textcity.getText();
        String pincode=textpin.getText();
        String state=textstate.getText();

        try{
            if(textname.getText().equals("")){
                JOptionPane.showMessageDialog(null,"fill all the fields");
            }
            else {
                conicon1 con1=new conicon1();
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+address+"','"+marital+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new signup2(formno);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new signup();
    }
}
