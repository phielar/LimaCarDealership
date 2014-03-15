package philaman.cput.limacardealers.model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author phila
 */
public class CommisionTest {

    private static Commission comm;

    public CommisionTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void create() {
        comm = new Commission.Builder("1254").commission(5000)
                .build();
        Assert.assertEquals("1254", comm.getId());
        Assert.assertEquals(5000.0, comm.getCommission());
    }

    @Test
    public void update() {
        SalesGrade rate = new SalesGrade.Builder("1254").rate(0.15).Builder();
        comm = new Commission.Builder("1254").rate(rate).build();
        Assert.assertEquals("1254", comm.getId());
        Assert.assertEquals(rate, comm.getRate());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
}