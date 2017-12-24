package cn.hcven;

import cn.hcven.Cells;

public class Main {

    public static void main(String[] args) {
        Cells[][] allcells = new Cells[64][64];
        for (int i = 0; i < 64; i++) {
            for (int j = 0; j < 64; j++){
                allcells[i][j] = new Cells();
            }
        }
        allcells[13][23].setAlive();
        allcells[42][13].setAlive();
        allcells[10][45].setAlive();
        allcells[17][12].setAlive();
        allcells[10][20].setAlive();

        while (true) {
            System.out.println("============NEW STATUS===========");

            for (int i = 0; i < 64; i++){
                for (int j = 0; j < 64; j++){
                    if (allcells[i][j].isAlive()){
                        System.out.print('*');

                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println("");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
