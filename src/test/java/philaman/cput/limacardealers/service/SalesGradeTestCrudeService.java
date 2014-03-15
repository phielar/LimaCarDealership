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
import philaman.cput.limacardealers.model.SalesGrade;
import philaman.cput.limacardealers.service.crud.SalesGradeCrudService;

/**
 *
 * @author phila
 */
public class SalesGradeTestCrudeService {

    @Mock
    private static SalesGradeCrudService crudService;
    
    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(SalesGradeCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        SalesGrade grade = new SalesGrade.Builder("A").rate(17.5).Builder();
        SalesGrade returnGrade = crudService.persist(grade);
        when(crudService.persist(grade)).thenReturn(returnGrade);
        Mockito.verify(crudService).persist(grade);
    }

    @Test
    public void testRead() throws Exception {
        SalesGrade grade = new SalesGrade.Builder("A").rate(17.5).Builder();
        SalesGrade returnGrade = crudService.find(grade.getGrade());
        when(crudService.find(grade.getGrade())).thenReturn(returnGrade);
        Mockito.verify(crudService).find(grade.getGrade());
    }

    @Test
    public void testUpdate() throws Exception {
        //----------create------------------
        SalesGrade grade = new SalesGrade.Builder("A").rate(17.5).Builder();
        SalesGrade returnGrade = crudService.persist(grade);
        //------------update---------------------
        grade = new SalesGrade.Builder("A").rate(15.7).Builder();
        returnGrade = crudService.merge(grade);
        when(crudService.merge(grade)).thenReturn(returnGrade);
        Mockito.verify(crudService).merge(grade);
    }

    @Test
    public void testDelete() throws Exception {
        SalesGrade grade = new SalesGrade.Builder("A").rate(17.5).Builder();
        SalesGrade returnGrade = crudService.remove(grade);
        when(crudService.remove(grade)).thenReturn(returnGrade);
        Mockito.verify(crudService).remove(grade);
    }
}