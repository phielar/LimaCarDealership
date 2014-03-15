/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.model;

import philaman.cput.limacardealers.model.Job;
import philaman.cput.limacardealers.model.Manager;
import philaman.cput.limacardealers.model.Employee;
import philaman.cput.limacardealers.model.Department;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author phila
 */
public class ManagerTest {

    public ManagerTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    private static Manager man;

    @Test
    public void createTest() {
        Department dep = new Department.Builder("445e").department("Information Technology").build();
        Job work = new Job.Builder("1145jw").jobDescription("Technician").basicSalary(15000.00).build();

        Employee emp1 = new Employee.Builder("21016836").empFirstname("lima").empLastname("Monali")
                .empInitials("PS").empDepartment(dep).empJob(work).build();
        man = new Manager.Builder("2101554").emp(emp1).build();
        Assert.assertEquals("2101554", man.getId(), "edd" + man.getId());
        Assert.assertEquals("Information Technology", man.getEmp().getEmpDepartment().getDepartment());
    }

    @Test
    public void updateTest() {
        Department dep = new Department.Builder("445e").department("Information Technology").build();
        Job work = new Job.Builder("1145jw").jobDescription("Project Manager").build();

        Employee emp1 = new Employee.Builder("21016836").empFirstname("lima").empLastname("Monali")
                .empInitials("PS").empDepartment(dep).empJob(work).build();
        man = new Manager.Builder("2101554").emp(emp1).build();
        //update 
        work = new Job.Builder("1145jw").jobDescription("Technician").basicSalary(15000.00).build();

        emp1 = new Employee.Builder("21016836").empFirstname("lima").empLastname("James")
                .empInitials("PS").empDepartment(dep).empJob(work).build();
        man = new Manager.Builder("2101554").emp(emp1).build();
        Assert.assertEquals("2101554", man.getId());
        Assert.assertEquals("Information Technology", man.getEmp().getEmpDepartment().getDepartment());
        Assert.assertEquals("James", man.getEmp().getEmpLastname());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
}