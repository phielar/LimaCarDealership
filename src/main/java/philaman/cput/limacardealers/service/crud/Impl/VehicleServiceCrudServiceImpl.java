/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service.crud.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import philaman.cput.limacardealers.model.VehicleService;
import philaman.cput.limacardealers.service.crud.VehicleServiceCrudService;

/**
 *
 * @author phila
 */
public class VehicleServiceCrudServiceImpl implements VehicleServiceCrudService {

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public VehicleService find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public VehicleService persist(VehicleService entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public VehicleService merge(VehicleService entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public VehicleService remove(VehicleService entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<VehicleService> findAll() {
        return null;
    }
}
