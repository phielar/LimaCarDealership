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
import philaman.cput.limacardealers.Model.Inventory;

/**
 *
 * @author phila
 */
public class InventoryTest {

    public InventoryTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    private static ApplicationContext axct;
    private static Inventory inv;

    @Test
    public void createTest() {
        inv = (Inventory) axct.getBean("inventory");
        inv = new Inventory.Builder("12234587")
                .price(500000.0)
                .stockOnHand(20)
                .builder();
        Assert.assertEquals(500000.0, inv.getPrice());
        Assert.assertEquals("12234587", inv.getId());
    }

    @Test
    public void updateTest() {
        inv = (Inventory) axct.getBean("inventory");
        inv = new Inventory.Builder("12234587")
                .price(500000)
                .stockOnHand(20)
                .builder();
        inv = new Inventory.Builder("12234587")
                .price(450000.0)
                .stockOnHand(15)
                .builder();
        Assert.assertEquals(15, inv.getStockOnHand());
        Assert.assertEquals(450000.0, inv.getPrice());
        Assert.assertEquals("12234587", inv.getId());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        axct = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}