/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service.crud.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import philaman.cput.limacardealers.model.Department;
import philaman.cput.limacardealers.service.crud.DepartmentCrudService;

/**
 *
 * @author phila
 */
public class DepartmentCrudServiceImpl implements DepartmentCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Department find(String id) {
    return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Department persist(Department entity) {
    return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Department merge(Department entity) {
    return null;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Department remove(Department entity) {
    return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Department> findAll() {
    return null;
    }
    
}
