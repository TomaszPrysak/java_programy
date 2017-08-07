package reaktor;

import javax.swing.*;

public class App1 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		JButton btn = new JButton("click");
		btn.setBounds(50,50,200,30);
		f.add(btn);
		f.setSize(300,400);
		f.setLayout(null);
		f.setVisible(true);
				
	}

}
