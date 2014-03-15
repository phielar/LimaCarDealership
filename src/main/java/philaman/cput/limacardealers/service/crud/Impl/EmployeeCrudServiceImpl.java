/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service.crud.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import philaman.cput.limacardealers.model.Employee;
import philaman.cput.limacardealers.service.crud.EmployeeCrudService;

/**
 *
 * @author phila
 */
public class EmployeeCrudServiceImpl implements EmployeeCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Employee find(String id) {
    return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Employee persist(Employee entity) {
    return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Employee merge(Employee entity) {
    return null;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Employee remove(Employee entity) {
    return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Employee> findAll() {
    return null;
    }
    
}
