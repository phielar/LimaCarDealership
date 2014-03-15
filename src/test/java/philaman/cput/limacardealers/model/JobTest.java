/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.model;

import philaman.cput.limacardealers.model.Job;
import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author phila
 */
public class JobTest {
    
    public JobTest() {
    }
    private static  Job work;
    @Test
    public void createTest()
    {    work=new Job.Builder("1145jw").jobDescription("Technician").basicSalary(7000.00).build();
         Assert.assertEquals("1145jw", work.getJobid());
         Assert.assertEquals("Technician", work.getJobDescription());
         Assert.assertEquals(7000.0, work.getBasicSalary(), 0.00001);
    }
    @Test
    public void updateTest()                    
    {    
         //-----------------create---------------------------
        work=new Job.Builder("1145jw").jobDescription("Technician").basicSalary(7000.00).build();
         //------------------update---------------------------
         work=new Job.Builder("1145jw").jobDescription("Programmer").basicSalary(30000.00).build();
         Assert.assertEquals("1145jw", work.getJobid());
         Assert.assertEquals("Programmer", work.getJobDescription());
         Assert.assertEquals(30000.0, work.getBasicSalary(), 0.00001);
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
}