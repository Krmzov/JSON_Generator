
package internship;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Frame implements ActionListener {
	JButton b,b1 ; 
	JTextField t1,t2;
	JRadioButton r,r1,r2,r3,r4;
	File file;
	JFileChooser fileChooser;
	String str1,str2;
	Frame()
		{
	JFrame f = new JFrame("Generete JSON schema doc");
	t1 = new JTextField("JSON schema Path");
	t1.setHorizontalAlignment(JTextField.CENTER);
	t1.setBounds(90,50, 220 ,30);
	t2 = new JTextField("Output Path");
	t2.setHorizontalAlignment(JTextField.CENTER);
	t2.setBounds(90,120 ,220,30);
	
	b = new JButton("Browse");
	b.addActionListener(this);
	b.setBounds(350, 50, 90, 30);
	b.setHorizontalAlignment(JButton.CENTER);
	
	b1 = new JButton("Browse");
	b1.addActionListener(this);
	b1.setBounds(350, 120, 90, 30);
	b1.setHorizontalAlignment(JButton.CENTER);

	
	 r = new JRadioButton("Text");
	 r1 = new JRadioButton("JSON");
	 r2 = new JRadioButton("HTML");
	 r3 = new JRadioButton("Only Req Content");
	 r4 = new JRadioButton("Include Examples");
	
	
	r.setBounds(110, 80, 50, 30);
	r1.setBounds(165, 80, 60,30 );
	r2.setBounds(230 , 80, 60, 30);
	r3.setBounds(90, 150, 130, 30);
	r4.setBounds(220, 150, 130, 30);
	
	f.add(r);
	f.add(r1);
	f.add(r2);
	f.add(r3);
	f.add(r4);
	f.add(b);
	f.add(b1);
	f.add(t1);
	f.add(t2);
	
	f.setSize(500, 400);
	f.setLayout(null);
	f.setVisible(true);
	
 }
		public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
				 fileChooser = new JFileChooser();
				
				int IN = fileChooser.showOpenDialog(null);
				
				
				if(IN == JFileChooser.APPROVE_OPTION) {
					file = new File(fileChooser.getSelectedFile().getAbsolutePath());
					str1 = file.getAbsolutePath();
					t1.setText(str1);
					
				 }
				 
				}
		 		else if (e.getSource() == b1 ) {
				 fileChooser = new JFileChooser();
				 int OUT = fileChooser.showSaveDialog(null);
				 
				 if(OUT == JFileChooser.APPROVE_OPTION) {
					 file = new File(fileChooser.getSelectedFile().getAbsolutePath());
					 str1 = file.getAbsolutePath();
						t2.setText(str1);
				}	
		 
			 }
			 }
		 }
	
		
		
	
