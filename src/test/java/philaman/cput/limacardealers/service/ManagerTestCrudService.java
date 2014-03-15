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
import philaman.cput.limacardealers.model.Manager;
import philaman.cput.limacardealers.service.crud.ManagerCrudService;

/**
 *
 * @author phila
 */
public class ManagerTestCrudService {

    @Mock
    private static ManagerCrudService crudService;

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ManagerCrudService.class);
    }

    @Test
    public void testCreate()  throws Exception {
        Department dep = new Department.Builder("445e").department("Information Technology").build();
        Job work = new Job.Builder("1145jw").jobDescription("Technician").basicSalary(15000.00).build();

        Employee emp1 = new Employee.Builder("21016836").empFirstname("lima").empLastname("Monali")
                .empInitials("PS").empDepartment(dep).empJob(work).build();
        Manager man = new Manager.Builder("2101554").emp(emp1).build();
        Manager returnManager = crudService.persist(man);
        when(crudService.persist(man)).thenReturn(returnManager);
        Mockito.verify(crudService).persist(man);
    }

    @Test
    public void testRead()  throws Exception {
        Department dep = new Department.Builder("445e").department("Information Technology").build();
        Job work = new Job.Builder("1145jw").jobDescription("Technician").basicSalary(15000.00).build();

        Employee emp1 = new Employee.Builder("21016836").empFirstname("lima").empLastname("Monali")
                .empInitials("PS").empDepartment(dep).empJob(work).build();
        Manager man = new Manager.Builder("2101554").emp(emp1).build();
        Manager returnManager = crudService.find(man.getId());
        when(crudService.find(man.getId())).thenReturn(returnManager);
        Mockito.verify(crudService).find(man.getId());
    }

    @Test
    public void testUpdate()  throws Exception {
        //-----------create-----------
        Department dep = new Department.Builder("445e").department("Information Technology").build();
        Job work = new Job.Builder("1145jw").jobDescription("Technician").basicSalary(15000.00).build();

        Employee emp1 = new Employee.Builder("21016836").empFirstname("lima").empLastname("Monali")
                .empInitials("PS").empDepartment(dep).empJob(work).build();
        Manager man = new Manager.Builder("2101554").emp(emp1).build();
        Manager returnManager = crudService.persist(man);
        //----------update------------
        emp1 = new Employee.Builder("21016836").empFirstname("lima").empLastname("Manile")
                .empInitials("PS").empDepartment(dep).empJob(work).build();
        man = new Manager.Builder("2101554").emp(emp1).build();
        returnManager = crudService.merge(man);
        when(crudService.merge(man)).thenReturn(returnManager);
        Mockito.verify(crudService).merge(man);
    }

    @Test
    public void testDelete()  throws Exception {
        Department dep = new Department.Builder("445e").department("Information Technology").build();
        Job work = new Job.Builder("1145jw").jobDescription("Technician").basicSalary(15000.00).build();

        Employee emp1 = new Employee.Builder("21016836").empFirstname("lima").empLastname("Monali")
                .empInitials("PS").empDepartment(dep).empJob(work).build();
        Manager man = new Manager.Builder("2101554").emp(emp1).build();
        Manager returnManager = crudService.remove(man);
        when(crudService.remove(man)).thenReturn(returnManager);
        Mockito.verify(crudService).remove(man);
    }
}