
/**
 * @author raffael
 * @version 1.0
 */
public abstract class KoffeinGetraenk implements Trinkbar {
	
	
	public final void bereiteZu() {
		kocheWasser();
		braue();
		giesseInTasse();
		fuegeZutatenHinzu();
	}
	
    /**
     * Abstrakte Methode fuer das Hinzufuegen von Zutaten 
     */
    abstract public void fuegeZutatenHinzu();

    /**
     * Abstrakte Methode fuers Brauen 
     */
    abstract public void braue();

	/**
	 * Methode um das Wasser kochen zu lassen. 
	 */
	protected void kocheWasser(){
		System.out.println("Wasser Kochen");
		
	}
	
	/**
	 * Mit dieser Methode giessen wir das Getraenk in eine Tasse 
	 */
	protected void giesseInTasse(){
		
		System.out.println("giesse in die Tasse");
	}
	
	
}
