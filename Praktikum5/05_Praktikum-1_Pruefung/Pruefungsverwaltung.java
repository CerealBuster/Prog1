import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;




/**
 * Bietet Funktionalitaeten zum Speichern von Pruefungsergebnissen von einer
 * Vielzahl von Studenten. Aus den gespeicherten Ergebnissen lassen sich
 * personalisierte Antworttext generieren.
 */
public class Pruefungsverwaltung {

  private Pruefungsergebnis pruefung;
  
  private ArrayList<Pruefungsergebnis> ergebnisse;
  private Iterator<Pruefungsergebnis> iterator;
  
  /**
 * Konstruktor der KLasse Pruefungsverwaltung 
 */
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
					  			 "an der Pr�fung eine "+ergebnis.getNote()+ " erzielt und somit Bestanden"); 
		  }
		  else{
			  System.out.println(ergebnis.getStudent() + ",Sie haben an der Pruefung eine "+
					  			 ergebnis.getNote() +" erzielt und sind somit durchgefallen!");
		  } 
		  
	  }
	 
  }

  private double rundeAufHalbeNote(double note) {
    return Math.round(note * 2) / 2.0;
  }
  
  /**
 * Mit dieser Methode ist es moeglich einen Studenten und dessen note zu erfassen 
 */
public void erfasseNoten(){
	  Scanner keyboard = new Scanner(System.in);
	  String name = "";
	  double note = 0.0;
	  boolean nok = true;
	  //fuere solange aus bis ein gueltige eingabe gemacht wurde
	  do{
		  System.out.println("Bitte geben Sie den Namen ein: >>> ");
		  name = keyboard.nextLine();
		  if (name.isEmpty()){
			  System.out.println("ERROR: Bitte einen Namen eingeben!");
		  }
		  else {
			  nok = false;
		  }
	  }while(nok);
	  
	  nok = true;
	  //Fuere solange aus bis eine gueltige ausgabe gemacht wurde 
	  do{	   
		  System.out.println("Bitte geben sie die Note ein: >>>");
		  //falls keine gueltige eingabe gemacht wird geben wir eine Warnung aus.
		  try{
			  note = keyboard.nextDouble();
			  if(note < 1.0 || note > 6.0){
				  
				  System.out.println("ERROR: Bitte eine Note zwischen 1 und 6 eingeben");
				  keyboard.next();
			  }
			  else{
				  note = rundeAufHalbeNote(note);
				  nok = false;
			  }
		  }
		  catch (Exception e) {
			  System.out.println("ERROR: Bitte eine Note zwischen 1 und 6 eingeben");
			  keyboard.next();
		  }
		 
	  }while(nok);
	  //und nun speichern wir das ganze noch ab
	  Pruefungsergebnis ergebnis = new Pruefungsergebnis(name, note);
	  speichereErgebnis(ergebnis);
	  
	  keyboard.close();
	  
  }
}
