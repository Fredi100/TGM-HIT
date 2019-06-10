package ultimate_test_adventure;

/**
 * Scrollender ultimate_test_adventure.Text
 * 
 * @author Andreas Stepan, Alfred Emsenhuber
 * @version 2012-11-20
 */
public class Text {
    public static void scrollText (String sprecher,String text) {
        System.out.print("\f");
        String newText = sprecher + ":\n";
        for (int i=0;i<text.length();i++) { 
            System.out.print("\f");
            newText+=text.charAt(i);
            b.setText(newText);
            try {
                if (text.charAt(i)=='.' || text.charAt(i)=='!' || text.charAt(i)=='?') {
                    Thread.sleep(1500);
                }
                else {
                    Thread.sleep(75);
                }
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }  
        }
    }
}