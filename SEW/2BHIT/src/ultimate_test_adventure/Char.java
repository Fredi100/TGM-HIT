package ultimate_test_adventure;

/**
 * Character
 * 
 * @author Alfred Emsenhuber
 * @version 2012-11-20
 */
public class Char {
    private String name;
    private String gender;
    private int atk;
    private int def;
    private int hp;
    private int xp;
    private int maxXp = 100;
    private int lvl;
    private int skills[]={0,0,0,0,0};
    private int playerPos[]={0,0};
    public Char(String name,String gender) {
        this.name=name;
        this.gender=gender;
    }
    public void setAtk (int atk) {
        this.atk=atk;
    }
    public void setDef (int def) {
        this.def=def;
    }
    public void setHp (int hp) {
        this.hp=hp;
    }
    public void setXp (int xp) {
        this.xp=xp;
    }
    public void setLvl(int lvl){
        this.lvl=lvl;
    }
    public void setMaxXp(int maxXp){
        this.maxXp=maxXp;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getAtk(){
        return atk;
    }
    public int getDef(){
        return def;
    }
    public int getHp(){
        return hp;
    }
    public int getLvl(){
        return lvl;
    }
    public int getXp(){
        return xp;
    }
    public int getMaxXp(){
        return maxXp;
    }
}
