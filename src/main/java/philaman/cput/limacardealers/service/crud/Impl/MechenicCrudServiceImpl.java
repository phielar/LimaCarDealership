/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service.crud.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import philaman.cput.limacardealers.model.Mechenic;
import philaman.cput.limacardealers.service.crud.MechenicCrudService;

/**
 *
 * @author phila
 */
public class MechenicCrudServiceImpl implements MechenicCrudService {

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Mechenic find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Mechenic persist(Mechenic entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Mechenic merge(Mechenic entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Mechenic remove(Mechenic entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Mechenic> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
