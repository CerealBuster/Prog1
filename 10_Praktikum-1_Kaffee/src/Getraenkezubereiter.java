import java.util.ArrayList;


/**
 * @author raffael  
 * @version 1.0
 * 
 *
 */
/**
 * @author raffael
 *
 */
public class Getraenkezubereiter {
	//Variabelndeklarationen
	private Kaffee kaffeeObject;
	private Tee teeObject;
	private Rapsoel rapsoelObject;
	private Olivenoel olivenOelObject;
	private ArrayList<KoffeinGetraenk> kaffeeUndTee;
	private ArrayList<Pflanzenoel>olivenUndRapsoel;

	/**
	 * Konstruktor der Klasse Getraenkezubereiter 
	 */
	public Getraenkezubereiter(){
		kaffeeUndTee = new ArrayList<KoffeinGetraenk>();
		olivenUndRapsoel = new ArrayList<Pflanzenoel>();
		
	}
	
	/**
	 * Diese Methode generiert eine Liste mit 10 Koffeinhaltigen Objekten
	 * @return Liste von Koffeinhaltigen getraenke ArrayList
	 */
	private ArrayList<KoffeinGetraenk> createCoffeinList(){
		for(int i = 0; i < 10; i+=2){
			kaffeeObject = new Kaffee();
			teeObject = new Tee();
			this.kaffeeUndTee.add(kaffeeObject);
			this.kaffeeUndTee.add(teeObject);
			
		}
		
		return this.kaffeeUndTee;
	}
	/**
	 * Diese Methode generiert eine Liste mit 10 pflanzenoelhaltigen Objekten
	 * @return Liste von oelhaltigen Getraenken ArrayList
	 */
	private ArrayList<Pflanzenoel> createOelList(){
		
		for(int i = 0; i < 10; i+=2){
			olivenOelObject = new Olivenoel();
			rapsoelObject = new Rapsoel();
			this.olivenUndRapsoel.add(olivenOelObject);
			this.olivenUndRapsoel.add(rapsoelObject);
			
		}
		return this.olivenUndRapsoel;
	}
	/**
	 * Diese Methode bereited das getraenk zu
	 */
	private void bereiteGetraenkZu(){
		for(KoffeinGetraenk element:kaffeeUndTee){
			element.bereiteZu();
			element.trinke();
			System.out.println("");
			
		}
		for(Pflanzenoel element:olivenUndRapsoel){
			
			element.bereiteZu();
			element.trinke();
			System.out.println("");
		}
		
		
	}
	
	/**
	 * Mainmethode 
	 * @param args
	 */
	public static void main(String args[]){
	
		Getraenkezubereiter brewery = new Getraenkezubereiter();
		Getraenkezubereiter oddBrewery = new Getraenkezubereiter();
		brewery.createCoffeinList();
		brewery.bereiteGetraenkZu();
		
		oddBrewery.createOelList();
		oddBrewery.bereiteGetraenkZu();
		
	
	}
	

}

