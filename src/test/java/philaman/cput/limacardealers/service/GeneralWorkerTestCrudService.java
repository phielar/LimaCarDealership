/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service;

import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import philaman.cput.limacardealers.model.GeneralWorker;
import philaman.cput.limacardealers.service.crud.GeneralWorkerCrudService;

/**
 *
 * @author phila
 */
public class GeneralWorkerTestCrudService {

    @Mock
    private static GeneralWorker gw;
    private GeneralWorkerCrudService crudService;

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(GeneralWorkerCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        gw = new GeneralWorker.Builder("5454").hoursWorked(54).rate(25).build();
        GeneralWorker returnGw = crudService.persist(gw);
        when(crudService.persist(gw)).thenReturn(returnGw);
        Mockito.verify(crudService).persist(gw);
    }

    @Test
    public void testRead() throws Exception {
        gw = new GeneralWorker.Builder("5454").hoursWorked(54).rate(25).build();
        GeneralWorker returnGw = crudService.find(gw.getId());
        when(crudService.find(gw.getId())).thenReturn(returnGw);
        Mockito.verify(crudService).find(gw.getId());
    }

    @Test
    public void testUpdate() throws Exception {
        //==========create new
        gw = new GeneralWorker.Builder("5454").hoursWorked(54).rate(25).build();
        //==========update=========
        gw = new GeneralWorker.Builder("5454").hoursWorked(54).rate(20).build();
        GeneralWorker returnGw = crudService.merge(gw);
        when(crudService.merge(gw)).thenReturn(returnGw);
        Mockito.verify(crudService).merge(gw);
    }

    @Test
    public void testDelete() throws Exception {
        gw = new GeneralWorker.Builder("5454").hoursWorked(54).rate(25).build();
        GeneralWorker returnGw = crudService.remove(gw);
        when(crudService.remove(gw)).thenReturn(returnGw);
        Mockito.verify(crudService).remove(gw);
    }
}