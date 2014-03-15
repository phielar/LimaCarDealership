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
import philaman.cput.limacardealers.model.Employee;
import philaman.cput.limacardealers.model.Job;
import philaman.cput.limacardealers.service.crud.EmployeeCrudService;

/**
 *
 * @author phila
 */
public class EmployeeTestCrudService {
    @Mock
    private static EmployeeCrudService crudService;
    private static Employee emp;
    private Employee returnEmp;
    @BeforeMethod
    public void setUpMethod() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService=Mockito.mock(EmployeeCrudService.class);
    }
    @Test
    public void testCreate()
    {
        Department dep=new Department.Builder("445e").department("Information Technology").build();
        Job work=new Job.Builder("1145jw").jobDescription("Technician").basicSalary(15000.00).build();
        
        emp=new Employee.Builder("21016836").empFirstname("lima").empLastname("Monali")
                        .empInitials("PS").empDepartment(dep).empJob(work).build();
        returnEmp=crudService.persist(emp);
        when(crudService.persist(emp)).thenReturn(returnEmp);
        Mockito.verify(crudService).persist(emp);
    }
    @Test
    public void testRead()
    {
        Department dep=new Department.Builder("445e").department("Information Technology").build();
        Job work=new Job.Builder("1145jw").jobDescription("Technician").basicSalary(15000.00).build();
        
        emp=new Employee.Builder("21016836").empFirstname("lima").empLastname("Monali")
                        .empInitials("PS").empDepartment(dep).empJob(work).build();
        returnEmp=crudService.find(emp.getEmpNumber());
        when(crudService.find(emp.getEmpNumber())).thenReturn(returnEmp);
        Mockito.verify(crudService).find(emp.getEmpNumber());
    
    }
     @Test
    public void testUpdate()
    {
        Department dep=new Department.Builder("445e").department("Information Technology").build();
        Job work=new Job.Builder("1145jw").jobDescription("Technician").basicSalary(15000.00).build();
        
        emp=new Employee.Builder("21016836").empFirstname("lima").empLastname("Monali")
                        .empInitials("PS").empDepartment(dep).empJob(work).build();
        returnEmp=crudService.persist(emp);
        emp=new Employee.Builder("21016836").empFirstname("limas").empLastname("Davids")
                        .empInitials("PS").empDepartment(dep).empJob(work).build();
        returnEmp=crudService.merge(emp);        
        when(crudService.merge(emp)).thenReturn(returnEmp);
        Mockito.verify(crudService).merge(emp);
    }
    @Test
    public void testDelete()
    {
        Department dep=new Department.Builder("445e").department("Information Technology").build();
        Job work=new Job.Builder("1145jw").jobDescription("Technician").basicSalary(15000.00).build();
        
        emp=new Employee.Builder("21016836").empFirstname("lima").empLastname("Monali")
                        .empInitials("PS").empDepartment(dep).empJob(work).build();
        returnEmp=crudService.remove(emp);
        when(crudService.remove(emp)).thenReturn(returnEmp);
        Mockito.verify(crudService).remove(emp);
    }
    
    
}