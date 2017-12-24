import cn.hcven.AllCells;
import junit.framework.TestCase;

public class TestAllCells extends TestCase{
    AllCells cells = new AllCells(10,10);

    public void testPrint(){
        boolean truth = cells.print();
        assertTrue(truth);
    }

    public void testFlush(){
        boolean truth = cells.flush();
        assertTrue(truth);
    }

    public void testSetAlive(){
        cells.setAlive(7, 9);
        boolean truth = false;
        if (cells.getStatus(7, 9))
            truth = true;
        assertTrue(truth);
    }

    public void testSummer(){
        cells.setAlive(7, 9);
        int expSum = 0;
        int sum = cells.summer(7, 8);
        assertEquals(expSum, sum);
    }

}
