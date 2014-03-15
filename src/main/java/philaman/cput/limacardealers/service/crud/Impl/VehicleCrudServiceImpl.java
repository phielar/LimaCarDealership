/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service.crud.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import philaman.cput.limacardealers.model.Vehicle;
import philaman.cput.limacardealers.service.crud.VehicleCrudService;

/**
 *
 * @author phila
 */
public class VehicleCrudServiceImpl implements VehicleCrudService {

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Vehicle find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Vehicle persist(Vehicle entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Vehicle merge(Vehicle entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Vehicle remove(Vehicle entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Vehicle> findAll() {
        return null;
    }
}
