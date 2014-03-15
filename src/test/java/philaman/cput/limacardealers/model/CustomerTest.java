package philaman.cput.limacardealers.model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import philaman.cput.limacardealers.model.Customer;
import philaman.cput.limacardealers.model.Address;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author phila
 */
public class CustomerTest {

    public CustomerTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    private static Customer customer;

    @Test
    public void createTest() {
        Address addrss = new Address.Builder("L65 new Flats room 25").id("3456")
                .street("Rhodes Street")
                .suburb("Langa")
                .city("Cape Town")
                .province("Western Cape")
                .postalCode("7445")
                .builder();
        customer = new Customer.Builder("1254").firstname("Philasande")
                .lastname("Manyika").gender("Male")
                .phoneNumber("0786647894")
                .address(addrss)
                .custEmpNumber("12548")
                .salary(50000.00)
                .build();
        Assert.assertEquals("L65 new Flats room 25", customer.getAddress().getHouseNumber());
        Assert.assertEquals("12548", customer.getCustEmpNumber());
        Assert.assertEquals("Philasande", customer.getFirstname());
    }

    @Test
    public void updateTest() {
       Address addrss = new Address.Builder("L65 new Flats room 25").id("3456")
                .street("Rhodes Street")
                .suburb("Langa")
                .city("Cape Town")
                .province("Western Cape")
                .postalCode("7445")
                .builder();
        customer = new Customer.Builder("1254").firstname("Philasande")
                .lastname("Manyika").gender("Male")
                .phoneNumber("0786647894")
                .address(addrss)
                .custEmpNumber("12548")
                .salary(50000.00)
                .build();
        customer = new Customer.Builder("1254").firstname("Philasande")
                .lastname("Monile")
                .phoneNumber("0739552441")
                .address(addrss)
                .custEmpNumber("12548")
                .balance(0.0)
                .salary(50000)
                .build();
        Assert.assertEquals(customer.getPhoneNumber(), "0739552441");
        Assert.assertEquals(customer.getLastname(), "Monile");
        Assert.assertEquals(customer.getBalance(), 0.00);

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
       
    }
}