package ultimate_rpg.weapon;


public class weapon {
	protected String name = "";							//Der Name der Waffe
	protected double minAtk = 0;						//Der minimale Angriffswert der Waffe
	protected double maxAtk = 0;						//Der maximale Angriffswert der Waffe
	protected double speed = 0;							//Die Angriffsgeschwindigkeit der Waffe(Angriffe pro Sekunde)
	protected double dps = 0;							//Der Schaden pro Sekunde
	protected double minDef = 0;						//Der minimale Verteidigungswert des Schildes
	protected double maxDef = 0;						//Der maximale Verteidigungswert des Schildes
	protected double Def = minDef+((maxDef-minDef)/2);	//Die tatsächliche Verteidung
	protected String waffenart = "";					//Die Waffenart
	
	public weapon(){
		
	}
	
	protected double berechneDps(){
		return (minAtk+((maxAtk-minAtk)/2))*speed;		//Berechnet die Dps einer Waffe
	}
	protected double berechneAtk(double atk){
		 return atk*(level+(level/100*level));
	}
}