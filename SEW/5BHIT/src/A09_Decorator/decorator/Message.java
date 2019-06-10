package A09_Decorator.decorator;

// TODO Die anderen Decorator komponenten definieren
// TODO Dazu brauche ich einen Core, der als basis dient.
// TODO Dieser core braucht keinen Parameter im Konstruktor
// TODO Alle anderen Komponenten haben einen Parameter
// TODO Dieser Parameter ist ein Message Object, also andere
// TODO Komponenten
public interface Message {
	public String getString();
}