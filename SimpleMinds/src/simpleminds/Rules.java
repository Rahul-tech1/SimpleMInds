package simpleminds;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
	
	JButton b1, b2;
Rules(String username){
	
	setBounds(600, 200, 800, 650);
	getContentPane().setBackground(Color.WHITE);
	JLabel l1=new JLabel("Welcome " + username +  " to Simple Minds");
	l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
	l1.setForeground(new Color(30, 144, 255));
	setLayout(null);
	l1.setBounds(50, 50, 700, 30);
	add(l1);
	
	
	
	JLabel l2 = new JLabel("");
	l2.setBounds(20, 90, 600, 350);
	l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
	//l2.setForeground(new Color(30, 144, 255));
	l2.setText("<html>" +
	
"(1) The Government, as the supreme executive body, takes decisions pursuant to and within the limits of laws in respect of fundamental matters of national significance, unless such decision-making is in the competence of ministries, other central state administration authorities or their subordinate bodies." + "<br><br>"+

"(2) As a general rule	, the Government adopts decisions on the basis of written materials presented to it by a member of the Government, and in exceptional cases on the basis of oral information from a member of the Government in urgent matters." + "<br><br>"+

"(3) The Government’s decisions are issued in the form of Government Resolutions. Government Resolutions are binding upon all members of the Government, ministries, other central state administration authorities, other administrative bodies and further entities where thus provided by a separate law.);" + "<br><br>"+
"</html>");
	add(l2);
	
	
	
	b1=new JButton("Back");
	b1.setBounds(250, 500, 100, 30);
	b1.setBackground(new Color(30, 144, 254));
	b1.setForeground(Color.WHITE);
	b1.addActionListener(this);
	add(b1);
	
	
	b2=new JButton("Start");
	b2.setBounds(450, 500, 100, 30);
	b2.setBackground(new Color(30, 144, 254));
	b2.setForeground(Color.WHITE);
	b2.addActionListener(this);

	add(b2);
	
	
	setVisible(true);
}


public static void main(String arg[]) {
	
	new Rules("");
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
if(e.getSource()==b1)
{
this.setVisible(false);
new SimpleMinds().setVisible(true);
	
} 

else if(e.getSource()==b2) {
	System.exit(0);
}
}
}
