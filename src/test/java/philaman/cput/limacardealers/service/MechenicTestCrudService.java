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
import philaman.cput.limacardealers.model.Mechenic;
import philaman.cput.limacardealers.model.VehicleType;
import philaman.cput.limacardealers.service.crud.MechenicCrudService;

/**
 *
 * @author phila
 */
public class MechenicTestCrudService {
    @Mock
    private static MechenicCrudService crudService;
    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(MechenicCrudService.class);
    }
    @Test
    public void testCreate()  throws Exception     {
        List<VehicleType> type = new ArrayList<>();
        type.add(new VehicleType.Builder("2").getType("vans").build());
        Mechenic mec = new Mechenic.Builder("1234").speciality("Engines").vType(type).build();
        Mechenic returnMec=crudService.persist(mec);
        when(crudService.persist(mec)).thenReturn(returnMec);
        Mockito.verify(crudService).persist(mec);
    }
     @Test
    public void testRead() throws Exception     {
        List<VehicleType> type = new ArrayList<>();
        type.add(new VehicleType.Builder("2").getType("vans").build());
        Mechenic mec = new Mechenic.Builder("1234").speciality("Engines").vType(type).build();
        Mechenic returnMec=crudService.find(mec.getId());
        when(crudService.find(mec.getId())).thenReturn(returnMec);
        Mockito.verify(crudService).find(mec.getId());
    }
    @Test
    public void testUpdate()  throws Exception     {
        //====create new
        List<VehicleType> type = new ArrayList<>();
        type.add(new VehicleType.Builder("2").getType("vans").build());
        Mechenic mec = new Mechenic.Builder("1234").speciality("Engines").vType(type).build();
        Mechenic returnMec=crudService.persist(mec);
        //------update------
        mec = new Mechenic.Builder("1234").speciality("Engines & Electricity").vType(type).build();
        when(crudService.merge(mec)).thenReturn(returnMec);
        Mockito.verify(crudService).merge(mec);
    }
    @Test
    public void testDelete() throws Exception     {
        List<VehicleType> type = new ArrayList<>();
        type.add(new VehicleType.Builder("2").getType("vans").build());
        Mechenic mec = new Mechenic.Builder("1234").speciality("Engines").vType(type).build();
        Mechenic returnMec=crudService.remove(mec);
        when(crudService.remove(mec)).thenReturn(returnMec);
        Mockito.verify(crudService).remove(mec);
    }
            
}