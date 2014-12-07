import java.util.ArrayList;


/**
 * @author raffael
 *
 */
public class Getraenkezubereiter {
	private Kaffee kaffeeObject;
	private Tee teeObject;
	private ArrayList<KoffeinGetraenk> kaffeeUndTee;

	public Getraenkezubereiter(){
		kaffeeUndTee = new ArrayList<KoffeinGetraenk>();
		
		
	}
	
	private ArrayList<KoffeinGetraenk> createList(){
		for(int i = 0; i < 10; i+=2){
			kaffeeObject = new Kaffee();
			teeObject = new Tee();
			this.kaffeeUndTee.add(kaffeeObject);
			this.kaffeeUndTee.add(teeObject);
			
		}
		
		return this.kaffeeUndTee;
	}
	
	private void bereiteGetraenkZu(){
		for(KoffeinGetraenk element:kaffeeUndTee){
			element.bereiteZu();
			element.trinke();
			System.out.println("");
			
		}
		
		
	}
	public static void main(String args[]){
	
		Getraenkezubereiter brewery = new Getraenkezubereiter();
		brewery.createList();
		brewery.bereiteGetraenkZu();
	
	}
	

}

