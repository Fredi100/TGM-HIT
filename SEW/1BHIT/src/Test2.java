/**
 * Berechnet einen Wert und gibt ihn aus.
 * 
 * @author Alfred Emsenhuber
 * @version 2012-26-1
 */
public class Test2 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        double z;
        z = x / y; //Der Fehler besteht darin das Java nicht mit int Werten Kommazahlen rechnen
        z =(double) x / y; // kann, daher muss man nach dem = ein Typecast einfügen.
        System.out.println(z);
    }
}