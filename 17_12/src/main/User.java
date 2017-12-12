package main;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class User {
	private String imie;
	private String nazwisko;
	private Address adres;
	private String telefon;
	private String VISA;
	private String pesel;
	private Calendar dataUrodzenia;
	private Sex sex;
	
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public Address getAdres() {
		return adres;
	}
	public void setAdres(Address adres) {
		this.adres = adres;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getVISA() {
		return VISA;
	}
	public void setVISA(String vISA) {
		VISA = vISA;
	}
	public String getPesel() {
		return pesel;
	}
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	public Calendar getDataUrodzenia() {
		return dataUrodzenia;
	}
	public void setDataUrodzenia(Calendar dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}
	
	public User(String imie, String nazwisko, Address adres, String telefon, String vISA, String pesel,
			Calendar dataUrodzenia) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.adres = adres;
		this.telefon = telefon;
		VISA = vISA;
		this.pesel = pesel;
		this.dataUrodzenia = dataUrodzenia;
	}
	
	/* nie tworzymy konstruktora bezparametrowaego, ze wzgledu na ilosc zaleznosci od peselu - musieli bysmy zbyt wiele metod powtorzyc w seterach dla poszczegolnych pol */
	public User(String pesel) throws FileNotFoundException {
		this.pesel = pesel;
		String[] arr = pesel.split("");
		int year = 1900 + Integer.parseInt(arr[0] + arr[1]);
		int month = Integer.parseInt(arr[2] + arr[3]);
		int day = Integer.parseInt(arr[4] + arr[5]);
		this.dataUrodzenia = Calendar.getInstance();
		this.dataUrodzenia.set(Calendar.DAY_OF_MONTH, day);
		this.dataUrodzenia.set(Calendar.MONTH, month);
		this.dataUrodzenia.set(Calendar.YEAR, year);
		int sex = Integer.parseInt(pesel.charAt(9) + "");
		String nameFile = "";
		if(sex % 2 == 0) {
			this.sex = Sex.FEMALE;
			nameFile = "im_f.txt";
		} else {
			this.sex = Sex.MALE;
			nameFile = "im_m.txt";
		}
		Helper h = new Helper();
		Random r = new Random();
		int line = h.countLines(nameFile);
		int randomImieLine = r.nextInt(line) + 1;
		this.imie = h.getRecordByLineNumber(nameFile, randomImieLine);
		int nazwiskaAllLines = h.countLines("nazwiska.txt");
		this.nazwisko = h.getRecordByLineNumber("nazwiska.txt", r.nextInt(nazwiskaAllLines) + 1);
		
		this.adres = new Address();
		
	}
	
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "User [imie=" + imie + ", nazwisko=" + nazwisko + ", adres=[" + adres.getCity() + ", " +adres.getStreet() + "], telefon=" + telefon + ", VISA="
				+ VISA + ", pesel=" + pesel + ", dataUrodzenia=" + dataUrodzenia + ", sex=" + sex + "]";
	}
	
	
	
}
