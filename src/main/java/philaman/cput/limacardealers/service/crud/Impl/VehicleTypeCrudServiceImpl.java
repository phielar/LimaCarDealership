/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service.crud.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import philaman.cput.limacardealers.model.VehicleType;
import philaman.cput.limacardealers.service.crud.VehicleTypeCrudService;

/**
 *
 * @author phila
 */
public class VehicleTypeCrudServiceImpl implements VehicleTypeCrudService {

    @Override
    @Transactional(propagation=Propagation.SUPPORTS)
    public VehicleType find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation=Propagation.MANDATORY)
    public VehicleType persist(VehicleType entity) {
        return null;
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public VehicleType merge(VehicleType entity) {
        return null;
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public VehicleType remove(VehicleType entity) {
       return null;
    }

    @Override
    @Transactional(propagation=Propagation.NOT_SUPPORTED)
    public List<VehicleType> findAll() {
        return null;
    }
    
}
