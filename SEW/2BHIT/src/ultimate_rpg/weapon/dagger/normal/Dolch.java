package ultimate_rpg.weapon.dagger.normal;

import weapon.dagger.dagger;




public class Dolch extends dagger{
	public Dolch(){
		minAtk = 6;
		maxAtk = 7;
		minAtk = berechneAtk(minAtk);
		maxAtk = berechneAtk(maxAtk);
		dps = berechneDps();
		name = Names(1) + "er Dolch";
	}
}
