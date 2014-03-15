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
import philaman.cput.limacardealers.model.Commission;
import philaman.cput.limacardealers.model.SalesGrade;
import philaman.cput.limacardealers.model.SalesPerson;
import philaman.cput.limacardealers.service.crud.SalesPersonCrudService;

/**
 *
 * @author phila
 */
public class SalesPersonTestCrudService {

    @Mock
    private static SalesPersonCrudService crudService;

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(SalesPersonCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        SalesGrade grade = new SalesGrade.Builder("D").rate(20).Builder();
        List<Commission> com = new ArrayList<>();
        com.add(new Commission.Builder("123243").commission(5000).build());
        com.add(new Commission.Builder("123244").commission(10000).build());
        SalesPerson salesman = new SalesPerson.Builder("1254").grade(grade).comm(com)
                .salary(30000).build();
        SalesPerson returnSale = crudService.persist(salesman);
        when(crudService.persist(salesman)).thenReturn(returnSale);
        Mockito.verify(crudService).persist(salesman);
    }

    @Test
    public void testRead() throws Exception {
        SalesGrade grade = new SalesGrade.Builder("D").rate(20).Builder();
        List<Commission> com = new ArrayList<>();
        com.add(new Commission.Builder("123243").commission(5000).build());
        com.add(new Commission.Builder("123244").commission(10000).build());
        SalesPerson salesman = new SalesPerson.Builder("1254").grade(grade).comm(com)
                .salary(30000).build();
        SalesPerson returnSale = crudService.find(salesman.getEmpNumber());
        when(crudService.find(salesman.getEmpNumber())).thenReturn(returnSale);
        Mockito.verify(crudService).find(salesman.getEmpNumber());
    }

    @Test
    public void testUpdate() throws Exception {
        //-----------create
        SalesGrade grade = new SalesGrade.Builder("D").rate(20).Builder();
        List<Commission> com = new ArrayList<>();
        com.add(new Commission.Builder("123243").commission(5000).build());
        com.add(new Commission.Builder("123244").commission(10000).build());
        SalesPerson salesman = new SalesPerson.Builder("1254").grade(grade).comm(com)
                .salary(30000).build();
        SalesPerson returnSale = crudService.persist(salesman);
        //-----------update
        salesman = new SalesPerson.Builder("1254").grade(grade).comm(com)
                .salary(35000).build();
        returnSale = crudService.merge(salesman);
        when(crudService.merge(salesman)).thenReturn(returnSale);
        Mockito.verify(crudService).merge(salesman);
    }

    @Test
    public void testDelete() throws Exception {
        SalesGrade grade = new SalesGrade.Builder("D").rate(20).Builder();
        List<Commission> com = new ArrayList<>();
        com.add(new Commission.Builder("123243").commission(5000).build());
        com.add(new Commission.Builder("123244").commission(10000).build());
        SalesPerson salesman = new SalesPerson.Builder("1254").grade(grade).comm(com)
                .salary(30000).build();
        SalesPerson returnSale = crudService.remove(salesman);
        when(crudService.remove(salesman)).thenReturn(returnSale);
        Mockito.verify(crudService).remove(salesman);
    }
}