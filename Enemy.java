package gioco.dungeon_di_berelh;

public class Enemy extends Entity {

    // drop
    double DROPRATE;
    int DROPEXP;

    
    public double getDROPRATE() {
        return DROPRATE;
    }
    public void setDROPRATE(double dROPRATE) {
        DROPRATE = dROPRATE;
    }
    public int getDROPEXP() {
        return DROPEXP;
    }
    public void setDROPEXP(int dROPEXP) {
        DROPEXP = dROPEXP;
    }
    
    
}
