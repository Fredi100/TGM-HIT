package ultimate_test_adventure;

/**
 * Karte
 * 
 * @author Alfred Emsenhuber
 * @version 2012-11-20
 */
public class Map {
    @SuppressWarnings("unused")
	private char stone='@';
    @SuppressWarnings("unused")
	private char player='i';
    @SuppressWarnings("unused")
	private char bush='�';
    @SuppressWarnings("unused")
	private char hWall='-';
    @SuppressWarnings("unused")
	private char vWall='|';
    @SuppressWarnings("unused")
	private char empty=' ';
    @SuppressWarnings("unused")
	private char door='H';
    @SuppressWarnings("unused")
	private char tree='T';
    public static String getMap(){
        String karte;
        karte = "\f"+
                "# # # # # # # # # # # # # # # # # #"+"\n"+
                "#                     | |         #"+"\n"+
                "#   @       T         | |         #"+"\n"+
                "#                     | |         #"+"\n"+
                "#   @ - - - @         | @ - - - - #"+"\n"+
                "#   |       |   T     @ - - - - - #"+"\n"+
                "#   |       |                     #"+"\n"+
                "#   |       |                     #"+"\n"+
                "#   @ - H - @       T       T     #"+"\n"+
                "#                                 #"+"\n"+
                "#   @                             #"+"\n"+
                "#           �             �       #"+"\n"+
                "#         � � �     @             #"+"\n"+
                "#           @ �                   #"+"\n"+
                "#     @ i                 @       #"+"\n"+
                "# �       @   T       T           #"+"\n"+
                "# @ �                             #"+"\n"+
                "# # # # # # # # # # # # # # # # # #";
        return karte;
    }
}
