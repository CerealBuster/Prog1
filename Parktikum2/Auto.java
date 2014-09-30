
/**
 * Die Klasse Auto repraesentiert ein Auto mit Marke, Typ, Hubraum, und ob es einen Turbomotor hat. Es kann auch eine Angabe des lagerbestandes gegeben werden.
 * 
 * @author Raffael Affolter 
 * @version 0.1
 */
public class Auto
{

    /**
     * Globale variablen.
     */
    private String marke;
    private String typ;
    private double hubraum;
    private boolean turbomotor;
    private int lagerbestand;

         

    /**
     * Auto Constructor
     *
     * @param marke Markenname
     * @param typ Typen Bezeichnung
     * @param hubraum Groesse des Hubraums in Litern
     * @param turbomotor Wenn True haben wir einen Hubraum
     */
    public Auto(String marke, String typ, double hubraum, boolean turbomotor)
    {
        this.marke = checkMarkenName(marke);
        this.typ = checkTypName(typ);
        this.hubraum = checkHubraum(hubraum);
        this.turbomotor = turbomotor;
        this.lagerbestand = 0;

    }

    /**
     * Method setMarkenName
     *
     * @param markenName Name der Marke
     */
    public void setMarkenName(String markenName){

        this.marke = checkMarkenName(markenName);
    }

    /**
     * Method getMarke
     *
     * @return marke
     */
    public String getMarke(){

        return this.marke;
    }

    /**
     * Method setTyp
     *
     * @param typ Name des Typen
     */
    public void setTyp(String typ){

        this.typ = checkTypName(typ);
    }

    /**
     * Method getTyp
     *
     * @return typ
     */
    public String getTyp(){

        return this.typ;
    }

    /**
     * Method setHubraum
     *
     * @param hubraum der Hubraum des Autos in Litern
     */
    public void setHubraum(double hubraum){

        this.hubraum = checkHubraum(hubraum);
    }

    /**
     * Method getHubraum
     *
     * @return hubraum
     */
    public double getHubraum(){

        return this.hubraum;
    }

    /**
     * Method setTurbomotor
     *
     * @param hatTurbo Wenn true dann besitzt das Auto einen Turbomotor
     */
    public void setTurbomotor(boolean hatTurbo){

        this.turbomotor = hatTurbo;
    }

    /**
     * Method checkMarkenName
     *
     * @param marke Name des Autos
     * @return Wenn ein Valider Name gegeben wird, wird dieser zurueckgegeben ansonsten wird "___" und eine Fehlermeldung ausgegeben.
     */
    public String checkMarkenName(String marke){
        //Name kuerzer als 3 Zeichen
        if (marke.length() < 3){

            marke = "___";
            System.out.println("ERROR: Markenname zu kurz. Er muss mindesten 3 Zeichen lang sein");
            return marke;
        }
        //Name groesser als 10 Zeichen?
        else if (marke.length() > 10 ){

            marke = "___";
            System.out.println("ERROR: Markenname zu lang. Er darf hoechstens 10 Zeichen enthalten");
            return "___";
        }
        //Alles ok
        else {

            return marke;
        }
    }

    /**
     * Method checkTypName
     *
     * @param typ Typenname
     * @return Wenn ein Valider Name gegeben wird, wird dieser zurueckgegeben ansonsten wird "___" und eine Fehlermeldung ausgegeben.
     */
    public String checkTypName(String typ){
        //Name kuerzer als 3 zeichen?
        if (typ.length() < 3){

            typ = "___";
            System.out.println("ERROR: Typenname zu kurz. Er muss mindesten 3 Zeichen lang sein");
            return typ;
        }
        //Name laenger als 10 zeichen?
        else if (typ.length() > 10 ){

            typ = "___";
            System.out.println("ERROR: Typenname zu lang. Er darf hoechstens 10 Zeichen enthalten");
            return "___";
        }
        //Alles ok
        else {

            return typ;
        }
    }

    /**
     * Method checkHubraum
     * Mit dieser Methode kann man den Hubraum des Autos festlegen
     *
     * @param hubraum Hubraum des Autos
     * @return Wenn ein Valider Name gegeben wird, wird dieser zurueckgegeben ansonsten wird "___" und eine Fehlermeldung ausgegeben.
     */
    public double checkHubraum(double hubraum){
        //Hubraum kleiner 0.5?
        if(hubraum < 0.5){

            System.out.println("ERROR: Hubraum zu klein. Er muss mindestetns 0.5L betragen");
            return 0;
        }
        //Hubraum groesser 8.0?
        else if(hubraum > 8.0 ){
            System.out.println("ERROR: Hubraum zu gross. Er darf nicht groesser als 8.0L betragen");
            return 0;
        }
        //Alles ok
        else {

            return hubraum;
        }

    }

    /**
     * Method setLagerBestand
     * Diese Methode ermoeglicht es den Lagerbestand zu veraendert. Bei erfolg wird eine Ausgabe auf die Konsole generiert.
     * Bei Nichterfolg wird eine Fehelermeldung ausgegeben
     *
     * @param Neuer Lagerbestand. Sollte zwischen -10 und 10 betragen.
     */
    public void setLagerBestand (int neuerBestand){
        int alterBestand = this.lagerbestand;
        //Neuer bestand kleiner -10?
        if (neuerBestand < -10){
            System.out.println("ERROR: Lagerbestand kann nicht um mehr als 10 reduziert werden");
        }
        //Neuer Bestand Groesser 10?
        else if(neuerBestand >10){
            System.out.println("ERROR: Lagerbestand kann nicht um mehr als 10 erhoet werden");

        }
        //Netto bestand negativ?
        else if (this.lagerbestand + neuerBestand < 0){

            System.out.println("ERROR: Bestand kann nicht negativ sein");
        }
        //Drucke Den Lagerbestand aus mit altem und neuem Bestand.
        else {

            this.lagerbestand += neuerBestand;
            System.out.println("Bestand geaendert.");
            System.out.println("Alter Bestand: "+ alterBestand);
            System.out.println("Neuer Bestand: "+ this.lagerbestand);

        }

    }

    /**
     * Method printAuto
     * Diese Methode gibt die Angaben zum auto auf die Konsole aus.
     */
    public void printAuto(){

        String code = "";

        if (turbomotor){
            code = this.marke.substring(0,3) + "-"+this.typ.substring(0,3)+"-"+this.hubraum+"-T";
        }
        else{
            code = this.marke.substring(0,3) + "-"+this.typ.substring(0,3)+"-"+this.hubraum;
        }

        System.out.println(this.marke+ " "+ this.typ+", "+this.hubraum+ " Liter");
        System.out.println("Code: " + code);
        System.out.println("Lagerbestand: "+this.lagerbestand);

    }

}
