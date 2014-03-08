/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.Model;

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
public class VehicleColorTest {

    public VehicleColorTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    private static ApplicationContext axct;
    private static VehicleColour carColor;

    @Test
    public void creatTest() {
        carColor = (VehicleColour) axct.getBean("vehicleColour");
        carColor = new VehicleColour.Builder("1254").colSection("Top")
                                    .color("Silver").builder();
        Assert.assertEquals("1254", carColor.getId());
        Assert.assertEquals("Top", carColor.getColSection());
        Assert.assertEquals("Silver", carColor.getColor());
    }
    @Test
    public void updateTest()
    {
        carColor = (VehicleColour) axct.getBean("vehicleColour");
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
        axct = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}