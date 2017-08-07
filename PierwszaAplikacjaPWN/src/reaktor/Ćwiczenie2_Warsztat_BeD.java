package reaktor;

import java.awt.event.*;
import javax.swing.*;

public class Æwiczenie2_Warsztat_BeD {

	public static void main(String[] args) {
		
	//definiowanie obiektów wystêpuj¹cych w oknie aplikacji:
		
		//definiowanie okna aplikacji
		JFrame f = new JFrame("Formularz aplikacyjny");
		
		//definiowanie etykiet
		JLabel l_imie = new JLabel("Podaj imiê");	
		JLabel l_nazwisko = new JLabel("Podaj nazwisko");
		JLabel l_stanowisko = new JLabel("Podaj oczekiwane stanowisko");
		JLabel l_mail = new JLabel("Podaj swój adres e-mail");		
		JLabel l_prog = new JLabel("Zaznacz znajomoœæ jêzyków programowania:");
		JLabel l_jezyki = new JLabel("Wybierz znajomoœæ jêzyka angielskiego:");
		JLabel l_kur = new JLabel("Wybierz rodzaj kursu:");	
		JLabel l_podsumowanie = new JLabel("Podsumowanie:");
		JLabel l_uwaga = new JLabel("Ka¿dorazowe naciœniêcie przycisku 'Potwierdz dane i wypisz' zastêpuje informacje w oknie 'Podsumowanie' na aktualnie wprowadzone");
		
		//definiowanie pola tekstowego wielolinijkowegow którym wyœwietl¹ siê wszystkie dane wprowadzone przez u¿ytkownika - pole z wynikami
		JTextArea ta_wynik = new JTextArea();
		ta_wynik.setEditable(false); //informacja, ¿e pole nie jest edytowalne przez u¿ytkownika
		
		//definiowanie pól tekstowych w których u¿ytkownik wprowadza informacje
		JTextField tf_imie = new JTextField();
		JTextField tf_nazwisko = new JTextField();
		JTextField tf_stanowisko = new JTextField();
		JTextField tf_mail = new JTextField();
		
		//definiowanie przycisków
		JButton btn_potwierdz = new JButton("Potwierdz dane i wypisz");
		JButton btn_wyjscie = new JButton("Zamknij aplikajcê");
		
		//definiowanie pól do zaznaczania wleokrotnego
		JCheckBox cb_java = new JCheckBox("Java", false);
		JCheckBox cb_python = new JCheckBox("Python", false);
		JCheckBox cb_c = new JCheckBox("C++", false);
		
		//definiowanie pól do wyboru jednego z trzech
		JRadioButton rb_podstawowy = new JRadioButton("Podstawowy");
		JRadioButton rb_sredni = new JRadioButton("Œrednio zaawansowany");
		JRadioButton rb_wysoki = new JRadioButton("Zaawansowany");
		ButtonGroup bG = new ButtonGroup(); //zgrupowanie powy¿szych pól w jedn¹ grupê, dziêki temu wybieramy jedn¹ opcjê z trzecha a nie kilka
	    bG.add(rb_podstawowy);
	    bG.add(rb_sredni);
	    bG.add(rb_wysoki);
		
	    //definiowanie pola wyboru rozwijanego
		JComboBox<String> cob_kurs = new JComboBox<String>();
		cob_kurs.addItem("Back-end Developer"); //dodawanie sk³adowych tego pola
		cob_kurs.addItem("Front-end Developer"); //dodawanie sk³adowych tego pola
				
	//rozmieszczenie obiektów wystepuj¹cych w aplikacji:
		
		//rozmieszczenie elementów po lewej stronie aplikacji
		l_imie.setBounds(20, 20, 200, 20); //etykieta
		tf_imie.setBounds(20, 60, 200, 20); //pole tekstowe
		l_nazwisko.setBounds(20, 100, 200, 20); //etykieta
		tf_nazwisko.setBounds(20, 140, 200, 20); //pole tekstowe
		l_stanowisko.setBounds(20, 180, 200, 20); //etykieta
		tf_stanowisko.setBounds(20, 220, 200, 20); //pole tekstowe
		l_mail.setBounds(20, 260, 200, 20); //etykieta
		tf_mail.setBounds(20, 300, 200, 20); //pole tekstowe
		l_uwaga.setBounds(20, 380, 800, 20);
		
		//rozmieszczenie elementów w œrodku aplikacji
		l_prog.setBounds(240, 20, 260, 20); //etykieta
		l_jezyki.setBounds(240, 140, 260, 20); //etykieta
		l_kur.setBounds(240, 260, 260,20); //etykieta
		
		//rozmieszczenie elementów po prawej stronie aplikacji
		l_podsumowanie.setBounds(520, 20, 200, 20); //etykieta
		ta_wynik.setBounds(520, 60, 300, 180); //pole wyników
		
		//rozmieszczenie przycisków
		btn_potwierdz.setBounds(20, 340, 200, 20);
		btn_wyjscie.setBounds(240, 340, 200, 20);
		
		//rozmieszczenie pól wielokrotnego wyboru
		cb_java.setBounds(240, 50, 100, 20);
		cb_python.setBounds(240, 80, 100, 20);
		cb_c.setBounds(240, 110, 100, 20);
		
		//rozmieszczenie pól jednokrotnego wyboru
		rb_podstawowy.setBounds(240, 170, 200, 20);
		rb_sredni.setBounds(240, 200, 200, 20);
		rb_wysoki.setBounds(240, 230, 200, 20);
		
		//umieszczenie pola rozwijanego
		cob_kurs.setBounds(240, 300, 200, 20);
		
	//definiowanie wygl¹du okna aplikacji
		
		//dodanie do okna aplikacji zdefiniowanych etykiet
		f.add(l_imie); f.add(l_nazwisko); f.add(l_stanowisko); f.add(l_mail); f.add(l_podsumowanie);
		f.add(l_prog); f.add(l_jezyki); f.add(l_kur); f.add(l_podsumowanie); f.add(l_uwaga);
		
		//dodanie do okna aplikacji zdefiniowanych pól tekstowych uzupe³nianych przez u¿ytkownika
		f.add(tf_imie); f.add(tf_nazwisko); f.add(tf_stanowisko); f.add(tf_mail);
		
		//dodanie do okna aplikacji zdefiniowanego pola wynikowego 
		f.add(ta_wynik);
		
		//dodanie do okna aplikacji zdefiniowanych przycisków
		f.add(btn_potwierdz); f.add(btn_wyjscie);
		
		//dodanie do okna aplikacji zdefiniowanych pól wielokrotnego wyboru
		f.add(cb_java); f.add(cb_python); f.add(cb_c);
		
		//dodanie do okna aplikacji zdefiniowanych pól jednokrotnego wyboru
		f.add(rb_podstawowy); f.add(rb_sredni); f.add(rb_wysoki);
		
		//dodanie do okna aplikacji zdefiniowanego pola rozwijanego
		f.add(cob_kurs);
		
		//wygl¹d okna aplikacji
		f.setResizable(false); //wy³¹czona mo¿liwoœæ zmiany rozmiaru okna przez u¿ytkownika
		f.setSize(850,460);
		f.setLayout(null); //brak ¿adnego layoutu
		f.setVisible(true); //w³¹czona widocznoœæ samego okna
		
	//wyœwietlanie wyników po naciœniêciu przycisku "Potwierdz dane i wypisz":
		
		btn_potwierdz.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ta_wynik.setText(null); //za ka¿dym naciœniêciem przycisku wymazywana jest zawartoœæ pola wyników i ponownie umieszczane s¹ w nim informacje aktualnie wprowadzone przez u¿ytkownika
				
				String name = tf_imie.getText(); //przechwytuje wprowadzon¹ wartoœæ przez u¿ytkownika do pola tekstowego
				String last = tf_nazwisko.getText(); //przechwytuje wprowadzon¹ wartoœæ przez u¿ytkownika do pola tekstowego
				String pos = tf_stanowisko.getText(); //przechwytuje wprowadzon¹ wartoœæ przez u¿ytkownika do pola tekstowego
				String ema = tf_mail.getText(); //przechwytuje wprowadzon¹ wartoœæ przez u¿ytkownika do pola tekstowego
				
				//sprawdza czy zaznaczone jest pole wielokrotnego wyboru, je¿eli tak to w polu z wynikami umieœci napisa "TAK"
				String cb_wynik_java = ""; 
					if (cb_java.isSelected()) {
						cb_wynik_java = "Tak";
					} else {
						cb_wynik_java = "Nie";
					}
					
				//sprawdza czy zaznaczone jest pole wielokrotnego wyboru, je¿eli tak to w polu z wynikami umieœci napisa "TAK"
				String cb_wynik_python = "";
					if (cb_python.isSelected()) 	{
						cb_wynik_python= "Tak";
					} else {
						cb_wynik_python= "Nie";
					} 
					
				//sprawdza czy zaznaczone jest pole wielokrotnego wyboru, je¿eli tak to w polu z wynikami umieœci napisa "TAK"
				String cb_wynik_c = "";
					if (cb_c.isSelected()) 	{
						cb_wynik_c = "Tak";
					} else {
						cb_wynik_c = "Nie";
					}
				
				//sprawdza które pole z pól jednokrotnego wyboru jest zaznaczone i nazwê tego pola umieœci w polu z wynikami
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
					
				//sprawdza która informacja jest wybrana z pola rozwijanego to j¹ umieœci w polu z wynikami	
				String cob_wynik = String.valueOf(cob_kurs.getSelectedItem()); 
					
				//wyœwietla informacje wprowadzone przez u¿ytkownika w polu z wynikami
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
