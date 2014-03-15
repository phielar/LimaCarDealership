/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service.crud.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import philaman.cput.limacardealers.model.Commission;
import philaman.cput.limacardealers.service.crud.CommissionCrudService;

/**
 *
 * @author phila
 */
public class CommissionCrudServiceImpl implements CommissionCrudService {

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Commission find(String id) {
    return null;
    }

    @Override
    @Transactional(propagation =Propagation.MANDATORY)
    public Commission persist(Commission entity) {
    return null;
    }

    @Override
    @Transactional(propagation =Propagation.REQUIRES_NEW)
    public Commission merge(Commission entity) {
    return null;
    }

    @Override
    @Transactional(propagation =Propagation.REQUIRED)
    public Commission remove(Commission entity) {
    return null;
    }

    @Override
    @Transactional(propagation =Propagation.NOT_SUPPORTED)
    public List<Commission> findAll() {
    return null;
    }
    
}
