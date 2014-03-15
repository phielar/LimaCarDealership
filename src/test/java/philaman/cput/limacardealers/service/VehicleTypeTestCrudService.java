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
import philaman.cput.limacardealers.model.VehicleType;
import philaman.cput.limacardealers.service.crud.VehicleTypeCrudService;

/**
 *
 * @author phila
 */
public class VehicleTypeTestCrudService {

    @Mock
    private static VehicleTypeCrudService crudService;

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(VehicleTypeCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        VehicleType vtype = new VehicleType.Builder("gv457887").getType("Sedan").build();
        VehicleType returnType = crudService.persist(vtype);
        when(crudService.persist(vtype)).thenReturn(returnType);
        Mockito.verify(crudService).persist(vtype);
    }

    @Test
    public void testRead() throws Exception {
        VehicleType vtype = new VehicleType.Builder("gv457887").getType("Sedan").build();
        VehicleType returnType = crudService.find(vtype.getId());
        when(crudService.find(vtype.getId())).thenReturn(returnType);
        Mockito.verify(crudService).find(vtype.getId());
    }

    @Test
    public void testUpdate() throws Exception {
        //------------adding  new type
        VehicleType vtype = new VehicleType.Builder("gv457887").getType("Sedan").build();
        VehicleType returnType = crudService.persist(vtype);
        //-------------updating car type info
        vtype = new VehicleType.Builder("gv457887").getType("Mini Truck").build();
        returnType = crudService.merge(vtype);
        when(crudService.merge(vtype)).thenReturn(returnType);
        Mockito.verify(crudService).merge(vtype);
    }

    @Test
    public void testDelete() throws Exception {
        VehicleType vtype = new VehicleType.Builder("gv457887").getType("Sedan").build();
        VehicleType returnType = crudService.remove(vtype);
        when(crudService.remove(vtype)).thenReturn(returnType);
        Mockito.verify(crudService).remove(vtype);
    }
}