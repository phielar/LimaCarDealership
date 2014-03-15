/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.model;

import philaman.cput.limacardealers.model.VehicleColour;
import junit.framework.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author phila
 */
public class VehicleColourTest {

    public VehicleColourTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    private static VehicleColour carColor;

    @Test
    public void creatTest() {
        carColor = new VehicleColour.Builder("1254").colSection("Top")
                .color("Silver").builder();
        Assert.assertEquals("1254", carColor.getId());
        Assert.assertEquals("Top", carColor.getColSection());
        Assert.assertEquals("Silver", carColor.getColor());
    }

    @Test
    public void updateTest() {
        carColor = new VehicleColour.Builder("1254").colSection("Top")
                .color("Silver").builder();
        carColor = new VehicleColour.Builder("1254").colSection("Top")
                .color("Red").builder();
        Assert.assertEquals("1254", carColor.getId());
        Assert.assertEquals("Top", carColor.getColSection());
        Assert.assertEquals("Red", carColor.getColor());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
}