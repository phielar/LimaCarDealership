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
import philaman.cput.limacardealers.service.crud.AddressCrudService;

/**
 *
 * @author phila
 */
public class AddressTestCrudService {

    @Mock
    private static AddressCrudService crudService;

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(AddressCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Address addr1 = new Address.Builder("19 zone 2").street("Sabata Street").suburb("Langa")
                .city("Cape Town").province("WC").postalCode("7455").builder();
        Address returnAddress = crudService.persist(addr1);
        when(crudService.persist(addr1)).thenReturn(returnAddress);
        Mockito.verify(crudService).persist(addr1);
    }

    @Test
    public void testRead() throws Exception {
        Address addr1 = new Address.Builder("19 zone 2").street("Sabata Street").suburb("Langa")
                .city("Cape Town").province("WC").postalCode("7455").builder();
        Address returnAddress = crudService.find(addr1.getHouseNumber());
        when(crudService.find(addr1.getHouseNumber())).thenReturn(returnAddress);
        Mockito.verify(crudService).find(addr1.getHouseNumber());
    }

    @Test
    public void testUpdate() throws Exception {
        Address addr1 = new Address.Builder("19 zone 2").street("Sabata Street").suburb("Langa")
                .city("Cape Town").province("WC").postalCode("7455").builder();

        Address returnAddress = crudService.persist(addr1);

        addr1 = new Address.Builder("19 zone 3").street("Rhodes Street").suburb("Langa")
                .city("Cape Town").province("WC").postalCode("7455").builder();

        returnAddress = crudService.merge(addr1);
        when(crudService.merge(addr1)).thenReturn(returnAddress);
        Mockito.verify(crudService).merge(addr1);
    }

    @Test
    public void testDelete() throws Exception {
        Address addr1 = new Address.Builder("19 zone 2").street("Sabata Street").suburb("Langa")
                .city("Cape Town").province("WC").postalCode("7455").builder();
        Address returnAddress = crudService.remove(addr1);
        when(crudService.remove(addr1)).thenReturn(returnAddress);
        Mockito.verify(crudService).remove(addr1);
    }
}