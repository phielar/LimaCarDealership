package philaman.cput.limacardealers.Model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import philaman.cput.limacardealers.Config.AppConfig;
import philaman.cput.limacardealers.Model.VehicleType;

/**
 *
 * @author phila
 */
//private static 
public class VehicleTypeTest {

    private static ApplicationContext axct;
    private static VehicleType vtype;

    public VehicleTypeTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void crateTest() {
        vtype = (VehicleType) axct.getBean("vehicleType");
        vtype = new VehicleType.Builder("gv457887").getType("Sedan").build();
        Assert.assertEquals("gv457887", vtype.getId());
        Assert.assertEquals("Sedan", vtype.getType());
    }

    @Test
    public void updateTest() {
        vtype = (VehicleType) axct.getBean("vehicleType");
        vtype = new VehicleType.Builder("gv457887").getType("Sedan").build();
        vtype = new VehicleType.Builder("gv437887").getType("miniVan").build();
        Assert.assertEquals("gv437887", vtype.getId());
        Assert.assertEquals("miniVan", vtype.getType());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        axct = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}