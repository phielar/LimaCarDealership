package philaman.cput.limacardealers.model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import philaman.cput.limacardealers.model.Department;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author phila
 */
public class DepartmentTest {

    public DepartmentTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    private static Department dep;

    @Test
    public void createTest() {
       dep = new Department.Builder("C1254").department("Sales and Marketing").build();
        Assert.assertEquals(dep.getDepId(), "C1254");
        Assert.assertEquals(dep.getDepartment(), "Sales and Marketing");
    }

    @Test
    public void updateTest() {
        dep = new Department.Builder("C1254").department("Sales and Marketing").build();
        dep = new Department.Builder("C1254").department("Repairs And Services").build();
        Assert.assertEquals(dep.getDepId(), "C1254");
        Assert.assertEquals(dep.getDepartment(), "Repairs And Services");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
}