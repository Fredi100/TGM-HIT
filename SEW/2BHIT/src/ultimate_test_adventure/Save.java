package ultimate_test_adventure;

import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * Beschreiben Sie hier die Klasse Speichern.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Save{
    public static void name(String name1,RandomAccessFile name2){
        try{
            name2.writeUTF(name1);
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
    }
    public static void geschlecht(String geschlecht1,RandomAccessFile geschlecht2){
        try{
            geschlecht2.writeUTF(geschlecht1);
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
    }
    public static void level(int level1,RandomAccessFile level2){
        try{
            level2.writeInt(level1);
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
    }
    public static void angriff(int angriff1,RandomAccessFile angriff2){
        try{
            angriff2.writeInt(angriff1);
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
    }
    public static void defense(int defense1,RandomAccessFile defense2){
        try{
            defense2.writeInt(defense1);
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
    }
    public static void exp(int exp1,RandomAccessFile exp2){
        try{
            exp2.writeInt(exp1);
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
    }
    public static void health(int health1,RandomAccessFile health2){
        try{
            health2.writeInt(health1);
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
    }
    public static void maxXp(int maxXp1,RandomAccessFile maxXp2){
        try{
            maxXp2.writeInt(maxXp1);
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
    }
}