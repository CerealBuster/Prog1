public class Anwendung {
	
	
	private Parser parser;
	private Kontroller kontroller;
	
	public Anwendung(){
		
		this.parser = new Parser();
		this.kontroller = new Kontroller();
		
	}
	
	public boolean start(){
		
		return kontroller.verarbeiteBefehl(parser.liefereBefehl());
		
	}
	
	public static void main(String[] args) {
		Anwendung ausfueren = new Anwendung();
		boolean weiter = true;
		do {
			
			 weiter =  ausfueren.start();
			
		}while(weiter);
}

}
