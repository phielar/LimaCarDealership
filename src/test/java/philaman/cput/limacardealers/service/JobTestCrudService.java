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
import philaman.cput.limacardealers.model.Job;
import philaman.cput.limacardealers.service.crud.JobCrudService;

/**
 *
 * @author phila
 */
public class JobTestCrudService {

    @Mock
    private static JobCrudService crudService;

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(JobCrudService.class);
    }

    @Test
    public void Testcreate() throws Exception {
        Job work = new Job.Builder("1145jw").jobDescription("Technician").basicSalary(7000.00).build();
        Job returnJob = crudService.persist(work);
        when(crudService.persist(work)).thenReturn(returnJob);
        Mockito.verify(crudService).persist(work);

    }

    @Test
    public void TestRead() throws Exception {
        Job work = new Job.Builder("1145jw").jobDescription("Technician").basicSalary(7000.00).build();
        Job returnJob = crudService.find(work.getJobid());
        when(crudService.find(work.getJobid())).thenReturn(returnJob);
        Mockito.verify(crudService).find(work.getJobid());
    }

    @Test
    public void TestUpdate() throws Exception {
        //========create new Job
        Job work = new Job.Builder("1145jw").jobDescription("Technician").basicSalary(7000.00).build();
        Job returnJob = crudService.persist(work);
        //========update
        work = new Job.Builder("1145jw").jobDescription("Technicians").basicSalary(7500.00).build();
        returnJob = crudService.merge(work);
        when(crudService.merge(work)).thenReturn(returnJob);
        Mockito.verify(crudService).merge(work);
    }

    @Test
    public void TestDelete() throws Exception {
        Job work = new Job.Builder("1145jw").jobDescription("Technician").basicSalary(7000.00).build();
        Job returnJob = crudService.remove(work);
        when(crudService.remove(work)).thenReturn(returnJob);
        Mockito.verify(crudService).remove(work);

    }
}