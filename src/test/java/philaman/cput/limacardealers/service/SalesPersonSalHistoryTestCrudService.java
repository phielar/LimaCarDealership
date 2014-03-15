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
import philaman.cput.limacardealers.model.SalesPerson;
import philaman.cput.limacardealers.model.SalesPersonSalHistory;
import philaman.cput.limacardealers.service.crud.SalesPersonSalHistoryCrudService;

/**
 *
 * @author phila
 */
public class SalesPersonSalHistoryTestCrudService {

    @Mock
    private static SalesPersonSalHistoryCrudService crudService;

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(SalesPersonSalHistoryCrudService.class);
    }

    @Test
    public void testcreate() throws Exception {
        SalesPerson sales = new SalesPerson.Builder("2134532").build();
        SalesPersonSalHistory salHistory = new SalesPersonSalHistory.Builder("2154").salesMan(sales).personalSaleRecord(20)
                .startDate("28-may-2013")
                .personalSaleRecordDate("30-jul-2013").Build();
        SalesPersonSalHistory returnSal = crudService.persist(salHistory);
        when(crudService.persist(salHistory)).thenReturn(returnSal);
        Mockito.verify(crudService).persist(salHistory);
    }

    @Test
    public void testRead() throws Exception {
        SalesPerson sales = new SalesPerson.Builder("2134532").build();
        SalesPersonSalHistory salHistory = new SalesPersonSalHistory.Builder("2154").salesMan(sales).personalSaleRecord(20)
                .startDate("28-may-2013")
                .personalSaleRecordDate("30-jul-2013").Build();
        SalesPersonSalHistory returnSal = crudService.find(salHistory.getId());
        when(crudService.find(salHistory.getId())).thenReturn(returnSal);
        Mockito.verify(crudService).find(salHistory.getId());
    }

    @Test
    public void testUpdate() throws Exception {
        //----------create
        SalesPerson sales = new SalesPerson.Builder("2134532").build();
        SalesPersonSalHistory salHistory = new SalesPersonSalHistory.Builder("2154").salesMan(sales).personalSaleRecord(20)
                .startDate("28-may-2013")
                .personalSaleRecordDate("30-jul-2013").Build();
        SalesPersonSalHistory returnSal = crudService.persist(salHistory);
        //---------update...
        salHistory = new SalesPersonSalHistory.Builder("2154").salesMan(sales).personalSaleRecord(30)
                .startDate("28-may-2013")
                .personalSaleRecordDate("30-Aug-2013").Build();
        returnSal = crudService.merge(salHistory);
        when(crudService.merge(salHistory)).thenReturn(returnSal);
        Mockito.verify(crudService).merge(salHistory);
    }

    @Test
    public void testDelete() throws Exception {
        SalesPerson sales = new SalesPerson.Builder("2134532").build();
        SalesPersonSalHistory salHistory = new SalesPersonSalHistory.Builder("2154").salesMan(sales).personalSaleRecord(20)
                .startDate("28-may-2013")
                .personalSaleRecordDate("30-jul-2013").Build();
        SalesPersonSalHistory returnSal = crudService.remove(salHistory);
        when(crudService.remove(salHistory)).thenReturn(returnSal);
        Mockito.verify(crudService).remove(salHistory);
    }
}