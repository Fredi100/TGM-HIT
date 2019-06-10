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
	private char bush='B';
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
        return  "\f"+
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
                "#           B             B       #"+"\n"+
                "#         B B B     @             #"+"\n"+
                "#           @ B                   #"+"\n"+
                "#     @ i                 @       #"+"\n"+
                "# B       @   T       T           #"+"\n"+
                "# @ B                             #"+"\n"+
                "# # # # # # # # # # # # # # # # # #";
    }
}
