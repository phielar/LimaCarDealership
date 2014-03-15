package philaman.cput.limacardealers.model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import junit.framework.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author phila
 */
public class SalesPersonSalHistoryTest {

    public SalesPersonSalHistoryTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    private static SalesPersonSalHistory salHistory;

    @Test
    public void createTest() {
        SalesPerson sales = new SalesPerson.Builder("2134532").build();
        salHistory = new SalesPersonSalHistory.Builder("2154").salesMan(sales).personalSaleRecord(20)
                .startDate("28-may-2013")
                .personalSaleRecordDate("30-jul-2013").Build();
        Assert.assertEquals("2134532", salHistory.getSalesMan().getEmpNumber());
        Assert.assertEquals("30-jul-2013", salHistory.getPersonalSaleRecordDate());
    }

    @Test
    public void updateTest() {
        SalesPerson sales = new SalesPerson.Builder("2134532").build();
        salHistory = new SalesPersonSalHistory.Builder("2154").salesMan(sales).personalSaleRecord(20)
                .startDate("28-may-2013")
                .personalSaleRecordDate("30-jul-2013").Build();

        salHistory = new SalesPersonSalHistory.Builder("2154").salesMan(sales).personalSaleRecord(30)
                .startDate("28-may-2013")
                .personalSaleRecordDate("30-Nov-2013").Build();
        Assert.assertEquals("2134532", salHistory.getSalesMan().getEmpNumber());
        Assert.assertEquals("30-Nov-2013", salHistory.getPersonalSaleRecordDate());
        Assert.assertEquals(30, salHistory.getPersonalSaleRecord());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
   }
}