/**
 * Diese Klasse bietet die Funktionalitaet, um einen Kaffee
 * zu kochen.
 * 
 * @author tebe
 */
public class Kaffee extends KoffeinGetraenk {

	public void braue(){
		  
		System.out.println("Braue Filterkafee");
		  
	}
	
	public void fuegeZutatenHinzu() {
		// TODO Auto-generated method stub
		System.out.println("Füge Milch und Zucker hinzu");
		
	}

	@Override
	public void trinke() {
		// TODO Auto-generated method stub
		System.out.println("Ich Trinke einen " + getClass().getSimpleName());
	}

	/**
   * Bereitet einen Kaffee zu.
   */
/*Aukommentiert fuer Aufgabe 4
  public void bereiteZu() {
    kocheWasser();
    braueFilterKaffee();
    giesseInTasse();
    fuegeZuckerUndMilchHinzu();
  }*/
/*auskommentiert fuer Aufgabe 4
  private void fuegeZuckerUndMilchHinzu() {
	// TODO Auto-generated method stub
	  System.out.println("Füge milch und zuchinzu");
	
}*/


//Audkommentiert fuer Aufgabe 3
/*private void giesseInTasse() {
	// TODO Auto-generated method stub
	System.out.println("giesse Kaffee in die Tasse");
	
}*/
/* auskommetniert fuer aufgabe 4
private void braueFilterKaffee() {
	// TODO Auto-generated method stub
	System.out.println("Braue Filterkafee");
	
}*/
//Auskommentiert fuer Aufgabe 3
/*private void kocheWasser() {
    // Implementieren Sie z.B. eine Ausgabe
	System.out.println("Wasser Kochen");
  }*/

  // Weitere Methoden
}
