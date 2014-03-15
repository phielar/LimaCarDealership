package philaman.cput.limacardealers.model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import philaman.cput.limacardealers.model.Branch;
import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
   
    private static Branch branch ;
    @Test
    public void createTest()
    {
        
        branch=new Branch.Builder("wC2154").branchname("CapeGate")
                         .branchYTDSales(50).build();
        Assert.assertEquals("wC2154", branch.getBranchCode());
        Assert.assertEquals(50, branch.getBranchYTDSales());
        Assert.assertEquals("CapeGate", branch.getBranchname());
    }
    @Test
    public void updateTest()
    {
        
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
        
    }
}