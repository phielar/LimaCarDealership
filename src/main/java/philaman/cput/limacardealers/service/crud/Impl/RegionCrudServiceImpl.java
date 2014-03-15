/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service.crud.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import philaman.cput.limacardealers.model.Region;
import philaman.cput.limacardealers.service.crud.RegionCrudService;

/**
 *
 * @author phila
 */
public class RegionCrudServiceImpl implements RegionCrudService {

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Region find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Region persist(Region entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Region merge(Region entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Region remove(Region entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Region> findAll() {
        return null;
    }
}
