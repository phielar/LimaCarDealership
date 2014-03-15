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
import philaman.cput.limacardealers.model.Department;
import philaman.cput.limacardealers.service.crud.DepartmentCrudService;

/**
 *
 * @author phila
 */
public class DepartmentTestCrudService {
    @Mock
    private static DepartmentCrudService crudService;
    private static Department dep;
    private Department returnDep;
    public DepartmentTestCrudService() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService=Mockito.mock(DepartmentCrudService.class);
    }
    @Test
    public void testCreate() throws Exception
    {
        dep = new Department.Builder("C1254").department("Sales and Marketing").build();
        returnDep=crudService.persist(dep);
        when(crudService.persist(dep)).thenReturn(returnDep);
        Mockito.verify(crudService).persist(dep);
    }
    public void testRead() throws Exception
    {
        dep = new Department.Builder("C1254").department("Sales and Marketing").build();
        returnDep=crudService.find(dep.getDepId());
        when(crudService.find(dep.getDepId())).thenReturn(returnDep);
        Mockito.verify(crudService).find(dep.getDepId());
    }
   @Test
    public void testUpdate() throws Exception
    {
        dep = new Department.Builder("C1254").department("Sales and Marketing").build();
        returnDep=crudService.persist(dep);
        dep = new Department.Builder("C1254").department("Marketing").build();
        when(crudService.merge(dep)).thenReturn(returnDep);
        Mockito.verify(crudService).merge(dep);
    }
   @Test
    public void testDelete() throws Exception
    {
        dep = new Department.Builder("C1254").department("Sales and Marketing").build();
        returnDep=crudService.remove(dep);
        when(crudService.remove(dep)).thenReturn(returnDep);
        Mockito.verify(crudService).remove(dep);
    }
}