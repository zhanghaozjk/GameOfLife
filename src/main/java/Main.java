package cn.hcven;

public class Main {

    public static void main(String[] args) {
        AllCells cells = new AllCells(8,8);

        cells.setAlive(3, 2);
        cells.setAlive(2, 3);
        cells.setAlive(2, 2);
        cells.setAlive(3, 3);
        cells.setAlive(1, 3);

        System.out.println("==========Init==========");
        cells.print();
        while (true) {
            System.out.println("============NEW STATUS===========");
            cells.flush();
            cells.print();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
