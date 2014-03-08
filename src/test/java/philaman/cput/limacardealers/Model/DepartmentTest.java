package philaman.cput.limacardealers.Model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import philaman.cput.limacardealers.Config.AppConfig;
import philaman.cput.limacardealers.Model.Department;

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
    private static ApplicationContext axct;
    private static Department dep;

    @Test
    public void createTest() {
        dep = (Department) axct.getBean("departmet");
        dep = new Department.Builder("C1254").department("Sales and Marketing").build();
        Assert.assertEquals(dep.getDepId(), "C1254");
        Assert.assertEquals(dep.getDepartment(), "Sales and Marketing");
    }

    @Test
    public void updateTest() {
        dep = (Department) axct.getBean("departmet");
        dep = new Department.Builder("C1254").department("Sales and Marketing").build();
        dep = new Department.Builder("C1254").department("Repairs And Services").build();
        Assert.assertEquals(dep.getDepId(), "C1254");
        Assert.assertEquals(dep.getDepartment(), "Repairs And Services");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        axct = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}