package ultimate_test_adventure;

import java.io.*;
/**
 * Unser Spiel: THE ULTIMATE TEXT-ADVENTURE
 * 
 * @author Alfred Emsenhuber, Andreas Stepan 
 * @version 2012-11-20
 */
public class Main {
    public static void main(String args[]) {
    	GUI b = new GUI();
        // Variablen :)
        String name1 = "";
        String gender = "";
        String map = Map.getMap();
        int game_on = 1;
        int a = -1;
        int tun = -1;
        int tun2 = -1;
        int atk = 10;
        int def = 5;
        int hp = 50;
        int xp = 0;
        int maxExp = 100;
        int lvl = 1;
        boolean wait = true;
        try{
            RandomAccessFile name = new RandomAccessFile("Name.txt", "rw");
            RandomAccessFile geschlecht = new RandomAccessFile("Geschlecht.txt", "rw");
            RandomAccessFile level = new RandomAccessFile("Level.txt", "rw");
            RandomAccessFile angriff = new RandomAccessFile("Angriff.txt", "rw");
            RandomAccessFile defense = new RandomAccessFile("Defense.txt", "rw");
            RandomAccessFile exp = new RandomAccessFile("Exp.txt", "rw");
            RandomAccessFile health = new RandomAccessFile("Health.txt", "rw");
            RandomAccessFile maxXp = new RandomAccessFile("MaxpXp.txt", "rw");
            
            
            //Start
            //b.Intro();
            b.Login();
            while(wait == true){
            	if(b.getLogin() != -1){
            		a = b.getLogin();
            		System.out.print("");
            		wait = false;
            	}
            }
            //Charakter Erstellung
            if(a == 0){
            	wait = true;
            	b.name();
            	while(wait == true){
            		if(b.getNameEnter() == 0){
            			name1 = b.getName();
            			System.out.print("");
            			wait = false;
            		}
            	}
            }else{
                name1 = Load.name();
                gender = Load.geschlecht();
                lvl = (Load.level());
                atk = (Load.angriff());
                def = (Load.defense());
                xp = (Load.exp());
                hp = (Load.health());
                maxExp = (Load.maxXp());
            }
            
            
            //Initialisierung
            Char character = new Char(name1,gender);
            character.setLvl(lvl);
            character.setAtk(atk);
            character.setDef(def);
            character.setXp(xp);
            character.setHp(hp);
            character.setMaxXp(maxExp);
            Inventory Inventar = new Inventory();
            map = Map.getMap();
            Interface.HUD(character.getAtk(),character.getDef(),character.getHp(),character.getLvl(),character.getXp(),character.getMaxXp(),character.getName(),character.getGender());
            
            
            //Spiel-Schleife
            while(game_on == 1){
                tun = Fenster.do_thing();
                switch (tun) {
                    case 0:
                    break;

                    case 1:
                        do{
                            Inventar.getInv();
                            tun2 = Fenster.inventar();
                        }
                        while(tun2 != 1);
                        Interface.HUD(character.getAtk(),character.getDef(),character.getHp(),character.getLvl(),character.getXp(),character.getMaxXp(),character.getName(),character.getGender());
                    break;

                    case 2:
                        System.out.println(map);
                        do{
                            try {
                                Thread.sleep(7000);
                            }
                            catch (InterruptedException ex) {
                                Thread.currentThread().interrupt();
                            }  
                            tun2 = Fenster.karteSchliessen();
                        }
                        while(tun2 == 1);
                        Interface.HUD(character.getAtk(),character.getDef(),character.getHp(),character.getLvl(),character.getXp(),character.getMaxXp(),character.getName(),character.getGender());
                    break;

                    case 3:
                        game_on  = 0;
                        name.writeUTF(character.getName());
                        geschlecht.writeUTF(character.getGender());
                        level.writeInt(character.getLvl());
                        angriff.writeInt(character.getAtk());
                        defense.writeInt(character.getDef());
                        health.writeInt(character.getHp());
                        exp.writeInt(character.getXp());
                        maxXp.writeInt(character.getMaxXp());
                        System.out.print("\f");
                        System.exit(0);
                }
                name.close();
                level.close();
                exp.close();
                angriff.close();
                defense.close();
                health.close();
                geschlecht.close();
                maxXp.close();
            }
        }catch(IOException h){
            System.out.print("\fDEs ist ein Fehler bei der Ein/Augabe aufgetretten!");
            System.exit(0);
        }catch(IllegalArgumentException f){
            System.out.print("\fEs wurde ein ungülter Dateimodus verwendet, ändern sie diesen oder wenden sie sich an den Support.");
            System.exit(0);
        }catch(SecurityException g){
            System.out.print("\fSie haben nicht die Rechte diese Datei zu verwenden.");
            System.exit(0);
        }
    }
}