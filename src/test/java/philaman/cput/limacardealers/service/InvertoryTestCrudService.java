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
import philaman.cput.limacardealers.model.Inventory;
import philaman.cput.limacardealers.service.crud.InventoryCrudService;

/**
 *
 * @author phila
 */
public class InvertoryTestCrudService {

    @Mock
    private static InventoryCrudService crudService;

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(InventoryCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Inventory inv = new Inventory.Builder("12234587")
                .price(500000.0)
                .stockOnHand(20)
                .builder();
        Inventory returnInv = crudService.persist(inv);
        when(crudService.persist(inv)).thenReturn(returnInv);
        Mockito.verify(crudService).persist(inv);
    }

    @Test
    public void testRead() throws Exception {
        Inventory inv = new Inventory.Builder("12234587")
                .price(500000.0)
                .stockOnHand(20)
                .builder();
        Inventory returnInv = crudService.find(inv.getId());
        when(crudService.find(inv.getId())).thenReturn(returnInv);
        Mockito.verify(crudService).find(inv.getId());
    }

    @Test
    public void testUpate() throws Exception {
        Inventory inv = new Inventory.Builder("12234587")
                .price(500000.0)
                .stockOnHand(20)
                .builder();
        Inventory returnInv = crudService.persist(inv);
        inv = new Inventory.Builder("12234587")
                .price(50000.0)
                .stockOnHand(18)
                .builder();
        returnInv = crudService.merge(inv);
        when(crudService.merge(inv)).thenReturn(returnInv);
        Mockito.verify(crudService).merge(inv);
    }

    @Test
    public void testDelete() throws Exception {
        Inventory inv = new Inventory.Builder("12234587")
                .price(500000.0)
                .stockOnHand(20)
                .builder();
        Inventory returnInv = crudService.remove(inv);
        when(crudService.remove(inv)).thenReturn(returnInv);
        Mockito.verify(crudService).remove(inv);
    }
}