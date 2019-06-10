package ultimate_rpg.weapon.dagger;

import weapon.weapon;


public class dagger extends weapon{
	public dagger(){
		waffenart = "dagger";
		minAtk = 5.5;
		maxAtk = 6.5;
		minAtk = berechneAtk(minAtk);
		maxAtk = berechneAtk(maxAtk);
		speed = 1.7;
		dps = berechneDps();
		name = "Dolch";
	}
}