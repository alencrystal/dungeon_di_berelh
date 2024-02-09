package gioco.dungeon_di_berelh;

abstract class Entity {
    
    String NAME;
    int HP;
    int MAXHP;
    int AD;
    int AP;
    int DEF;
    int MRES;
    int LUCK;


    public String getNAME() {
        return NAME;
    }
    public void setNAME(String nAME) {
        NAME = nAME;
    }
    public int getHP() {
        return HP;
    }
    public void setHP(int hP) {
        HP = hP;
    }
    public int getMAXHP() {
        return MAXHP;
    }
    public void setMAXHP(int mAXHP) {
        MAXHP = mAXHP;
    }
    public int getAD() {
        return AD;
    }
    public void setAD(int aD) {
        AD = aD;
    }
    public int getAP() {
        return AP;
    }
    public void setAP(int aP) {
        AP = aP;
    }
    public int getDEF() {
        return DEF;
    }
    public void setDEF(int dEF) {
        DEF = dEF;
    }
    public int getMRES() {
        return MRES;
    }
    public void setMRES(int mRES) {
        MRES = mRES;
    }
    public int getLUCK() {
        return LUCK;
    }
    public void setLUCK(int lUCK) {
        LUCK = lUCK;
    }

    public String toString() {
        return "NAME=" + NAME + ", HP=" + HP + ", MAXHP=" + MAXHP + ", AD=" + AD + ", AP=" + AP + ", DEF=" + DEF
                + ", MRES=" + MRES + ", LUCK=" + LUCK + "";
    }
}
