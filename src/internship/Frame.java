
package internship;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Frame implements ActionListener {
	JButton b,b1,b2,b3; 
	JTextField t1,t2;
	JCheckBox check1 , check2; 
	JComboBox cb;
	File file;
	JFileChooser fileChooser;
	String str1,str2;
	Frame()
		{
		///TextFIELDS
	JFrame f = new JFrame("Generete JSON schema doc");
	t1 = new JTextField("JSON schema Path");
	t1.setHorizontalAlignment(JTextField.CENTER);
	t1.setBounds(90,50, 220 ,30);
	t2 = new JTextField("Output Path");
	t2.setHorizontalAlignment(JTextField.CENTER);
	t2.setBounds(90,120 ,220,30);
	
	
	/// comboBox
	String i[]= {"Text" , "HTML", "JSON"};
	cb = new JComboBox(i);
	cb.setBounds(90 , 85, 90,20);
	
	///Checkbox
	check1 = new JCheckBox("Only required content");
	check1.setBounds(90 , 150 , 150 ,30);
	check2 = new JCheckBox("Include Examples");
	check2.setBounds(90 , 175 ,150 , 30 );
	
	///Buttons
	b = new JButton("Browse");
	b.addActionListener(this);
	b.setBounds(350, 50, 90, 30);

	b1 = new JButton("Browse");
	b1.addActionListener(this);
	b1.setBounds(350, 120, 90, 30);
	
	
	b2 = new JButton("Generate");
	b2.setBounds(100, 220, 90 ,30);
	b3 = new JButton("Cancel");
	b3.setBounds(200, 220, 90, 30);

	
	
	f.add(b);
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(t1);
	f.add(t2);
	f.add(cb);
	f.add(check1);
	f.add(check2);
	f.setSize(500, 350);
	f.setLayout(null);
	f.setVisible(true);
	f.setResizable(false);
	
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
	
		
		
	
