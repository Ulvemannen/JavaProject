//Hendelseklassen hvor generell informasjon om hendelsen skal lagres.
public class Innlegg {
	//Deklarere variabler.
	//Fredrik
	int nedb�r;
	double mintemp;
	double maxtemp;
	
	//Konstrukt�r for Innlegg-objektet.
	public Innlegg(int n,double min,double max){
		nedb�r = n;
		mintemp = min;
		maxtemp = max;
	}
	//Returnerer nedb�rsmengde for objektet.
	public int getNedb�r(){
		return nedb�r;
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
