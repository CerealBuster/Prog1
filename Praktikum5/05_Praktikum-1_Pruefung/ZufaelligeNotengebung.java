import java.util.Random;

/**
 * Simuliert Pruefungsergebnisse zum Testen der Pruefungsverwaltung.
 */
public class ZufaelligeNotengebung {
	
	private Random randomNote;
	
	/**
	 *  Konstuktor fuer die Klasse Zuefaellige Notengebung
	 */
	public ZufaelligeNotengebung(){
		
		randomNote = new Random();
		
	}

  /**
   * Fuehrt die Simulation aus.
   */
  public void fuehreAus() {
    Pruefungsverwaltung pruefungsverwaltung = new Pruefungsverwaltung();

    for (int i = 0; i < 3; i++) {
      String name = "Max Muster " + i;
      double note = generiereZufaelligePruefungsnote();
      
      //Runden der Note auf 0.5 
      note = Math.floor(note)+ 0.5;
      //eliminieren von noten welche nicht innerhalb von 1-6 sind.
      if(note < 1.0){
    	  note = 1.0;
      }
      else if(note > 6.0){
    	  note = 6.0;
      }
      //Erzeugen eines Objektes und abspeichern 
      Pruefungsergebnis pruefungsergebnis = new Pruefungsergebnis(name, note);
      pruefungsverwaltung.speichereErgebnis(pruefungsergebnis);
    }
    
    pruefungsverwaltung.druckeAntworttexte();
  }

  /**
   * Diese Methode generiert eine zufaellige Note
 * @return randomNote  zuefaellige note 
 */
private double generiereZufaelligePruefungsnote() {
    // TODO: Fehlenden Code hier einfuegen
	  double randomNote = this.randomNote.nextInt(7) + this.randomNote.nextDouble();
	  
    return randomNote;
  } 
}
