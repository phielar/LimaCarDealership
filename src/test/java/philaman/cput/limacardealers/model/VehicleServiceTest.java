/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.model;

import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author phila
 */
public class VehicleServiceTest {

    public VehicleServiceTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    private static VehicleService car;

    @Test
    public void createTest() {
        List<VehicleType> cartype = new ArrayList<>();
        cartype.add(new VehicleType.Builder("ca4452").getType("minitruck").build());
        Mechenic mac = new Mechenic.Builder("1245we").speciality("Engines")
                .vType(cartype).build();
        Vehicle trans = new Vehicle.Builder("ca4452").name("BMW-Dolphine").year("1999").Builder();
        car = new VehicleService.Builder("5454").vehicle(trans).mac(mac).serviceDate("14/06/2015")
                .serviceReport("The car is working just fine.").build();
        Assert.assertEquals("ca4452", car.getCar().getV_id());
        Assert.assertEquals("1245we", car.getMac().getId());
        Assert.assertEquals("The car is working just fine.", car.getServiceReport());

    }

    @Test
    public void updateTest() {   //create new Service instance
        List<VehicleType> cartype = new ArrayList<>();
        cartype.add(new VehicleType.Builder("ca4452").getType("minitruck").build());
        Mechenic mac = new Mechenic.Builder("1245").speciality("Engines")
                .vType(cartype).build();
        Vehicle trans = new Vehicle.Builder("ca4452").name("BMW-Dolphine").year("1999").Builder();
        car = new VehicleService.Builder("5454").vehicle(trans).mac(mac).serviceDate("14/06/2015")
                .serviceReport("The car is working just fine.").build();
        //update new Service instance
        mac = new Mechenic.Builder("1245").speciality("Body welding").vType(cartype).build();
        car = new VehicleService.Builder("5454").vehicle(trans).mac(mac).serviceDate("14/06/2015")
                .serviceReport("The car is working just fine.").build();
        Assert.assertEquals("ca4452", car.getCar().getV_id());
        Assert.assertEquals("1245", car.getMac().getId());
        Assert.assertEquals("Body welding", car.getMac().getSpeciality());
        Assert.assertEquals("The car is working just fine.", car.getServiceReport());


    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
}