/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service;

import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import philaman.cput.limacardealers.model.Address;
import philaman.cput.limacardealers.model.Customer;
import philaman.cput.limacardealers.service.crud.BranchCrudService;
import philaman.cput.limacardealers.service.crud.CustomerCrudService;

/**
 *
 * @author phila
 */
public class CustomerTestCrudService {
    @Mock
    private static CustomerCrudService crudService;
    private static Customer customer;
    
    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(CustomerCrudService.class);
    }
    @Test
    public void testCreate() throws Exception {
         Address addrss = new Address.Builder("L65 new Flats room 25").id("3456")
                .street("Rhodes Street").suburb("Langa").city("Cape Town")
                 .province("Western Cape").postalCode("7445").builder();
        customer = new Customer.Builder("1254").firstname("Philasande")
                .lastname("Manyika").gender("Male").phoneNumber("0786647894")
                .address(addrss).custEmpNumber("12548").salary(50000.00)
                .build();
        Customer returnCust=crudService.persist(customer);
        when(crudService.persist(customer)).thenReturn(returnCust);
        Mockito.verify(crudService).persist(customer);
     }
    @Test
    public void testRead() throws Exception {
         Address addrss = new Address.Builder("L65 new Flats room 25").id("3456")
                .street("Rhodes Street").suburb("Langa").city("Cape Town")
                 .province("Western Cape").postalCode("7445").builder();
        customer = new Customer.Builder("1254").firstname("Philasande")
                .lastname("Manyika").gender("Male").phoneNumber("0786647894")
                .address(addrss).custEmpNumber("12548").salary(50000.00)
                .build();
        Customer returnCust=crudService.find(customer.getCustid());
        when(crudService.find(customer.getCustid())).thenReturn(returnCust);
        Mockito.verify(crudService).find(customer.getCustid());
     }
    @Test
    public void testUpdate() throws Exception {
         Address addrss = new Address.Builder("L65 new Flats room 25").id("3456")
                .street("Rhodes Street").suburb("Langa").city("Cape Town")
                 .province("Western Cape").postalCode("7445").builder();
        customer = new Customer.Builder("1254").firstname("Philasande")
                .lastname("Manyika").gender("Male").phoneNumber("0786647894")
                .address(addrss).custEmpNumber("12548").salary(50000.00)
                .build();
        Customer returnCust=crudService.persist(customer);
        customer = new Customer.Builder("1254").firstname("Philasande")
                .lastname("Manyika").gender("Male").phoneNumber("0786647894")
                .address(addrss).custEmpNumber("12548").salary(50000.00)
                .build();
        when(crudService.merge(customer)).thenReturn(returnCust);
        Mockito.verify(crudService).merge(customer);
     }
    
    @Test
    public void testDelete() throws Exception {
         Address addrss = new Address.Builder("L65 new Flats room 25").id("3456")
                .street("Rhodes Street").suburb("Langa").city("Cape Town")
                 .province("Western Cape").postalCode("7445").builder();
        customer = new Customer.Builder("1254").firstname("Philasande")
                .lastname("Manyika").gender("Male").phoneNumber("0786647894")
                .address(addrss).custEmpNumber("12548").salary(50000.00)
                .build();
        Customer returnCust=crudService.remove(customer);
        when(crudService.remove(customer)).thenReturn(returnCust);
        Mockito.verify(crudService).remove(customer);
     }
    
}