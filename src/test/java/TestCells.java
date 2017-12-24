import junit.framework.TestCase;
import cn.hcven.Cells;

public class TestCells extends TestCase{
    Cells cells = new Cells();
    public void testSetAlive(){
        boolean truth = cells.setAlive();
        assertTrue(truth);
    }
    public void testSetDie(){
        boolean truth = cells.setDie();
        assertTrue(truth);
    }

}
