/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service.crud.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import philaman.cput.limacardealers.model.Job;
import philaman.cput.limacardealers.service.crud.JobCrudService;

/**
 *
 * @author phila
 */
public class JobCrudServiceImpl implements JobCrudService {

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Job find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Job persist(Job entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Job merge(Job entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Job remove(Job entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Job> findAll() {
        return null;
    }
}
