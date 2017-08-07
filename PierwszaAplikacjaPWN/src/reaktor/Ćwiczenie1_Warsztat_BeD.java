package reaktor;

import java.awt.event.*;
import javax.swing.*;

public class Æwiczenie1_Warsztat_BeD {

	public static void main(String[] args) {

		JFrame f = new JFrame("Okno aplikacji");
		JLabel imie = new JLabel("Imiê");	
		JLabel nazwisko = new JLabel("Nazwisko");
		JLabel stanowisko = new JLabel("Stanowisko");
		JLabel pensja = new JLabel("Pensja");
		JLabel wynik = new JLabel();
		JTextField tfimie = new JTextField();
		JTextField tfnazwisko = new JTextField();
		JTextField tfstanowisko = new JTextField();
		JTextField tfpensja = new JTextField();
		JButton btn1 = new JButton("Wypisz");
		JButton btn2 = new JButton("Wyjdz");
		
		imie.setBounds(20, 20, 150, 20);
		tfimie.setBounds(20, 60, 150, 20);
		nazwisko.setBounds(20, 100, 150, 20);
		tfnazwisko.setBounds(20, 140, 150, 20);
		stanowisko.setBounds(20, 180, 150, 20);
		tfstanowisko.setBounds(20, 220, 150, 20);
		pensja.setBounds(20, 260, 150, 20);
		tfpensja.setBounds(20, 300, 150, 20);
		wynik.setBounds(20, 340, 500, 20);
		btn1.setBounds(20, 380, 100, 20);
		btn2.setBounds(140, 380, 100,20);
		
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				wynik.setText(null);
				String name = tfimie.getText();
				String last = tfnazwisko.getText();
				String pos = tfstanowisko.getText();
				String sal = tfpensja.getText();
				wynik.setText(name + " " + last + " (" + pos + ") " + sal + "z³");
			}
		});
		
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
		        System.exit(0);
		    }
		});
		
		f.add(imie); f.add(nazwisko); f.add(stanowisko); f.add(pensja); f.add(wynik);
		f.add(tfimie); f.add(tfnazwisko); f.add(tfstanowisko); f.add(tfpensja);
		f.add(btn1); f.add(btn2);
		f.setSize(350,480);
		f.setLayout(null);
		f.setVisible(true);
		f.setResizable(false);
		
		

	}

}
