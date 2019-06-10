/**
 * Eine Vorlage-Klasse für Kreis-Objekte
 * 
 * @author Alfred Emsenhuber
 * @version 2012-6-14
 */
public class Kreis {
    //Attribute
    private double radius; //geschütztes Attribut = Datenkapselung
    
    // Konstruktoren
    /**
     * Erzeugt ein Kreis-Objekt, wobei der Parameter als Radius
     * übernommen wird
     * @param   r   der Radius für das neue Kreis-Objekt
     */
    public Kreis(double r) {
        if(r > 0) {
            radius = r;     // Im Konstruktor wird das Objekt ganz
        } else {            // neu erzeugt. Deswegen muss man auf
            radius = 10;    // alle Fälle einen Wert für das Attribut
        }                   // setzen, in diesem Fall einen beliebigen
    }                       // selbts gewählten gültigen Wert.
    
    /**
     * Erzeugt ein Kreis-Objekt mit einem Radius von 10
     */
    public Kreis() {
        radius = 10;     
    }
    
    //setter- und getter-Methoden
    /**
     * Legt einen neuen Radius für den Kreis fest.
     * @param r  der neue Radius
     */
    public void setRadius(double r){
        if(r > 0) {
            radius = r;
        }
    }
    
    /**
     * Gibt den Radius des Kreises zurück.
     * @return den Radius des Kreises
     */
    public double getRadius(){
        return radius;
    }
    
    //weitere Methoden, die die Attribute verwenden
    /**
     * Berechnet den Flächeninhalt des Kreises
     * @return den Flächeninhalt
     */
    public double flaeche(){
        double f;
        f = radius * radius * Math.PI;
        return f;
    }
    
    /**
     * Berechnet den Umfang des Kreises
     * @return den Umfang
     */
    public double umfang(){
        double u;
        u = 2 * radius * Math.PI;
        return u;
    }
}