/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service;

import java.util.ArrayList;
import java.util.List;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import philaman.cput.limacardealers.model.Address;
import philaman.cput.limacardealers.model.Branch;
import philaman.cput.limacardealers.model.Region;
import philaman.cput.limacardealers.service.crud.RegionCrudService;

/**
 *
 * @author phila
 */
public class RegionTestCrudService {

    @Mock
    private static RegionCrudService crudService;

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(RegionCrudService.class);
    }

    @Test
    public void testCreate() {
        Address addrss = new Address.Builder("19 Zone 2").id("3456")
                .street("Sabatadalityhebo Street")
                .suburb("Langa")
                .city("Cape Town")
                .province("Western Cape")
                .postalCode("7445")
                .builder();
        List<Branch> brnch = new ArrayList<>();
        brnch.add(new Branch.Builder("wC2154").branchname("CapeGate").branchYTDSales(50).build());
        Region loc = new Region.Builder("12154").locationDescription("Cape Gate Mall opposote Shell Garage")
                .address(addrss).branch(brnch).build();
        Region returnRegion = crudService.persist(loc);
        when(crudService.persist(loc)).thenReturn(returnRegion);
        Mockito.verify(crudService).persist(loc);
    }

    @Test
    public void testRead() {
        Address addrss = new Address.Builder("19 Zone 2").id("3456")
                .street("Sabatadalityhebo Street")
                .suburb("Langa")
                .city("Cape Town")
                .province("Western Cape")
                .postalCode("7445")
                .builder();
        List<Branch> brnch = new ArrayList<>();
        brnch.add(new Branch.Builder("wC2154").branchname("CapeGate").branchYTDSales(50).build());
        Region loc = new Region.Builder("12154").locationDescription("Cape Gate Mall opposote Shell Garage")
                .address(addrss).branch(brnch).build();
        Region returnRegion = crudService.find(loc.getLocationCode());
        when(crudService.find(loc.getLocationCode())).thenReturn(returnRegion);
        Mockito.verify(crudService).find(loc.getLocationCode());
    }

    @Test
    public void testUpdate() {
        //---------------creating new instance
        Address addrss = new Address.Builder("19 Zone 2").id("3456")
                .street("Sabatadalityhebo Street")
                .suburb("Langa")
                .city("Cape Town")
                .province("Western Cape")
                .postalCode("7445")
                .builder();
        List<Branch> brnch = new ArrayList<>();
        brnch.add(new Branch.Builder("wC2154").branchname("CapeGate").branchYTDSales(50).build());
        Region loc = new Region.Builder("12154").locationDescription("Cape Gate Mall opposote Shell Garage")
                .address(addrss).branch(brnch).build();
        Region returnRegion = crudService.persist(loc);
        //------------update------------------
        brnch.add(new Branch.Builder("wC2154").branchname("Century Gate").branchYTDSales(50).build());
        loc = new Region.Builder("12154").locationDescription("Cape Gate Mall opposote Engine Garage")
                .address(addrss).branch(brnch).build();
        returnRegion = crudService.merge(loc);
        when(crudService.merge(loc)).thenReturn(returnRegion);
        Mockito.verify(crudService).merge(loc);
    }

    @Test
    public void testDelete() {
        Address addrss = new Address.Builder("19 Zone 2").id("3456")
                .street("Sabatadalityhebo Street")
                .suburb("Langa")
                .city("Cape Town")
                .province("Western Cape")
                .postalCode("7445")
                .builder();
        List<Branch> brnch = new ArrayList<>();
        brnch.add(new Branch.Builder("wC2154").branchname("CapeGate").branchYTDSales(50).build());
        Region loc = new Region.Builder("12154").locationDescription("Cape Gate Mall opposote Shell Garage")
                .address(addrss).branch(brnch).build();
        Region returnRegion = crudService.remove(loc);
        when(crudService.remove(loc)).thenReturn(returnRegion);
        Mockito.verify(crudService).remove(loc);
    }
}