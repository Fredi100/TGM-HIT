package ultimate_rpg.weapon;


import java.util.Random;

public class Names {
	static String[] adjektiv = {"Erhaben",	"Geschliffen","Magisch",	 "Verstärkt",  "Dämonisch", "Göttlich","Antik", "Selten",	 "Einzigartig",	 "Krass Krank",
						 		"Mächtig",	"Königlich",  "Meisterhaft", "Schick",	   "Verbessert","Gehärtet","Scharf","Schmerzhaft","Unterdrückend","Verwüstend",
						 		"Adelig", 	"Sagenhaft",  "Erlesen",	 "Echt",	   "Voll",	    "Mythisch","Episch","Gefürchtet",	 "Unschlagbar",	 "Geschmiedet",
						 		"Großartig","Gut",		  "Schockierend","Schrecklich"};
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