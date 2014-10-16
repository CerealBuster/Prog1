import java.util.ArrayList;
import java.util.Iterator;



/**
 * Bietet Funktionalitaeten zum Speichern von Pruefungsergebnissen von einer
 * Vielzahl von Studenten. Aus den gespeicherten Ergebnissen lassen sich
 * personalisierte Antworttext generieren.
 */
public class Pruefungsverwaltung {

  private Pruefungsergebnis pruefung;
  
  private ArrayList<Pruefungsergebnis> ergebnisse;
  private Iterator<Pruefungsergebnis> iterator;
  
  public Pruefungsverwaltung(){
	  
	  this.ergebnisse = new ArrayList<Pruefungsergebnis>();
	  //this.iterator = ergebnisse.iterator();
  }
  /**
   * Speichert ein Pruefungsergebnis.
   * 
   * @param ergebnis Das Pruefungsergebnis.
   */
  public void speichereErgebnis(Pruefungsergebnis ergebnis) {
    // TODO Implementieren gemaess Aufgabenstellung�
	  this.ergebnisse.add(ergebnis);
  }

  /**
   * Gibt pro gespeichert Ergebnis einen Text auf die Konsole aus.
   * Je nachdem ob der Kandidate die Pruefung bestanden (>= 4.0) oder nicht
   * bestanden (< 4.0) hat, wird ein Text in folgendem Format ausgegeben:
   * 
   * Sie haben an der Pruefung eine 3.0 erzielt und 
   * sind somit durchgefallen!
   * 
   * Herzliche Gratulation Max Muster! Sie haben an der Pruefung eine 4.5
   * erzielt und somit bestanden!
   */
  public void druckeAntworttexte() {
    // TODO Implementieren gemaess Aufgabenstellung
	  this.iterator = this.ergebnisse.iterator();
	  while (this.iterator.hasNext()){
		  
		  Pruefungsergebnis ergebnis =  this.iterator.next();
		  
		  if(ergebnis.getNote() >= 4.0){
			  
			  System.out.println("Herzliche Gratulation " +ergebnis.getStudent() + "! Sie haben"+
					  			 "an der Prüfung eine "+ergebnis.getNote()+ " erzielt und somit Bestanden"); 
		  }
		  else{
			  System.out.println(ergebnis.getStudent() + ",Sie haben an der Prüfung eine "+
					  			 ergebnis.getNote() +" erzielt und sind somit durchgefallen!");
		  } 
		  
	  }
	 
	   
	  
  }

  private double rundeAufHalbeNote(double note) {
    return Math.round(note * 2) / 2.0;
  }
}
