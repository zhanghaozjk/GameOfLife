import cn.hcven.AllCells;
import junit.framework.TestCase;

public class TestAllCells extends TestCase{
    AllCells cells = new AllCells();
    public void testPrint(){
        boolean truth = cells.print();
        assertTrue(truth);
    }
}
