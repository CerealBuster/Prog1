
/**
 * @author raffael
 *
 */
public abstract class Pflanzenoel implements Trinkbar{

	public final void bereiteZu() {
		oeffneFlasche();
		braue();
		giesseInsGlas();
	}
	
	abstract public void braue();
	
	abstract public void oeffneFlasche();
	
	protected void giesseInsGlas(){
		
		System.out.println("ins Glas giessen");
		
	}
}
