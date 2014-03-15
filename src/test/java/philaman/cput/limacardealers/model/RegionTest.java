/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.model;

import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author phila
 */
public class RegionTest {
    
    public RegionTest() {
    }
     private static Region loc;
    @Test
    public void createTest()
    {    Address addrss = new Address.Builder("19 Zone 2").id("3456")
                .street("Sabatadalityhebo Street")
                .suburb("Langa")
                .city("Cape Town")
                .province("Western Cape")
                .postalCode("7445")
                .builder();
         List<Branch> brnch=new ArrayList<>();
         brnch.add(new Branch.Builder("wC2154").branchname("CapeGate").branchYTDSales(50).build());
        loc=new Region.Builder("12154").locationDescription("Cape Gate Mall opposote Shell Garage")
                                       .address(addrss).branch(brnch).build();
        Assert.assertEquals("Cape Gate Mall opposote Shell Garage", loc.getLocationDescription());
        Assert.assertEquals("CapeGate", loc.getBranch().get(0).getBranchname());
    }
    @Test
    public void updateTest()
    {   Address addrss = new Address.Builder("19 Zone 2").id("3456")
                .street("Sabatadalityhebo Street")
                .suburb("Langa")
                .city("Cape Town")
                .province("Western Cape")
                .postalCode("7445")
                .builder();
         List<Branch> brnch=new ArrayList<>();
         brnch.add(new Branch.Builder("wC2154").branchname("CapeGate").branchYTDSales(50).build());
        loc=new Region.Builder("12154").locationDescription("Cape Gate Mall opposote Shell Garage")
                                       .address(addrss).branch(brnch).build();
        //update
        brnch.add(new Branch.Builder("wC2154").branchname("Century City").branchYTDSales(50).build());
        loc=new Region.Builder("12154").locationDescription("Cannal Walk opposote Century City Mall")
                                       .address(addrss).branch(brnch).build();
        Assert.assertEquals("Cannal Walk opposote Century City Mall", loc.getLocationDescription());
        Assert.assertEquals("Century City", loc.getBranch().get(1).getBranchname());
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
}