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
import philaman.cput.limacardealers.model.Vehicle;
import philaman.cput.limacardealers.model.VehicleBrand;
import philaman.cput.limacardealers.model.VehicleColour;
import philaman.cput.limacardealers.model.VehicleType;
import philaman.cput.limacardealers.service.crud.VehicleCrudService;

/**
 *
 * @author phila
 */
public class VehicleTestCrudService {
    
    @Mock
    private static VehicleCrudService crudService;
    
    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(VehicleCrudService.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        
        VehicleBrand brand = new VehicleBrand.Builder("12542e").name("Dogde")
                .country("Amarica").builder();
        VehicleType type = new VehicleType.Builder("1231").getType("sedan").build();
        List<VehicleColour> color = new ArrayList<>();
        //----------vehicle color sections
        color.add(new VehicleColour.Builder("12").colSection("Top").color("Black").builder());
        color.add(new VehicleColour.Builder("12").colSection("Body").color("white").builder());
        color.add(new VehicleColour.Builder("12").colSection("Trim").color("Black").builder());
        Vehicle car = new Vehicle.Builder("1232jh").brand(brand).carType(type).carColor(color)
                .model("Ve8").name("Dogde Nitro").year("2012").Builder();
        Vehicle returnCar = crudService.persist(car);
        when(crudService.persist(car)).thenReturn(returnCar);
        Mockito.verify(crudService).persist(car);
    }
    
    @Test
    public void testRead() throws Exception {
        
        VehicleBrand brand = new VehicleBrand.Builder("12542e").name("Dogde")
                .country("Amarica").builder();
        VehicleType type = new VehicleType.Builder("1231").getType("sedan").build();
        List<VehicleColour> color = new ArrayList<>();
        //----------vehicle color sections
        color.add(new VehicleColour.Builder("12").colSection("Top").color("Black").builder());
        color.add(new VehicleColour.Builder("12").colSection("Body").color("white").builder());
        color.add(new VehicleColour.Builder("12").colSection("Trim").color("Black").builder());
        Vehicle car = new Vehicle.Builder("1232jh").brand(brand).carType(type).carColor(color)
                .model("Ve8").name("Dogde Nitro").year("2012").Builder();
        Vehicle returnCar = crudService.find(car.getV_id());
        when(crudService.find(car.getV_id())).thenReturn(returnCar);
        Mockito.verify(crudService).find(car.getV_id());
    }
    
    @Test
    public void testUpdate() throws Exception {
        //----------------add new car
        VehicleBrand brand = new VehicleBrand.Builder("12542e").name("Dogde")
                .country("Amarica").builder();
        VehicleType type = new VehicleType.Builder("1231").getType("sedan").build();
        List<VehicleColour> color = new ArrayList<>();
        //----------vehicle color sections
        color.add(new VehicleColour.Builder("12").colSection("Top").color("Black").builder());
        color.add(new VehicleColour.Builder("12").colSection("Body").color("white").builder());
        color.add(new VehicleColour.Builder("12").colSection("Trim").color("Black").builder());
        Vehicle car = new Vehicle.Builder("1232jh").brand(brand).carType(type).carColor(color)
                .model("Ve8").name("Dogde Nitro").year("2012").Builder();
        Vehicle returnCar = crudService.persist(car);
        //-----------------update car info-
        car = new Vehicle.Builder("1232jh").brand(brand).carType(type).carColor(color)
                .model("Ve8").name("Dogde Caliba").year("2013").Builder();
        returnCar = crudService.merge(car);
        when(crudService.merge(car)).thenReturn(returnCar);
        Mockito.verify(crudService).merge(car);
    }
    
    @Test
    public void testDelete() throws Exception {
        
        VehicleBrand brand = new VehicleBrand.Builder("12542e").name("Dogde")
                .country("Amarica").builder();
        VehicleType type = new VehicleType.Builder("1231").getType("sedan").build();
        List<VehicleColour> color = new ArrayList<>();
        //----------vehicle color sections
        color.add(new VehicleColour.Builder("12").colSection("Top").color("Black").builder());
        color.add(new VehicleColour.Builder("12").colSection("Body").color("white").builder());
        color.add(new VehicleColour.Builder("12").colSection("Trim").color("Black").builder());
        Vehicle car = new Vehicle.Builder("1232jh").brand(brand).carType(type).carColor(color)
                .model("Ve8").name("Dogde Nitro").year("2012").Builder();
        Vehicle returnCar = crudService.remove(car);
        when(crudService.remove(car)).thenReturn(returnCar);
        Mockito.verify(crudService).remove(car);
    }
}