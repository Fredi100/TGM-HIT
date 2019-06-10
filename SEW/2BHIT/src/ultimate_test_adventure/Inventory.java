package ultimate_test_adventure;

/**
 * Beschreiben Sie hier die Klasse Test.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Inventory{
    private int select;
    private String[] item = {"                                         ",
                             "                                         ",
                             "                                         ",
                             "                                         ",
                             "                                         ",
                             "                                         ",
                             "                                         ",
                             "                                         ",
                             "                                         ",
                             "                                         "};
    private String[] fenster = {"                                         ",
                                "                                         ",
                                "                                         ",
                                "                                         ",
                                "                                         ",
                                "                                         ",
                                "                                         ",
                                "                                         ",
                                "                                         ",
                                "                                         ",
                                "                                         "};
    private String[] beschreibung = {"                                    ",
                                     "                                    ",
                                     "                                    ",
                                     "                                    "};
    private String text =  "\f"+
                           ".______________________________________________________________________________."+"\n"+
                           "|                                    |" + fenster[0] + "|"+"\n"+
                           "|                                    |" + item[0] + "|"+"\n"+
                           "|                                    |" + fenster[1] + "|"+"\n"+
                           "|                                    |" + item[1] + "|"+"\n"+
                           "|                                    |" + fenster[2] + "|"+"\n"+
                           "|                                    |" + item[2] + "|"+"\n"+
                           "|                                    |" + fenster[3] + "|"+"\n"+
                           "|                                    |" + item[3] + "|"+"\n"+
                           "|                                    |" + fenster[4] + "|"+"\n"+
                           "|                                    |" + item[4] + "|"+"\n"+
                           "|                                    |" + fenster[5] + "|"+"\n"+
                           "|                                    |" + item[5] + "|"+"\n"+
                           "|                                    |" + fenster[6] + "|"+"\n"+
                           "|                                    |" + item[6] + "|"+"\n"+
                           "|                                    |" + fenster[7] + "|"+"\n"+
                           "|                                    |" + item[7] + "|"+"\n"+
                           "|____________________________________|" + fenster[8] + "|"+"\n"+
                           "|" + beschreibung[0] + "|" + item[8] + "|"+"\n"+
                           "|" + beschreibung[1] + "|" + fenster[9] + "|"+"\n"+
                           "|" + beschreibung[2] + "|" + item[9] + "|"+"\n"+
                           "|" + beschreibung[3] + "|" + fenster[10] + "|"+"\n"+
                           "|____________________________________|_________________________________________|";
    public Inventory(){
        select = 0;
        switch(select){
               case 0 : fenster[select] = "-----------------------------------------";
                        fenster[select+1] = "-----------------------------------------";
                        break;
               case 1 : fenster[select] = "-----------------------------------------";
                        fenster[select+1] = "-----------------------------------------";
                        break;
               case 2 : fenster[select] = "-----------------------------------------";
                        fenster[select+1] = "-----------------------------------------";
                        break;
               case 3 : fenster[select] = "-----------------------------------------";
                        fenster[select+1] = "-----------------------------------------";
                        break;
               case 4 : fenster[select] = "-----------------------------------------";
                        fenster[select+1] = "-----------------------------------------";
                        break;
               case 5 : fenster[select] = "-----------------------------------------";
                        fenster[select+1] = "-----------------------------------------";
                        break;
               case 6 : fenster[select] = "-----------------------------------------";
                        fenster[select+1] = "-----------------------------------------";
                        break;
               case 7 : fenster[select] = "-----------------------------------------";
                        fenster[select+1] = "-----------------------------------------";
                        break;
               case 8 : fenster[select] = "-----------------------------------------";
                        fenster[select+1] = "-----------------------------------------";
                        break;
               case 9 : fenster[select] = "-----------------------------------------";
                        fenster[select+1] = "-----------------------------------------";
                        break;
        }
        text =  "\f"+
                ".______________________________________________________________________________."+"\n"+
                "|                                    |" + fenster[0] + "|"+"\n"+
                "|                                    |" + item[0] + "|"+"\n"+
                "|                                    |" + fenster[1] + "|"+"\n"+
                "|                                    |" + item[1] + "|"+"\n"+
                "|                                    |" + fenster[2] + "|"+"\n"+
                "|                                    |" + item[2] + "|"+"\n"+
                "|                                    |" + fenster[3] + "|"+"\n"+
                "|                                    |" + item[3] + "|"+"\n"+
                "|                                    |" + fenster[4] + "|"+"\n"+
                "|                                    |" + item[4] + "|"+"\n"+
                "|                                    |" + fenster[5] + "|"+"\n"+
                "|                                    |" + item[5] + "|"+"\n"+
                "|                                    |" + fenster[6] + "|"+"\n"+
                "|                                    |" + item[6] + "|"+"\n"+
                "|                                    |" + fenster[7] + "|"+"\n"+
                "|                                    |" + item[7] + "|"+"\n"+
                "|____________________________________|" + fenster[8] + "|"+"\n"+
                "|" + beschreibung[0] + "|" + item[8] + "|"+"\n"+
                "|" + beschreibung[1] + "|" + fenster[9] + "|"+"\n"+
                "|" + beschreibung[2] + "|" + item[9] + "|"+"\n"+
                "|" + beschreibung[3] + "|" + fenster[10] + "|"+"\n"+
                "|____________________________________|_________________________________________|";
    }
    public void setItem(int id){
        String name = item(id,0);
        for(int i = 0;i < 10;i++){
            if(item[i].equals("                                         ")){
                item[i] = name;
                for(int j = 0;j < (41 - name.length());j++){
                    item[i] += " ";
                }
                break;
            }
        }
        text =  "\f"+
                ".______________________________________________________________________________."+"\n"+
                "|                                    |" + fenster[0] + "|"+"\n"+
                "|                                    |" + item[0] + "|"+"\n"+
                "|                                    |" + fenster[1] + "|"+"\n"+
                "|                                    |" + item[1] + "|"+"\n"+
                "|                                    |" + fenster[2] + "|"+"\n"+
                "|                                    |" + item[2] + "|"+"\n"+
                "|                                    |" + fenster[3] + "|"+"\n"+
                "|                                    |" + item[3] + "|"+"\n"+
                "|                                    |" + fenster[4] + "|"+"\n"+
                "|                                    |" + item[4] + "|"+"\n"+
                "|                                    |" + fenster[5] + "|"+"\n"+
                "|                                    |" + item[5] + "|"+"\n"+
                "|                                    |" + fenster[6] + "|"+"\n"+
                "|                                    |" + item[6] + "|"+"\n"+
                "|                                    |" + fenster[7] + "|"+"\n"+
                "|                                    |" + item[7] + "|"+"\n"+
                "|____________________________________|" + fenster[8] + "|"+"\n"+
                "|" + beschreibung[0] + "|" + item[8] + "|"+"\n"+
                "|" + beschreibung[1] + "|" + fenster[9] + "|"+"\n"+
                "|" + beschreibung[2] + "|" + item[9] + "|"+"\n"+
                "|" + beschreibung[3] + "|" + fenster[10] + "|"+"\n"+
                "|____________________________________|_________________________________________|";
    }
    public void hoch(){
        
    }
    public void getInv(){
        System.out.print(text);
    }
    public String item(int id,int was){
        String[][] item = {{"Schwacher Heiltrank",""},
                           {"Starker Heiltrank",""},
                           {"Stumpfer Dolch",""},
                           {"Leder Weste",""},
                           {"Saphier",""},
                           {"Eisenerz",""},
                           {"",""},
                           {"",""},
                           {"",""},
                           {"",""},
                           {"",""},
                           {"",""},
                           {"",""},
                           {"",""},
                           {"",""},
                           {"",""},
                           {"",""},
                           {"",""},
                           {"",""},
                           {"",""},
                           {"",""},
                           {"",""},
                           {"",""}};
        return item[id][was];
    }
}
