import javax.swing.JOptionPane;
import java.awt.Color;
/**
 * 1.
 * a) 3 , float
 * b) 1 , int
 * c) siehe Programm
 * 
 * @author Alfred Emsenhuber
 * @version 2012-26-1
 */
public class Test1 {
    public static void main(String[] args) {
        float hue, saturation, brightness;
        int rgb;
        hue = 0.33f;
        saturation = 1f;
        brightness = 1f;
        rgb = Color.HSBtoRGB(hue, saturation, brightness);
        JOptionPane.showMessageDialog(null,"Der RGB Wert lautet: " + rgb);
    }
}