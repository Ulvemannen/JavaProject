//Hendelseklassen hvor generell informasjon om hendelsen skal lagres.
public class Innlegg {
	//Deklarere variabler.
	//Fredrik
	int nedbør;
	double mintemp;
	double maxtemp;
	
	//Konstruktør for Innlegg-objektet.
	public Innlegg(int n,double min,double max){
		nedbør = n;
		mintemp = min;
		maxtemp = max;
	}
	//Returnerer nedbørsmengde for objektet.
	public int getNedbør(){
		return nedbør;
	}
	//Returnerer minimumstemperaturen for objektet.
	public double getMin(){
		return mintemp;
	}
	//Returnerer makstemperatur for objektet.
	public double getMax(){
		return maxtemp;
	}
}
