
/**
 * @author raffael
 * @version 1.0
 * Abstrakte Klasse fuer Pflanzenoele
 */
/**
 * @author raffael
 *
 */
public abstract class Pflanzenoel implements Trinkbar{

	/**
	 * Mit dieser Methode wird das Getraenk zubereited 
	 */
	public final void bereiteZu() {
		oeffneFlasche();
		braue();
		giesseInsGlas();
	}
	
	/**
	 *  Abstrakte Methode fuer das brauen
	 */
	abstract public void braue();
	
	/**
	 *  Abstrakte methode fuer das Oeffnen von oelflaschen
	 */
	abstract public void oeffneFlasche();
	
	
	/**
	 * Methode zum ins Glas giessen
	 */
	protected void giesseInsGlas(){
		
		System.out.println("ins Glas giessen");
		
	}
}
