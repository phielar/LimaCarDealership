/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.model;

import philaman.cput.limacardealers.model.VehicleBrand;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author phila
 */
public class VehicleBrandTest {

    public VehicleBrandTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     private static VehicleBrand brandtype;

    @Test
    public void createTest() {
         brandtype = new VehicleBrand.Builder("BmW1254sc").name("BMW")
                .country("Germany").builder();
        Assert.assertEquals(brandtype.getId(), "BmW1254sc");
        Assert.assertEquals(brandtype.getName(), "BMW");
        Assert.assertEquals(brandtype.getCountry(), "Germany");
    }

    @Test
    public void updateTest() {
        //Creation of a new Object
        brandtype = new VehicleBrand.Builder("BmW1254sc").name("BMW")
                .country("Germany").builder();
        //Modification of the object
        brandtype = new VehicleBrand.Builder("BmW1254mn").name("BMW and MINI")
                .country("Germany").builder();
        Assert.assertEquals(brandtype.getId(), "BmW1254mn");
        Assert.assertEquals(brandtype.getName(), "BMW and MINI");
        Assert.assertEquals(brandtype.getCountry(), "Germany");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
}