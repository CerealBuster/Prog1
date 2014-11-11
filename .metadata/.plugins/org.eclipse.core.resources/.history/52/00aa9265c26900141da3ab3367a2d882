/**
 * Diese Klasse verarbeitet Befehle vom Typ
 * {@link Befehl Befehl} und lösst die dazu 
 * passenden Aktionen aus.
 * 
 * @author tebe
 *
 */
public class Kontroller {
	/**
	 * Verarbeite einen gegebenen Befehl
	 * 
	 * @param befehl
	 *            Der zu verarbeitende Befehl.
	 * @return 'false', wenn ein Abbruchbefehl verarbeitet wurde
	 */
	
	Befehlswort befehl;
	
	public boolean verarbeiteBefehl(Befehl befehl) {
		boolean macheWeiter = true;
		String befehlswort = befehl.gibBefehlswort();
		if (Befehlswort.gibBefehlswort(befehlswort) != Befehlswort.UNBEKANNT) {
			

			if (befehlswort.equalsIgnoreCase(Befehlswort.GEHE.getBefehl())) {
				System.out.println("Befehl GEHE " + befehl.gibZweitesWort() + " wird ausgefuehrt");
			} else if (befehlswort.equalsIgnoreCase(Befehlswort.HILFE.getBefehl())){
				System.out.println("Gueltige Befehle: "
						+ Befehlswort.gibBefehlsworteAlsText());
			} else if (befehlswort.equalsIgnoreCase(Befehlswort.BEENDEN.toString())) {
				System.out.println("Befehl BEENDEN wird ausgefuehrt.");
				macheWeiter = false;
			} else {
				System.out.println("Befehlswort ohne zugehoerige Aktion: Abbruch.");
				macheWeiter = false;
			}
		} else {
			System.out.println("Ich weiss nicht, was Sie meinen...");
		}
		return macheWeiter;
	}
}
