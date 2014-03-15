/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service.crud.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import philaman.cput.limacardealers.model.Customer;
import philaman.cput.limacardealers.service.crud.CustomerCrudService;

/**
 *
 * @author phila
 */
public class CustomerCrudServiceImpl implements CustomerCrudService{

    @Override
    @Transactional(propagation =Propagation.SUPPORTS)
    public Customer find(String id) {
    return null;
    }

    @Override
    @Transactional(propagation =Propagation.MANDATORY)
    public Customer persist(Customer entity) {
    return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Customer merge(Customer entity) {
    return null;}

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public Customer remove(Customer entity) {
     return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Customer> findAll() {
    return null;
    }
    
}
