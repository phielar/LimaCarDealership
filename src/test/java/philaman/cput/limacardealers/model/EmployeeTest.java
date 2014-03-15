/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.model;

import philaman.cput.limacardealers.model.Job;
import philaman.cput.limacardealers.model.Employee;
import philaman.cput.limacardealers.model.Department;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author phila
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }
    
    private static Employee emp;
    @Test
    public void createTest()
    {   Department dep=new Department.Builder("445e").department("Information Technology").build();
        Job work=new Job.Builder("1145jw").jobDescription("Technician").basicSalary(15000.00).build();
        
        emp=new Employee.Builder("21016836").empFirstname("lima").empLastname("Monali")
                        .empInitials("PS").empDepartment(dep).empJob(work).build();
        Assert.assertEquals("21016836", emp.getEmpNumber());
        Assert.assertEquals("lima", emp.getEmpFirstname());
        Assert.assertEquals("Monali", emp.getEmpLastname());
        Assert.assertEquals("PS", emp.getEmpInitials());
        Assert.assertEquals("445e", emp.getEmpDepartment().getDepId());
        Assert.assertEquals("Information Technology", emp.getEmpDepartment().getDepartment());
        Assert.assertEquals("1145jw", emp.getEmpJob().getJobid());
        Assert.assertEquals(15000.0, emp.getEmpJob().getBasicSalary());
        Assert.assertEquals("Technician", emp.getEmpJob().getJobDescription());
    }
    @Test
    public void updateTest()
    {
        //create
        Department dep=new Department.Builder("445e").department("Information Technology").build();
        Job work=new Job.Builder("1145jw").jobDescription("Technician").build();
        
        emp=new Employee.Builder("21016836").empFirstname("lima").empLastname("Monali")
                        .empInitials("PS").empDepartment(dep).empJob(work).build();
        //update
        dep=new Department.Builder("445e").department("Information Technology").build();
        work=new Job.Builder("1145jw").jobDescription("Programmer").basicSalary(45000.00).build();
        
        emp=new Employee.Builder("21016836").empFirstname("lima").empLastname("Johannes")
                        .empInitials("BS").empDepartment(dep).empJob(work).build();
        Assert.assertEquals("21016836", emp.getEmpNumber());
        Assert.assertEquals("lima", emp.getEmpFirstname());
        Assert.assertEquals("Johannes", emp.getEmpLastname());
        Assert.assertEquals("BS", emp.getEmpInitials());
        Assert.assertEquals("445e", emp.getEmpDepartment().getDepId());
        Assert.assertEquals("Information Technology", emp.getEmpDepartment().getDepartment());
        Assert.assertEquals("1145jw", emp.getEmpJob().getJobid());
        Assert.assertEquals(45000.0, emp.getEmpJob().getBasicSalary());
        Assert.assertEquals("Programmer", emp.getEmpJob().getJobDescription());
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
     }
}