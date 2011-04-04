//Importerer de nødvendige klassene.
import java.util.*;

@SuppressWarnings("rawtypes")
public class Register {
	//Deklarer de nødvendige samlingene.
	HashMap<String,HashMap> norge;
	HashMap<String,ArrayList> akershus,vestfold;
	//Akershus
	ArrayList<Innlegg> nesodden,ski;
	//Vestfold
	ArrayList<Innlegg> tjøme,nøtterøy;
	
	public Register(){
	/**Konstruktør for registeret. 
	 * Oppretter Norge-samlingen og starter metoder 
	 * for å oppretter fylker og kommuner.
	 */
		norge = new HashMap<String,HashMap>();
		LeggtilFylker();
		LeggtilKommuner();
	}
	private void LeggtilFylker(){
		//Oppretter fylker og legger dem til Norge.
		//19 Fylker
		norge.put("akershus", akershus = new HashMap<String,ArrayList>());
		norge.put("vestfold", vestfold = new HashMap<String,ArrayList>());
	}
	private void LeggtilKommuner(){
		/**Oppretter kommuner og legger dem til fylker.
		 * 
		 */
		//Legger til akershus-kommuner
		//20 kommuner.
		akershus.put("nesodden", new ArrayList<Innlegg>());
		akershus.put("ski", new ArrayList<Innlegg>());
		
		//Legger til vestfold-kommuner
		//20 kommuner.
		vestfold.put("tjøme", new ArrayList<Innlegg>());
		vestfold.put("nøtterøy", new ArrayList<Innlegg>());
	}
	public void LeggtilInnlegg(String f,String k,Innlegg post){
		/**Legger inn innlegg-objektet inn i fylket-kommunen 
		 * det hører til.
		 */
		
		//Sjekker om Norge inneholder fylket
		if(norge.containsKey(f)){
			@SuppressWarnings("unchecked")
			HashMap<String,ArrayList> fylke = norge.get(f);
			//sjekker om fylket inneholder kommunen.
			if(fylke.containsKey(k)){
				@SuppressWarnings("unchecked")
				ArrayList<Innlegg> kommune = fylke.get(k);
				kommune.add(post);
			}	
		}
	}
	public int totalnedbørGjennomsnitt(){
		//returnerer total nedbørs mengde.
		int sum = 0;
		return sum;
	}
	private HashMap returnerFylket(String f, String k){
		return new HashMap();
	}
	public int fylkeNedbørGjennomSnitt(String f){
		/**Returnerer det innkommende fylkets gjennomsnittnedbørsmengde.
		 * 
		 */
		int sum = 0;
		int antall = 0;
		if(norge.containsKey(f)){
			@SuppressWarnings("unchecked")
			HashMap<String,ArrayList> fylke = norge.get(f);
			fylke
		}
			
		return (sum/antall);
	}
	public int norgeNedbørGjennomsnittSnitt(){
		/**Returnerer Norge sin gjennomsnittnedbørsmengde.
		 * 
		 */
		int sum = 0;
		
		return sum;
	}
	private ArrayList returnerKommune(String f,String k){
		/**Metode som returnerer den innkommende kommunen 
		 * i form av ett ArrayList objekt.Praktisk med 
		 * tanke på gjennbruk av kode.
		 */
		//Sjekker Norge inneholder fylket..
		if(norge.containsKey(f)){
			@SuppressWarnings("unchecked")
			
			//Lager fylkeobjekt hvis den fant det.
			HashMap<String,ArrayList> fylke = norge.get(f);
			
			//Sjekker om fylket inneholder kommunen.
			if(fylke.containsKey(k)){
				@SuppressWarnings("unchecked")
				
				//Lager kommuneobjektet hvis den fant det.
				ArrayList<Innlegg> kommune = fylke.get(k);
				//Returnerer kommunen i form at ett ArrayList-objekt
				return kommune;
			}	
		}
		return new ArrayList();
	}
	public int kommunenedbørGjennomsnitt(String f,String k){
		/**Metode som returnerer den innkommende metoden sin 
		 * gjennomsnittsnedbørsmengde.
		 */
		
		//Henter ett ArrayList-kommuneobjekt.
		ArrayList kommune = returnerKommune(f,k);
		//Deklarer nødvendige sum og tellevariabler for kommunesnittet.
		int sum = 0;
		int antall = 0;
		//Løper igjennom alle innleggene i kommunen, og legger til nedbørsverdier.
		for(Object e:kommune){
			sum +=((Innlegg) e).getNedbør();
			++antall;
		}
		//Returnerer sum nedbør delt på antall innlegg.
		return (sum/antall);
	}
}