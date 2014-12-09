
public class Olivenoel extends Pflanzenoel{

	@Override
	public void braue() {
		
		System.out.println("braue Olivenoel");
	}

	@Override
	public void oeffneFlasche() {
		
		System.out.println("Öffne Glasflasche");
	}

	@Override
	public void trinke() {
		
		System.out.println("Ich Trinke einen " + getClass().getSimpleName());
	}

}
