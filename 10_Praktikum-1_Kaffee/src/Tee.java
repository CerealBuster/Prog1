/**
 * Diese Klasse bietet die Funktionalitaet, um einen Tee
 * zu kochen.
 * 
 * @author tebe
 */
public class Tee extends KoffeinGetraenk {

  /**
   * Bereitet einen Tee zu.
   */
 /*Auskommentiert fuer Aufgabe 4
	public void bereiteZu() {
    kocheWasser();
    taucheTeebeutel();
    giesseInTasse();
    fuegeZitroneHinzu();
  }*/

  private void fuegeZitroneHinzu() {
	// TODO Auto-generated method stub
	System.out.println("füge die Zitrone hinzu");
}
  public void braue(){
	  
	  
	  System.out.println("Tauche Teebeutel ins Wasser");
  }
  
  public void fuegeZutatenHinzu() {
  	// TODO Auto-generated method stub
	  System.out.println("füge die Zitrone hinzu");
  }
@Override
public void trinke() {
	// TODO Auto-generated method stub
	System.out.println("Ich Trinke einen " + getClass().getSimpleName());	
}

 //Auskommentiert fuer Aufgabe 3
/*private void giesseInTasse() {
	// TODO Auto-generated method stub
	System.out.println("giesse Wasser in die Tasse");
}*/

/* Auskommentiert fuer Aufabe 4
  private void taucheTeebeutel() {
	// TODO Auto-generated method stub
	System.out.println("Teabaging");
}*/
//Auskommentiert fuer aufgabe 3
/*private void kocheWasser() {
    // Implementieren Sie z.B. eine Ausgabe
	System.out.println("Wasser Kochen");
  }*/

  // Weitere Metoden
}
