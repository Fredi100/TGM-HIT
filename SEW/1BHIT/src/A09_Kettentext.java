/**
 * Dies Klasse gibt einen text aus der nur aus String zusammen gekettet wird
 * 
 * @author Alfred Emsenhuber
 * @version 2011-10-13
 */

public class A09_Kettentext { //Dieser Befehl sagt dem Computer das er einen neue Klasse erstellen soll
    public static void main(String[] args) {
        String txt1; //Das ist die erste Variable,
        String txt2; //die zweiter Variable,
        String txt3; //die dritte,
        String txt4; //die vierte,
        String txt5; //und meine selbst hinzugef�gte um noch einen dritten Satz zu schreiben.
        txt1 = "Das ist"; //Das ist der Text der ersten Variable,
        txt2 = " meine"; //der Text der zweiten Variable,
        txt3 = " deine"; //der dritten,
        txt4 = " Zeichenkette!"; //der vierten,
        txt5 = " unsere"; //und der von meiner selbst hinzugef�gten Variable.
        System.out.print(txt1); //Das gibt den Text der ersten Variable aus,
        System.out.print(txt2); //das den der zweiten,
        System.out.println(txt4); //und das den der vierten um den Satz zu beenden.
        System.out.print(txt1); //Das gibt wieder den Text der ersten Variable aus,
        System.out.print(txt3); //das den der dritten um einen etwas anderen Text auszugeben,
        System.out.println(txt4); //und das wieder den der vierten um ihn wieder zu beenden.
        System.out.print(txt1); //Das gibt den Text der ersten Variable aus um meinen eigenen Satz auszugeben,
        System.out.print(txt5); //das den der f�nften,
        System.out.print(txt4); //und das letztenendes den der vierten um auch diesen Satz zu beenden.
    }
}