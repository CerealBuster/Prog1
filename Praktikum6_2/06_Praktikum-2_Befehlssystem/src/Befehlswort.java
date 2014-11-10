
/**
 * Diese Klasse haelt eine Aufzaehlung der akzeptierten Befehlswoerter.
 * Mit ihrer Hilfe werden eingetippte Befehle erkannt.
 *
 * @author  tebe
 * @version 1.0
 */



public enum Befehlswort {

	UNBEKANNT("?") ,GEHE("gehe"), HILFE("hilfe"), BEENDEN("beenden");
	
	private String befehl;

	public  String getBefehl() {
		return befehl;
	}
	/**
	 * Konstruktor - initialisiere die Befehlswörter.
	 */
	private Befehlswort(String befehl)
	{
		// tut momentan nichts
		this.befehl = befehl;
	}
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
	  


	public static String gibBefehlsworteAlsText(){
		String gueltigeBefehle = "";
		Befehlswort[] werte = Befehlswort.values();
		for (Befehlswort item : werte){
			gueltigeBefehle += item + " ";
			
		}
		return gueltigeBefehle;
	}	
}
