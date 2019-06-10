package ultimate_test_adventure;

/**
 * ultimate_test_adventure.Interface
 * 
 * @author Alfred Emsenhuber
 * @version 2012-11-20
 */
public class Interface{
    public static void HUD(int par1,int par2,int par3,int par4,int par5,int par6,String name,String gen){
        String atk;
        String def;
        String hp;
        String lvl;
        String text;
        int i;
        int attack;
        int defense;
        int healthPoints;
        int level;
        attack = par1;
        defense = par2;
        healthPoints = par3;
        level = par4;
        atk = ""+attack;
        def = ""+defense;
        hp = ""+healthPoints;
        lvl = ""+level;
        if(atk.length() < 2){
            atk = "00" + attack;
        }
        else{
            if(atk.length() < 3){
                atk = "0" + attack;
            }
        }
        if(def.length() < 2){
            def = "00" + defense;
        }
        else{
            if(def.length() < 3){
                def = "0" + defense;
            }
        }
        if(hp.length() < 2){
            hp = "00" + healthPoints;
        }
        else{
            if(hp.length() < 3){
                hp = "0" + healthPoints;
            }
        }
        if(lvl.length() < 2){
            lvl = "00" + level;
        }
        else{
            if(lvl.length() < 3){
                lvl = "0" + level;
            }
        }
        i = 78 - name.length();
        while(i > 0){
            name += " ";
            i--;
        }
        if(gen.equals("M�nnlich")){
            gen = "M�nnlich                                                                      ";
        }
        else{
            gen = "Weiblich                                                                      ";
        }
        //XP
        int fall;
        int deineXp;
        int maxXp = par6;
        fall = 0;
        deineXp = par5;
        int zaehlen = 0;
        for(int j = 0;j < 100;j += 4){
            zaehlen++;
            if(deineXp < (maxXp / 100 * j)){
                fall = zaehlen;
                break;
            }
        }
        String balken;
        balken = "";
        switch(fall){
             case 1: balken = "                                                  ";break;
             case 2: balken = "                        ##                        ";break;
             case 3: balken = "                       ####                       ";break;
             case 4: balken = "                      ######                      ";break;
             case 5: balken = "                     ########                     ";break;
             case 6: balken = "                    ##########                    ";break;
             case 7: balken = "                   ############                   ";break;
             case 8: balken = "                  ##############                  ";break;
             case 9: balken = "                 ################                 ";break;
            case 10: balken = "                ##################                ";break;
            case 11: balken = "               ####################               ";break;
            case 12: balken = "              ######################              ";break;
            case 13: balken = "             ########################             ";break;
            case 14: balken = "            ##########################            ";break;
            case 15: balken = "           ############################           ";break;
            case 16: balken = "          ##############################          ";break;
            case 17: balken = "         ################################         ";break;
            case 18: balken = "        ##################################        ";break;
            case 19: balken = "       ####################################       ";break;
            case 20: balken = "      ######################################      ";break;
            case 21: balken = "     ########################################     ";break;
            case 22: balken = "    ##########################################    ";break;
            case 23: balken = "   ############################################   ";break;
            case 24: balken = "  ##############################################  ";break;
            case 25: balken = " ################################################ ";break;
        }
        //HUD
        text = "\f"+
               "|------------------------------------------------------------------------------|"+"\n"+
               "|"+name+"|\n"+
               "|"+gen+"|\n"+
               "|------------------------------------------------------------------------------|"+"\n"+
               "|     Atk: "+atk+"     |     Def: "+def+"     |     HP: "+hp+"     |       Lvl: "+lvl+"       |"+"\n"+
               "|------------------------------------------------------------------------------|"+"\n"+
               "|-------------|"+ balken +"|-------------|\n"+
               "|------------------------------------------------------------------------------|";
        System.out.print(text);
    }
}