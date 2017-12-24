package cn.hcven;

public class AllCells {
    private int length;
    private int width;
    private Cells[][] allcells;
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
    public boolean setAlive(int x, int y){
        try {
            allcells[x][y].setAlive();
            return true;
        } catch (Exception e) {
            return false;
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

    int summer(int i, int j){
        int sum = -1;
        int x = i - 1;
        int y = j - 1;
        int m = 3, n = 3;
        while (m > 0){
            while (n > 0){
                try{
                    if (x < 0 || y < 0) {
                        n--;
                        y++;
                        continue;
                    } else if (x > length || y >= width){
                        break;
                    } else if (allcells[x][y].isAlive()) {
                        sum++;
                    }
                } catch (ArrayIndexOutOfBoundsException e){};
                y++;
                n--;
            }
            y = j - 1;
            x++;
            n = 3;
            m--;
        }

        return sum;
    }

    public boolean flush(){
        int sum = 0;
        for (int i = 0; i< length; i++){
            for (int j = 0; j < width; j++){
                if (allcells[i][j].isAlive()){
                    sum = summer(i, j);
                    if (sum == 0 || sum == 1) {
                        allcells[i][j].setDie();
                    } else if (sum > 3) {
                        allcells[i][j].setDie();
                    }
                } else {
                    sum = summer(i, j);
                    if (sum == 2) {
                        allcells[i][j].setAlive();
                    }
                }
            }
        }
        return true;
    }
}
