/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.model;

import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author phila
 */
public class SalesPersonTest {

    public SalesPersonTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    private static SalesPerson salesman;

    @Test
    public void createTest() {
        SalesGrade grade = new SalesGrade.Builder("D").rate(20).Builder();
        List<Commission> com = new ArrayList<>();
        com.add(new Commission.Builder("123243").commission(5000).build());
        com.add(new Commission.Builder("123244").commission(10000).build());
        salesman = new SalesPerson.Builder("1254").grade(grade).comm(com)
                .salary(30000).build();
        Assert.assertEquals("D", salesman.getGrade().getGrade());
        Assert.assertEquals(10000.0, salesman.getComm().get(1).getCommission());

    }

    @Test
    public void updateTest() {
        //--------------creating a new sales man instance
        SalesGrade grade = new SalesGrade.Builder("D").rate(20).Builder();
        List<Commission> com = new ArrayList<>();
        com.add(new Commission.Builder("123243").commission(5000).build());
        com.add(new Commission.Builder("123244").commission(12000).build());
        salesman = new SalesPerson.Builder("1254").grade(grade).comm(com)
                .salary(30000).build();
//--------------updating a sales man second commission amount from 1000 to 12000
        Assert.assertEquals("D", salesman.getGrade().getGrade());
        Assert.assertEquals(12000.0, salesman.getComm().get(1).getCommission());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
}