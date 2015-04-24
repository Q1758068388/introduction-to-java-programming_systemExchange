import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Scanner;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;


	public class SystemExchange  extends JFrame{
	private JTextField text1= new JTextField ();
	private JTextField text2 = new JTextField ();
	private JTextField text3 = new JTextField ();
	private JButton button= new JButton("转换");
	private JLabel label =new JLabel();
	public SystemExchange(){
	
		JPanel p1 =new JPanel(new GridLayout(3,2));
		p1.add(new JLabel("进制:"));
		p1.add(text1);
		p1.add(new JLabel("输入的数"));
	    p1.add(text2);
	    p1.add(button);
	    p1.add(text3);
	    add(p1);
	
	    button.addActionListener(new ButtonListener());
	   }
	private class  ButtonListener implements ActionListener{
		
	         public void actionPerformed(ActionEvent arg0) {
	        int jinzhi = Integer.parseInt(text1.getText());
			int num = Integer.parseInt(text2.getText());
			exchange excange1= new exchange(jinzhi,num);
			text3.setText(excange1.display());
		}
		
	}
	
public static void main (String [] args ){
	
		       SystemExchange frame = new SystemExchange();
		       frame.setTitle("进制转换");
		       frame.setSize(200, 125);
		       frame.setLocationRelativeTo(null);
		       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		       frame.setVisible(true);
		       

   }
}
