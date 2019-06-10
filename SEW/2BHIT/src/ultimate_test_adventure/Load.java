package ultimate_test_adventure;

import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * Beschreiben Sie hier die Klasse Speichern.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Load{
    public static String name(){
        String a = "";
        try{
            RandomAccessFile name = new RandomAccessFile("Name.txt", "r");
            a = name.readUTF();
            name.close();
        }catch(IOException h){
            System.out.print("\fEs ist ein Fehler aufgetretten!");
            System.exit(0);
        }catch(IllegalArgumentException f){
            System.out.print("\fEs wurde ein ung�lter Dateimodus verwendet, �ndern sie diesen oder wenden sie sich an den Support.");
            System.exit(0);
        }catch(SecurityException g){
            System.out.print("\fSie haben nicht die Rechte diese Datei zu verwenden.");
            System.exit(0);
        }
        return a;
    }
    public static String geschlecht(){
        String a = "";
        try{
            RandomAccessFile geschlecht = new RandomAccessFile("Geschlecht.txt", "r");
            a = geschlecht.readUTF();
            geschlecht.close();
        }catch(IOException h){
            System.out.print("\fEs ist ein Fehler aufgetretten!");
            System.exit(0);
        }catch(IllegalArgumentException f){
            System.out.print("\fEs wurde ein ung�lter Dateimodus verwendet, �ndern sie diesen oder wenden sie sich an den Support.");
            System.exit(0);
        }catch(SecurityException g){
            System.out.print("\fSie haben nicht die Rechte diese Datei zu verwenden.");
            System.exit(0);
        }
        return a;
    }
    public static int level(){
        int a = 1;
        try{
            RandomAccessFile level = new RandomAccessFile("Level.txt", "r");
            a = level.readInt();
            level.close();
        }catch(IOException h){
            System.out.print("\fEs ist ein Fehler aufgetretten!");
            System.exit(0);
        }catch(IllegalArgumentException f){
            System.out.print("\fEs wurde ein ung�lter Dateimodus verwendet, �ndern sie diesen oder wenden sie sich an den Support.");
            System.exit(0);
        }catch(SecurityException g){
            System.out.print("\fSie haben nicht die Rechte diese Datei zu verwenden.");
            System.exit(0);
        }
        return a;
    }
    public static int angriff(){
        int a = 10;
        try{
            RandomAccessFile angriff = new RandomAccessFile("Angriff.txt", "r");
            a = angriff.readInt();
            angriff.close();
        }catch(IOException h){
            System.out.print("\fEs ist ein Fehler aufgetretten!");
            System.exit(0);
        }catch(IllegalArgumentException f){
            System.out.print("\fEs wurde ein ung�lter Dateimodus verwendet, �ndern sie diesen oder wenden sie sich an den Support.");
            System.exit(0);
        }catch(SecurityException g){
            System.out.print("\fSie haben nicht die Rechte diese Datei zu verwenden.");
            System.exit(0);
        }
        return a;
    }
    public static int defense(){
        int a = 5;
        try{
            RandomAccessFile defense = new RandomAccessFile("Defense.txt", "r");
            a = defense.readInt();
            defense.close();
        }catch(IOException h){
            System.out.print("\fEs ist ein Fehler aufgetretten!");
            System.exit(0);
        }catch(IllegalArgumentException f){
            System.out.print("\fEs wurde ein ung�lter Dateimodus verwendet, �ndern sie diesen oder wenden sie sich an den Support.");
            System.exit(0);
        }catch(SecurityException g){
            System.out.print("\fSie haben nicht die Rechte diese Datei zu verwenden.");
            System.exit(0);
        }
        return a;
    }
    public static int exp(){
        int a = 0;
        try{
            RandomAccessFile exp = new RandomAccessFile("Exp.txt", "r");
            a = exp.readInt();
            exp.close();
        }catch(IOException h){
            System.out.print("\fEs ist ein Fehler aufgetretten!");
            System.exit(0);
        }catch(IllegalArgumentException f){
            System.out.print("\fEs wurde ein ung�lter Dateimodus verwendet, �ndern sie diesen oder wenden sie sich an den Support.");
            System.exit(0);
        }catch(SecurityException g){
            System.out.print("\fSie haben nicht die Rechte diese Datei zu verwenden.");
            System.exit(0);
        }
        return a;
    }
    public static int health(){
        int a = 50;
        try{
            RandomAccessFile health = new RandomAccessFile("Health.txt", "r");
            a = health.readInt();
            health.close();
        }catch(IOException h){
            System.out.print("\fEs ist ein Fehler aufgetretten!");
            System.exit(0);
        }catch(IllegalArgumentException f){
            System.out.print("\fEs wurde ein ung�lter Dateimodus verwendet, �ndern sie diesen oder wenden sie sich an den Support.");
            System.exit(0);
        }catch(SecurityException g){
            System.out.print("\fSie haben nicht die Rechte diese Datei zu verwenden.");
            System.exit(0);
        }
        return a;
    }
    public static int maxXp(){
        int a = 100;
        try{
            RandomAccessFile maxXp = new RandomAccessFile("MaxpXp.txt", "r");
            a = maxXp.readInt();
            maxXp.close();
        }catch(IOException h){
            System.out.print("\fEs ist ein Fehler aufgetretten!");
            System.exit(0);
        }catch(IllegalArgumentException f){
            System.out.print("\fEs wurde ein ung�lter Dateimodus verwendet, �ndern sie diesen oder wenden sie sich an den Support.");
            System.exit(0);
        }catch(SecurityException g){
            System.out.print("\fSie haben nicht die Rechte diese Datei zu verwenden.");
            System.exit(0);
        }
        return a;
    }
}