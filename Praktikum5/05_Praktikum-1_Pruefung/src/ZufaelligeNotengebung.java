import java.util.Random;

/**
 * Simuliert Pruefungsergebnisse zum Testen der Pruefungsverwaltung.
 */
public class ZufaelligeNotengebung {
	
	private Random randomNote;
	
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
      note = Math.floor(note)+ 0.5;
      if(note < 1.0){
    	  note = 1.0;
      }
      else if(note > 6.0){
    	  note = 6.0;
      }
      
      Pruefungsergebnis pruefungsergebnis = new Pruefungsergebnis(name, note);
      pruefungsverwaltung.speichereErgebnis(pruefungsergebnis);
    }

    pruefungsverwaltung.druckeAntworttexte();
  }

  private double generiereZufaelligePruefungsnote() {
    // TODO: Fehlenden Code hier einfuegen
	  double randomNote = this.randomNote.nextInt(7) + this.randomNote.nextDouble();
	  
    return randomNote;
  } 
}
