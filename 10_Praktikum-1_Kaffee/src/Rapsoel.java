
/**
 * @author raffael
 * @version 1.0
 */
public class Rapsoel extends Pflanzenoel {

	@Override
	public void braue() {
		System.out.println("braue Rapsoel");
	}

	@Override
	public void oeffneFlasche() {
		System.out.println("Öffne Plastikflasche");
	}

	@Override
	public void trinke() {
		System.out.println("Ich Trinke einen " + getClass().getSimpleName());
	}

}
