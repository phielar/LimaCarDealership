package philaman.cput.limacardealers.Model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import philaman.cput.limacardealers.Config.AppConfig;

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
    private static ApplicationContext axct;
    private static SalesPersonSalHistory salHistory;
/*
    @Test
    public void createTest() {
        salHistory = (SalesPersonSalHistory) axct.getBean("salhistory");
        SalesPerson sales = new SalesPerson.Builder("2134532").Builder();
        salHistory = new SalesPersonSalHistory.Builder("2154").salesMan(sales).personalSaleRecord(20)
                .startDate("28-may-2013")
                .personalSaleRecordDate("30-jul-2013").Builder();
        Assert.assertEquals("2134532", salHistory.getSalesMan().getEmpNumber());
        Assert.assertEquals("30-jul-2013", salHistory.getPersonalSaleRecordDate());
    }

    @Test
    public void updateTest() {
        salHistory = (SalesPersonSalHistory) axct.getBean("salhistory");
        SalesPerson sales = new SalesPerson.Builder("2134532").Builder();
        salHistory = new SalesPersonSalHistory.Builder("2154").salesMan(sales).personalSaleRecord(20)
                .startDate("28-may-2013")
                .personalSaleRecordDate("30-jul-2013").Builder();

        salHistory = new SalesPersonSalHistory.Builder("2154").salesMan(sales).personalSaleRecord(30)
                .startDate("28-may-2013")
                .personalSaleRecordDate("30-Nov-2013").Builder();
        Assert.assertEquals("2134532", salHistory.getSalesMan().getEmpNumber());
        Assert.assertEquals("30-Nov-2013", salHistory.getPersonalSaleRecordDate());
        Assert.assertEquals(30, salHistory.getPersonalSaleRecord());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        axct = new AnnotationConfigApplicationContext(AppConfig.class);
    }*/
}