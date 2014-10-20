/**
 * Die Klasse MessApp steuert einen Messablauf, um die Performance des
 * Zufallszahlengenerators zu messen.
 */
public class MessApp {
  private Messkonduktor messkonduktor;
  private int[][] messwerte;
  
  public MessApp() {
      messwerte = new int[10][20];
      
  }

  /**
   * Fuehrt eine Messung durch.
   * 
   
   */
  public void messen() {
    initialisieren();
    //messkonduktor
    analyseDurchfuehren();
    berechneUndDruckeMittelwerteMessreihe();
    berechneUndDruckeMittelwerteMessung();
  }

  private void initialisieren() {
    // TODO Objektsammlung und Messkonduktor erzeugen
    this.messkonduktor = new Messkonduktor(400000);
  }

  private void analyseDurchfuehren() {
    // TODO Benutzen Sie 'messkonduktor' um die Messungen
    // durchzufuehren und in der Objektsammlung zu speichern.
    for(int i=0; i < messwerte.length; i++)
    {
        messkonduktor.messungenDurchfuehren(messwerte[i]);
    }
  }

  private void berechneUndDruckeMittelwerteMessreihe() {
    // TODO Implementieren Sie die Methode.
    for(int i=0; i < messwerte.length; i++)
    {
        double med = 0;
        for(int j=0; j < messwerte[i].length; j++)
        {
            med += messwerte[i][j];
        }
        System.out.println("Row "+i+": "+med/messwerte[i].length);
    }
  }

  private void berechneUndDruckeMittelwerteMessung() {
    // TODO Implementieren Sie die Methode.
    double med = 0;
    for(int i=0; i < messwerte.length; i++)
    {
        for(int j=0; j < messwerte[i].length; j++)
        {
            med += messwerte[i][j];
        }
    }
    System.out.println("Med all: "+med/messwerte.length/messwerte[0].length);
  }
}