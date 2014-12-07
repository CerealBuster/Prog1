
/**
 * @author raffael
 *
 */
public abstract class KoffeinGetraenk implements Trinkbar {
	
	
	public final void bereiteZu() {
		kocheWasser();
		braue();
		giesseInTasse();
		fuegeZutatenHinzu();
	}
	
    abstract public void fuegeZutatenHinzu();

    abstract public void braue();

	protected void kocheWasser(){
		System.out.println("Wasser Kochen");
		
	}
	
	protected void giesseInTasse(){
		
		System.out.println("giesse in die Tasse");
	}
	
	
}
