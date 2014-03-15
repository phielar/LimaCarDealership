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
import philaman.cput.limacardealers.model.Commission;
import philaman.cput.limacardealers.model.SalesGrade;
import philaman.cput.limacardealers.service.crud.CommissionCrudService;

/**
 *
 * @author phila
 */
public class CommissionTestCrudService {

    @Mock
    private static CommissionCrudService crudService;
 
    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(CommissionCrudService.class);
    }

    @Test
    public void testCreate() {
        SalesGrade rate = new SalesGrade.Builder("1254").rate(0.15).Builder();
        Commission c1 = new Commission.Builder("1254").rate(rate).commission(5000).build();
        Commission returnComm = crudService.persist(c1);
        when(crudService.persist(c1)).thenReturn(returnComm);
        Mockito.verify(crudService).persist(c1);
    }

    @Test
    public void testRead() {
        SalesGrade rate = new SalesGrade.Builder("1254").rate(0.15).Builder();
        Commission c1 = new Commission.Builder("1254").rate(rate).commission(5000).build();
        Commission returnComm = crudService.find(c1.getId());
        when(crudService.find(c1.getId())).thenReturn(returnComm);
        Mockito.verify(crudService).find(c1.getId());
    }

    @Test
    public void testUpdate() {
        SalesGrade rate = new SalesGrade.Builder("1254").rate(0.15).Builder();
        Commission c1 = new Commission.Builder("1254").rate(rate).commission(5000).build();
        //--------------create---------------------
        Commission returnComm = crudService.persist(c1);
        //--------------update----------------------
        c1 = new Commission.Builder("1254").rate(rate).commission(2000).build();
        returnComm=crudService.merge(c1);
        when(crudService.merge(c1)).thenReturn(c1);
        Mockito.verify(crudService).merge(c1);
    }
    @Test
    public void testDelete() {
        SalesGrade rate = new SalesGrade.Builder("1254").rate(0.15).Builder();
        Commission c1 = new Commission.Builder("1254").rate(rate).commission(5000).build();
        Commission returnComm = crudService.remove(c1);
        when(crudService.remove(c1)).thenReturn(returnComm);
        Mockito.verify(crudService).remove(c1);
    }
}