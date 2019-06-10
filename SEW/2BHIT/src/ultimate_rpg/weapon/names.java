package ultimate_rpg.weapon;


import java.util.Random;

public class names {
	static String[] adjektiv = {"Erhaben",	"Geschliffen","Magisch",	 "Verst�rkt",  "D�monisch", "G�ttlich","Antik", "Selten",	 "Einzigartig",	 "Krass Krank",
						 		"M�chtig",	"K�niglich",  "Meisterhaft", "Schick",	   "Verbessert","Geh�rtet","Scharf","Schmerzhaft","Unterdr�ckend","Verw�stend",
						 		"Adelig", 	"Sagenhaft",  "Erlesen",	 "Echt",	   "Voll",	    "Mythisch","Episch","Gef�chtet",	 "Unschlagbar",	 "Geschmiedet",
						 		"Gro�artig","Gut",		  "Schockierend","Schrecklich"};
	public static String generateName(int typ){
		String name = "";
		if(typ == 0){
			int a;
			Random shit = new Random();
			a = shit.nextInt(33);
			name = adjektiv[a] + "";
		}
		else{
			int a;
			int b;
			Random shit = new Random();
			a = shit.nextInt(33);
			b = shit.nextInt(33);
			name = adjektiv[a] + " " +  adjektiv[b];
		}
		return name;
	}
}