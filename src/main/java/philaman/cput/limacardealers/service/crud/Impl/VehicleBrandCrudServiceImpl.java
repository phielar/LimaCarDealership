/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service.crud.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import philaman.cput.limacardealers.model.VehicleBrand;
import philaman.cput.limacardealers.service.crud.VehicleBrandCrudService;

/**
 *
 * @author phila
 */
public class VehicleBrandCrudServiceImpl implements VehicleBrandCrudService {

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public VehicleBrand find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public VehicleBrand persist(VehicleBrand entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public VehicleBrand merge(VehicleBrand entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public VehicleBrand remove(VehicleBrand entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<VehicleBrand> findAll() {
        return null;
    }
}
