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
import philaman.cput.limacardealers.model.VehicleBrand;
import philaman.cput.limacardealers.service.crud.VehicleBrandCrudService;

/**
 *
 * @author phila
 */
public class VehicleBrandTestCrudService {
    
    @Mock
    private static VehicleBrandCrudService crudService;
    
    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(VehicleBrandCrudService.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        VehicleBrand brandtype = new VehicleBrand.Builder("BmW1254sc").name("BMW")
                .country("Germany").builder();
        VehicleBrand returnBrand = crudService.persist(brandtype);
        when(crudService.persist(brandtype)).thenReturn(returnBrand);
        Mockito.verify(crudService).persist(brandtype);
    }
    
    @Test
    public void testRead() throws Exception {
        VehicleBrand brandtype = new VehicleBrand.Builder("BmW1254sc").name("BMW")
                .country("Germany").builder();
        VehicleBrand returnBrand = crudService.find(brandtype.getId());
        when(crudService.find(brandtype.getId())).thenReturn(returnBrand);
        Mockito.verify(crudService).find(brandtype.getId());
    }
    
    @Test
    public void tesUpdate() throws Exception {
        //----------create new
        VehicleBrand brandtype = new VehicleBrand.Builder("BmW1254sc").name("BMW")
                .country("Germany").builder();
        VehicleBrand returnBrand = crudService.persist(brandtype);
        //----------update
        brandtype = new VehicleBrand.Builder("BmW1254sc").name("BMW & Mini")
                .country("Germany").builder();
        returnBrand = crudService.merge(brandtype);
        when(crudService.merge(brandtype)).thenReturn(returnBrand);
        Mockito.verify(crudService).merge(brandtype);
    }
    
    @Test
    public void testDelete() throws Exception {
        VehicleBrand brandtype = new VehicleBrand.Builder("BmW1254sc").name("BMW")
                .country("Germany").builder();
        VehicleBrand returnBrand = crudService.remove(brandtype);
        when(crudService.remove(brandtype)).thenReturn(returnBrand);
        Mockito.verify(crudService).remove(brandtype);
    }
}