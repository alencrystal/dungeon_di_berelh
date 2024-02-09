package gioco.dungeon_di_berelh;

public class Player extends Entity{

    int EXP;
    int MAXEXP;
    int LVL;

    
    public int getEXP() {
        return EXP;
    }
    public void setEXP(int eXP) {
        EXP = eXP;
    }
    public int getMAXEXP() {
        return MAXEXP;
    }
    public void setMAXEXP(int mAXEXP) {
        MAXEXP = mAXEXP;
    }
    public int getLVL() {
        return LVL;
    }
    public void setLVL(int lVL) {
        LVL = lVL;
    }

    //maxexp = (n ^ 2 + n) / 2
    
    
}
