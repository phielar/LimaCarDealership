/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.model;

import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author phila
 */
public class MechenicTest {

    public MechenicTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    private static Mechenic mec;

    @Test
    public void createTest() {
        List<VehicleType> type = new ArrayList<>();
        type.add(new VehicleType.Builder("2").getType("vans").build());
        mec = new Mechenic.Builder("1234").speciality("Engines").vType(type).build();
        Assert.assertEquals("1234", mec.getId());
        Assert.assertEquals("vans", mec.getType().get(0).getType());
        Assert.assertEquals("Engines", mec.getSpeciality());

    }

    @Test
    public void updateTest() {   //-----------------Create a mechenic entity
        List<VehicleType> type = new ArrayList<>();
        type.add(new VehicleType.Builder("2").getType("vans").build());
        mec = new Mechenic.Builder("1234").speciality("Engines").vType(type).build();
        //----------------updating a mechenic entity
        type.clear();
        type.add(new VehicleType.Builder("2").getType("MiniTrucs").build());
        mec = new Mechenic.Builder("1234").speciality("Engines").vType(type).build();
        //----------------AssertTests
        Assert.assertEquals("1234", mec.getId());
        Assert.assertEquals("MiniTrucs", mec.getType().get(0).getType());
        Assert.assertEquals("Engines", mec.getSpeciality());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
}
