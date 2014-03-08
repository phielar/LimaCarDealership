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
import philaman.cput.limacardealers.Model.Address;

/**
 *
 * @author phila
 */
public class AddressTest {

    public AddressTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    private static ApplicationContext axct;
    private static Address address;

    @Test
    public void createAddress() {
        address=(Address)axct.getBean("address");
        //create new Address
        address = new Address.Builder("L65 new Flats room 25").id("3456")
                .street("Rhodes Street")
                .suburb("Langa")
                .city("Cape Town")
                .province("Western Cape")
                .postalCode("7445")
                .builder();
        Assert.assertEquals("L65 new Flats room 25", address.getHouseNumber());
        Assert.assertEquals("Rhodes Street", address.getStreet());
        Assert.assertEquals("Langa", address.getSuburb());
        Assert.assertEquals("Western Cape", address.getProvince());
        Assert.assertEquals("7445", address.getPostalCode());
    }

    @Test
    public void updateAddress() {
        address=(Address)axct.getBean("address");
        //create new Address
        address = new Address.Builder("L65 new Flats room 25").id("3456")
                .street("Rhodes Street")
                .suburb("Langa")
                .city("Cape Town")
                .province("Western Cape")
                .postalCode("7445")
                .builder();
        //Updating the Address 
        address = new Address.Builder("19 Zone 2").id("3456")
                .street("Sabatadalityhebo Street")
                .suburb("Langa")
                .city("Cape Town")
                .province("Western Cape")
                .postalCode("7445")
                .builder();

        Assert.assertEquals("19 Zone 2", address.getHouseNumber());
        Assert.assertEquals("Sabatadalityhebo Street", address.getStreet());
        Assert.assertEquals("Langa", address.getSuburb());
        Assert.assertEquals("Western Cape", address.getProvince());
        Assert.assertEquals("7445", address.getPostalCode());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        axct=new AnnotationConfigApplicationContext(AppConfig.class);
    }
}