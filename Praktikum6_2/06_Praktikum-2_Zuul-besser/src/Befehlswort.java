
/**
 * Diese Klasse haelt eine Aufzaehlung der akzeptierten Befehlswoerter.
 * Mit ihrer Hilfe werden eingetippte Befehle erkannt.
 *
 * @author  Raffael
 * @version 2.0
 */



/**
 * @author Raffael
 *
 */
/**
 * @author Raffael
 *
 */
public enum Befehlswort {
	//Enum Konstanten
	UNBEKANNT("?") ,GEHE("gehe"), HILFE("hilfe"), BEENDEN("beenden"), 
	UMSEHEN("umsehen"), UEBERNIMM("uebernimm"), NIMM("nimm");
	
	private String befehl;


	/**
	 * Konstruktor - initialisiere die Befehlswoerter
	 */
	private Befehlswort(String befehl)
	{
		
		this.befehl = befehl;
	}
	
	
	/**
	 * Diese Methode gibt das Befehlswort zurueckt
	 * @param wort
	 * @return befehlswort Befehlswort
	 */
	public static Befehlswort gibBefehlswort(String wort){
		
		try {
			return valueOf(wort.toUpperCase());
		} catch (Exception e) {
			
			return UNBEKANNT;
		}
		
		/*
		if (wort.equalsIgnoreCase(GEHE.befehl)){
			return GEHE;
		}
		else if (wort.equalsIgnoreCase(BEENDEN.befehl)){
			return BEENDEN;
		}
		else if(wort.equalsIgnoreCase(HILFE.befehl)){
			
			return HILFE;
		}
		else{
		
			return UNBEKANNT;
		}*/

	}	
	  


	/**
	 * Diese Methode gibt die gueltigen Befehlswoerter als Text zurueck
	 * @return String mit den gueltigen Befehlswoertern
	 */
	public static String gibBefehlsworteAlsText(){
		String gueltigeBefehle = "";
		Befehlswort[] werte = Befehlswort.values();
		for (Befehlswort item : werte){
			if(item != UNBEKANNT){
				gueltigeBefehle += item + " ";
			}
			
			
		}
		return gueltigeBefehle;
	}
	
	
	/**
	 * Diese Methode gibt das Befehlswort zurueck
	 * @return befehlswort String
	 */
	public  String getBefehl() {
		return befehl;
	}
}
