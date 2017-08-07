package reaktor;

import java.awt.event.*;
import javax.swing.*;


public class App2 {

	public static void main(String[] args) {

		JFrame f = new JFrame("App2");
		JButton btn = new JButton("show");
		JTextField tf = new JTextField();
		
		tf.setBounds(50, 50, 400, 30);
		btn.setBounds(50, 150, 100, 30);

		f.add(tf);
		f.add(btn);
		f.setSize(500,300);
		f.setLayout(null);
		f.setVisible(true);
		
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String name = tf.getText();
				tf.setText("Siemandero "+ name +" na warsztatach BackEndDeveloper");
			}
		});

	}

}
