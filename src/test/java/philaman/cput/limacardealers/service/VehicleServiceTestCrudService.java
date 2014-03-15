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
import philaman.cput.limacardealers.model.Vehicle;
import philaman.cput.limacardealers.model.VehicleService;
import philaman.cput.limacardealers.model.VehicleType;
import philaman.cput.limacardealers.service.crud.VehicleServiceCrudService;

/**
 *
 * @author phila
 */
public class VehicleServiceTestCrudService {

    @Mock
    public static VehicleServiceCrudService crudService;

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(VehicleServiceCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        List<VehicleType> cartype = new ArrayList<>();
        cartype.add(new VehicleType.Builder("ca4452").getType("minitruck").build());
        Mechenic mac = new Mechenic.Builder("1245we").speciality("Engines")
                .vType(cartype).build();
        Vehicle trans = new Vehicle.Builder("ca4452").name("BMW-Dolphine").year("1999").Builder();
        VehicleService car = new VehicleService.Builder("5454").vehicle(trans).mac(mac).serviceDate("14/06/2015")
                .serviceReport("The car is working just fine.").build();
        VehicleService returnService = crudService.persist(car);
        when(crudService.persist(car)).thenReturn(returnService);
        Mockito.verify(crudService).persist(car);
    }

    @Test
    public void testRead() throws Exception {
        List<VehicleType> cartype = new ArrayList<>();
        cartype.add(new VehicleType.Builder("ca4452").getType("minitruck").build());
        Mechenic mac = new Mechenic.Builder("1245we").speciality("Engines")
                .vType(cartype).build();
        Vehicle trans = new Vehicle.Builder("ca4452").name("BMW-Dolphine").year("1999").Builder();
        VehicleService car = new VehicleService.Builder("5454").vehicle(trans).mac(mac).serviceDate("14/06/2015")
                .serviceReport("The car is working just fine.").build();
        VehicleService returnService = crudService.find(car.getCar().getV_id());
        when(crudService.find(car.getCar().getV_id())).thenReturn(returnService);
        Mockito.verify(crudService).find(car.getCar().getV_id());
    }

    @Test
    public void testUpdate() throws Exception {
        //------------create new
        List<VehicleType> cartype = new ArrayList<>();
        cartype.add(new VehicleType.Builder("ca4452").getType("minitruck").build());
        Mechenic mac = new Mechenic.Builder("1245we").speciality("Engines")
                .vType(cartype).build();
        Vehicle trans = new Vehicle.Builder("ca4452").name("BMW-Dolphine").year("1999").Builder();
        VehicleService car = new VehicleService.Builder("5454").vehicle(trans).mac(mac).serviceDate("14/06/2015")
                .serviceReport("The car is working just fine.").build();
        VehicleService returnService = crudService.persist(car);
        //------------update
        car = new VehicleService.Builder("5454").vehicle(trans).mac(mac).serviceDate("14/06/2015")
                .serviceReport("The car is working just fine, but had a petrol leakage.").build();
        returnService = crudService.merge(car);
        when(crudService.merge(car)).thenReturn(returnService);
        Mockito.verify(crudService).merge(car);
    }

    @Test
    public void testDelete() throws Exception {
        List<VehicleType> cartype = new ArrayList<>();
        cartype.add(new VehicleType.Builder("ca4452").getType("minitruck").build());
        Mechenic mac = new Mechenic.Builder("1245we").speciality("Engines")
                .vType(cartype).build();
        Vehicle trans = new Vehicle.Builder("ca4452").name("BMW-Dolphine").year("1999").Builder();
        VehicleService car = new VehicleService.Builder("5454").vehicle(trans).mac(mac).serviceDate("14/06/2015")
                .serviceReport("The car is working just fine.").build();
        VehicleService returnService = crudService.remove(car);
        when(crudService.remove(car)).thenReturn(returnService);
        Mockito.verify(crudService).remove(car);
    }
}