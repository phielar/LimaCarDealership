package philaman.cput.limacardealers.Model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Assert;
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
public class BranchTest {
    
    public BranchTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    private static ApplicationContext axct;
    private static Branch branch ;
    @Test
    public void createTest()
    {
        branch=(Branch)axct.getBean("branch");
        branch=new Branch.Builder("wC2154").branchname("CapeGate")
                         .branchYTDSales(50).build();
        Assert.assertEquals("wC2154", branch.getBranchCode());
        Assert.assertEquals(50, branch.getBranchYTDSales());
        Assert.assertEquals("CapeGate", branch.getBranchname());
    }
    @Test
    public void updateTest()
    {
        branch=(Branch)axct.getBean("branch");
        branch=new Branch.Builder("wC2154").branchname("CapeGate")
                         .branchYTDSales(50).build();
        branch=new Branch.Builder("wC2154").branchname("CapeVille")
                         .branchYTDSales(58).build();
        Assert.assertEquals("wC2154", branch.getBranchCode());
        Assert.assertEquals(58, branch.getBranchYTDSales());
        Assert.assertEquals("CapeVille", branch.getBranchname());
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
        axct=new AnnotationConfigApplicationContext(AppConfig.class);
    }
}