package philaman.cput.limacardealers.Model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import philaman.cput.limacardealers.Config.AppConfig;
import philaman.cput.limacardealers.Model.SalesGrade;

/**
 *
 * @author phila
 */
public class SalesGradeTest {

    public SalesGradeTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    private static ApplicationContext axct;
    private static SalesGrade grade;

    @Test
    public void createTest() {
        grade = (SalesGrade) axct.getBean("salesGrade");
        grade = new SalesGrade.Builder("A").rate(17.5).Builder();
        Assert.assertEquals("A", grade.getGrade());
        Assert.assertEquals(17.5, grade.getRate());
    }

    @Test
    public void updateTest() {
        grade = (SalesGrade) axct.getBean("salesGrade");
        grade = new SalesGrade.Builder("A").rate(17.5).Builder();
        grade = new SalesGrade.Builder("D").rate(15.5).Builder();
        Assert.assertEquals("D", grade.getGrade());
        Assert.assertEquals(15.5, grade.getRate());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        axct = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}