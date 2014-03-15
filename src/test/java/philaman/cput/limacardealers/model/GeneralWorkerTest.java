/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.model;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author phila
 */
public class GeneralWorkerTest {
    
    public GeneralWorkerTest() {
    }
    private static GeneralWorker gw;
    @Test
    public void createTest()
    {   gw=new GeneralWorker.Builder("5454").hoursWorked(54).rate(25).build();
        Assert.assertEquals("5454", gw.getId());
        Assert.assertEquals(54, gw.getHoursWorked());
        Assert.assertEquals(25.0, gw.getRate());
    }
    @Test
    public void updateTest()
    {   //create
        gw=new GeneralWorker.Builder("5454").hoursWorked(54).rate(25).build();
        
        //update
        gw=new GeneralWorker.Builder("5454").hoursWorked(50).rate(52).build();
        Assert.assertEquals("5454", gw.getId());
        Assert.assertEquals(50, gw.getHoursWorked());
        Assert.assertEquals(52.0, gw.getRate());
    }
}