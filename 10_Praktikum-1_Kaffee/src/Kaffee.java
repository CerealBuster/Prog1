/**
 * Diese Klasse bietet die Funktionalitaet, um einen Kaffee
 * zu kochen.
 * 
 * @author tebe, Raffael
 * @version 1.0
 */
public class Kaffee extends KoffeinGetraenk {

	
	
	
	@Override
	public void braue(){
		  
		System.out.println("Braue Filterkafee");
		  
	}
	
	@Override
	public void fuegeZutatenHinzu() {
		
		System.out.println("Füge Milch und Zucker hinzu");
		
	}

	@Override
	public void trinke() {
		
		System.out.println("Ich Trinke einen " + getClass().getSimpleName());
	}

	/**
   * Bereitet einen Kaffee zu.
   */
/*Auskommentiert fuer Aufgabe 4
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
	
	System.out.println("giesse Kaffee in die Tasse");
	
}*/
/* auskommetniert fuer aufgabe 4
private void braueFilterKaffee() {
	
	System.out.println("Braue Filterkafee");
	
}*/
//Auskommentiert fuer Aufgabe 3
/*private void kocheWasser() {
    // Implementieren Sie z.B. eine Ausgabe
	System.out.println("Wasser Kochen");
  }*/

  // Weitere Methoden
}
