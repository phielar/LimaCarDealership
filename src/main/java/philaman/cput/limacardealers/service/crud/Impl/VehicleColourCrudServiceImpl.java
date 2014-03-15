/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service.crud.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import philaman.cput.limacardealers.model.VehicleColour;
import philaman.cput.limacardealers.service.crud.VehicleColourCrudService;

/**
 *
 * @author phila
 */
public class VehicleColourCrudServiceImpl implements VehicleColourCrudService {

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public VehicleColour find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public VehicleColour persist(VehicleColour entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public VehicleColour merge(VehicleColour entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public VehicleColour remove(VehicleColour entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<VehicleColour> findAll() {
        return null;
    }
}
