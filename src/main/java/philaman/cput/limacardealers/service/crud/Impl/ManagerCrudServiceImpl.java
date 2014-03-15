/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service.crud.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import philaman.cput.limacardealers.model.Manager;
import philaman.cput.limacardealers.service.crud.ManagerCrudService;

/**
 *
 * @author phila
 */
public class ManagerCrudServiceImpl implements ManagerCrudService {

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public Manager find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Manager persist(Manager entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Manager merge(Manager entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Manager remove(Manager entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Manager> findAll() {
        return null;
    }
}
