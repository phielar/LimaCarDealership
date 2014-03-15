/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author phila
 */
public class VehicleTest {

    public VehicleTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    private static Vehicle car;

    @Test
    public void createTest() {
        VehicleBrand brand = new VehicleBrand.Builder("12542e").name("Dogde")
                .country("Amarica").builder();
        VehicleType type = new VehicleType.Builder("1231").getType("sedan").build();
        List<VehicleColour> color = new ArrayList<>();
        color.add(new VehicleColour.Builder("12").colSection("Top").color("Black").builder());
        color.add(new VehicleColour.Builder("12").colSection("Body").color("white").builder());
        color.add(new VehicleColour.Builder("12").colSection("Trim").color("Black").builder());
        car = new Vehicle.Builder("1232jh").brand(brand).carType(type).carColor(color)
                .model("Ve8").name("Dogde Nitro").year("2012").Builder();
        //------assert tests
        Assert.assertEquals("Dogde Nitro", car.getName());
        Assert.assertEquals("white", car.getCarColor().get(1).getColor());
        Assert.assertEquals("Dogde Nitro", car.getName());
        Assert.assertEquals("2012", car.getYear());
        Assert.assertEquals("Amarica", car.getBrand().getCountry());
    }

    @Test
    public void updateTest() {
        //-------------creating a new vehicle instance
        VehicleBrand brand = new VehicleBrand.Builder("12542e").name("Dogde")
                .country("Amarica").builder();
        VehicleType type = new VehicleType.Builder("1231").getType("sedan").build();
        List<VehicleColour> color = new ArrayList<>();
        color.add(new VehicleColour.Builder("12").colSection("Top").color("Black").builder());
        color.add(new VehicleColour.Builder("12").colSection("Body").color("white").builder());
        color.add(new VehicleColour.Builder("12").colSection("Trim").color("Black").builder());
        car = new Vehicle.Builder("1232jh").brand(brand).carType(type).carColor(color)
                .model("Ve8").name("Dogde Nitro").year("2012").Builder();
        //-------------updating a vehicle info
        color.clear();
        color.add(new VehicleColour.Builder("12").colSection("Top").color("Black").builder());
        color.add(new VehicleColour.Builder("12").colSection("Body").color("Blue").builder());
        color.add(new VehicleColour.Builder("12").colSection("Trim").color("white").builder());
        car = new Vehicle.Builder("1232jh").brand(brand).carType(type).carColor(color)
                .model("Ve8").name("Dogde Nitro").year("2013").Builder();
        //----------Assert tests
        Assert.assertEquals("Dogde Nitro", car.getName());
        Assert.assertEquals("Blue", car.getCarColor().get(1).getColor());
        Assert.assertEquals("Dogde Nitro", car.getName());
        Assert.assertEquals("2013", car.getYear());
        Assert.assertEquals("Amarica", car.getBrand().getCountry());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
}