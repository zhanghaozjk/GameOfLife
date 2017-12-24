package cn.hcven;

public class Cells {
    private boolean alive = false;

    public boolean isAlive() {
        return alive;
    }

    public boolean setAlive(){
        try {
            this.alive = true;
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean setDie(){
        try {
            this.alive = false;
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
