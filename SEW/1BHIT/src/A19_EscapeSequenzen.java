import javax.swing.JOptionPane;
/**
 * Diese Programm gibt einen Text in einem eigenen Fenster ein
 * 
 * @author Alfred Emsenhuber
 * @version 2011-11-10
 */
public class A19_EscapeSequenzen {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Um Steuerzeichen in einem Text einzufügen gibt es \"Escape-Sequenzen\".\n" +
        "Jede Escape-Sequenz beginnt mit einem \\ gefolgt von einem Buchstaben, z.B.\n" +
        "\\n     neue Zeile\n" +
        "\\t      Tabulator\n" +
        "\\\\       Backslash\n" +
        "\\\"      Anführungszeichen");
    }
}