package reaktor;

import java.awt.event.*;
import javax.swing.*;

public class TestZWarsztatów {

	public static void main(String[] args) {
		
		//definiowanie obiektów wystêpuj¹cych w oknie aplikacji:
		
		JFrame f = new JFrame("Formularz aplikacyjny");
		
		JLabel l_imie = new JLabel("Podaj imiê");	
		JLabel l_nazwisko = new JLabel("Podaj nazwisko");
		JLabel l_stanowisko = new JLabel("Podaj oczekiwane stanowisko");
		JLabel l_mail = new JLabel("Podaj swój adres e-mail");		
		JLabel l_prog = new JLabel("Zaznacz znajomoœæ jêzyków programowania:");
		JLabel l_jezyki = new JLabel("Wybierz znajomoœæ jêzyka angielskiego:");
		JLabel l_kur = new JLabel("Wybierz rodzaj kursu:");	
		JLabel l_podsumowanie = new JLabel("Podsumowanie:");
		
		JTextArea ta_wynik = new JTextArea();
		ta_wynik.setEditable(false);
		
		JTextField tf_imie = new JTextField();
		JTextField tf_nazwisko = new JTextField();
		JTextField tf_stanowisko = new JTextField();
		JTextField tf_mail = new JTextField();
		
		JButton btn_potwierdz = new JButton("Potwierdz dane i wypisz");
		JButton btn_wyjscie = new JButton("Zamknij aplikajcê");
		
		JCheckBox cb_java = new JCheckBox("Java", false);
		JCheckBox cb_python = new JCheckBox("Python", false);
		JCheckBox cb_c = new JCheckBox("C++", false);
		
		JRadioButton rb_podstawowy = new JRadioButton("Podstawowy");
		JRadioButton rb_sredni = new JRadioButton("Œrednio zaawansowany");
		JRadioButton rb_wysoki = new JRadioButton("Zaawansowany");
		
		ButtonGroup bG = new ButtonGroup();
	    bG.add(rb_podstawowy);
	    bG.add(rb_sredni);
	    bG.add(rb_wysoki);
		
		JComboBox<String> cob_kurs = new JComboBox<String>();
		cob_kurs.addItem("Back-end Developer"); cob_kurs.addItem("Front-end Developer");
				
		//rozmieszczenie obiektów wystepuj¹cych w aplikacji:
		
		l_imie.setBounds(20, 20, 200, 20);
		tf_imie.setBounds(20, 60, 200, 20);
		l_nazwisko.setBounds(20, 100, 200, 20);
		tf_nazwisko.setBounds(20, 140, 200, 20);
		l_stanowisko.setBounds(20, 180, 200, 20);
		tf_stanowisko.setBounds(20, 220, 200, 20);
		l_mail.setBounds(20, 260, 200, 20);
		tf_mail.setBounds(20, 300, 200, 20);
		
		l_prog.setBounds(240, 20, 260, 20);
		l_jezyki.setBounds(240, 140, 260, 20);
		l_kur.setBounds(240, 260, 260,20);
		
		l_podsumowanie.setBounds(520, 20, 200, 20);
		
		ta_wynik.setBounds(520, 60, 300, 180);
		
		btn_potwierdz.setBounds(20, 340, 200, 20);
		btn_wyjscie.setBounds(240, 340, 200, 20);
		
		cb_java.setBounds(240, 50, 100, 20);
		cb_python.setBounds(240, 80, 100, 20);
		cb_c.setBounds(240, 110, 100, 20);
		
		rb_podstawowy.setBounds(240, 170, 200, 20);
		rb_sredni.setBounds(240, 200, 200, 20);
		rb_wysoki.setBounds(240, 230, 200, 20);
		
		cob_kurs.setBounds(240, 300, 200, 20);
		
		//definiowanie okna aplikacji
		
		f.add(l_imie); f.add(l_nazwisko); f.add(l_stanowisko); f.add(l_mail); f.add(l_podsumowanie);
		f.add(l_prog); f.add(l_jezyki); f.add(l_kur); f.add(l_podsumowanie);
		
		f.add(tf_imie); f.add(tf_nazwisko); f.add(tf_stanowisko); f.add(tf_mail);
		
		f.add(ta_wynik);
		
		f.add(btn_potwierdz); f.add(btn_wyjscie);
		
		f.add(cb_java); f.add(cb_python); f.add(cb_c);
		
		f.add(rb_podstawowy); f.add(rb_sredni); f.add(rb_wysoki);
		
		f.add(cob_kurs);
		
		f.setResizable(false);
		f.setSize(850,420);
		f.setLayout(null);
		f.setVisible(true);
		
		//wyœwietlanie wyników po naciœniêciu przycisku "Potwierdz dane i wypisz... na razie w jednolinijkowym polu:
		
		btn_potwierdz.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ta_wynik.setText(null);
				
				String name = tf_imie.getText();
				String last = tf_nazwisko.getText();
				String pos = tf_stanowisko.getText();
				String ema = tf_mail.getText();
				
				String cb_wynik_java = "";
					if (cb_java.isSelected()) {
						cb_wynik_java = "Tak";
					} else {
						cb_wynik_java = "Nie";
					}
				String cb_wynik_python = "";
					if (cb_python.isSelected()) 	{
						cb_wynik_python= "Tak";
					} else {
						cb_wynik_python= "Nie";
					}
				String cb_wynik_c = "";
					if (cb_c.isSelected()) 	{
						cb_wynik_c = "Tak";
					} else {
						cb_wynik_c = "Nie";
					}
				
				String rb_wynik = "";
					if (rb_podstawowy.isSelected()) {
						rb_wynik = rb_podstawowy.getText();
					}
					if (rb_sredni.isSelected()) 	{
						rb_wynik= rb_sredni.getText();
					}
					if (rb_wysoki.isSelected()) 	{
						rb_wynik = rb_wysoki.getText();
					}
					
					String cob_wynik = String.valueOf(cob_kurs.getSelectedItem());
					
				ta_wynik.append("Dane kontaktowe:\n" + name + " " + last + " (" + pos + ") " + ema + "\n" + "\n" + "Informacje zawodowe:\n" + "Java: " + cb_wynik_java + "\n" + "Python: " + cb_wynik_python + "\n" + "C++: " + cb_wynik_c + "\n" + "Angielski: " + rb_wynik + "\n" + "\n" + "Zainteresowanie kursem: " + "\n" + cob_wynik + "\n");
			}
		});
		
		//wyjœcie z programu po naciœniêciu przycisku "Wyjœcie"
		
		btn_wyjscie.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
		        System.exit(0);
		    }
		});	

	}

}
