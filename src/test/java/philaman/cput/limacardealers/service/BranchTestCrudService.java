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
import philaman.cput.limacardealers.model.Branch;
import philaman.cput.limacardealers.service.crud.BranchCrudService;

/**
 *
 * @author phila
 */
public class BranchTestCrudService {

    @Mock
    private static BranchCrudService crudService;
   
    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(BranchCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Branch branch = new Branch.Builder("5").branchname("Cape Gate").branchYTDSales(28)
                .build();
        Branch returnBranch = crudService.persist(branch);
        when(crudService.persist(branch)).thenReturn(returnBranch);
        Mockito.verify(crudService).persist(branch);
    }

    @Test
    public void testRead() throws Exception {
        Branch branch = new Branch.Builder("5").branchname("Cape Gate").branchYTDSales(28)
                .build();
        Branch returnBranch = crudService.find(branch.getBranchCode());
        when(crudService.find(branch.getBranchCode())).thenReturn(returnBranch);
        Mockito.verify(crudService).find(branch.getBranchCode());
    }

    @Test
    public void testUpdate() throws Exception {
        Branch branch = new Branch.Builder("5").branchname("Cape Gate").branchYTDSales(28)
                .build();
        Branch returnBranch = crudService.persist(branch);
        branch = new Branch.Builder("5").branchname("Cape Gates").branchYTDSales(82)
                .build();
        returnBranch=crudService.merge(branch);
        when(crudService.merge(branch)).thenReturn(returnBranch);
        Mockito.verify(crudService).merge(branch);
    }

    @Test
    public void testDelete() throws Exception {
        Branch branch = new Branch.Builder("5").branchname("Cape Gate").branchYTDSales(28)
                .build();
        Branch returnBranch = crudService.remove(branch);
        when(crudService.remove(branch)).thenReturn(returnBranch);
        Mockito.verify(crudService).remove(branch);
    }
}