package cn.hcven;

public class AllCells {
    private int length;
    private int width;
    Cells[][] allcells;
    public AllCells(){
        this.length = 0;
        this.width = 0;
    }
    public AllCells(int length, int width){
        this.length = length;
        this.width = width;
        allcells = new Cells[length][width];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++){
                allcells[i][j] = new Cells();
            }
        }
    }
    public boolean print(){
        for (int i = 0; i < width; i++){
            for (int j = 0; j < length; j++){
                if (allcells[i][j].isAlive()){
                    System.out.print('*');

                } else {
                    System.out.print(' ');
                }
            }
            System.out.println("");
        }
        return true;
    }
}
