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
import philaman.cput.limacardealers.model.VehicleColour;
import philaman.cput.limacardealers.service.crud.VehicleColourCrudService;

/**
 *
 * @author phila
 */
public class VehicleColorTestCrudService {

    @Mock
    private static VehicleColourCrudService crudService;
    
    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(VehicleColourCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        VehicleColour carColor = new VehicleColour.Builder("1254").colSection("Top")
                .color("Silver").builder();
        VehicleColour returnColor = crudService.persist(carColor);
        when(crudService.persist(carColor)).thenReturn(returnColor);
        Mockito.verify(crudService).persist(carColor);
    }

    @Test
    public void testRead() throws Exception {
        VehicleColour carColor = new VehicleColour.Builder("1254").colSection("Top")
                .color("Silver").builder();
        VehicleColour returnColor = crudService.find(carColor.getId());
        when(crudService.find(carColor.getId())).thenReturn(returnColor);
        Mockito.verify(crudService).find(carColor.getId());
    }

    @Test
    public void testUpdate() throws Exception {
        //--------create new
        VehicleColour carColor = new VehicleColour.Builder("1254").colSection("Top")
                .color("Silver").builder();
        VehicleColour returnColor = crudService.persist(carColor);
        //------------update---- 
        carColor = new VehicleColour.Builder("1254").colSection("Top")
                .color("Gray").builder();
        returnColor = crudService.merge(carColor);
        when(crudService.merge(carColor)).thenReturn(returnColor);
        Mockito.verify(crudService).merge(carColor);
    }

    @Test
    public void testDelete() throws Exception {
        VehicleColour carColor = new VehicleColour.Builder("1254").colSection("Top")
                .color("Silver").builder();
        VehicleColour returnColor = crudService.remove(carColor);
        when(crudService.remove(carColor)).thenReturn(returnColor);
        Mockito.verify(crudService).remove(carColor);
    }
}