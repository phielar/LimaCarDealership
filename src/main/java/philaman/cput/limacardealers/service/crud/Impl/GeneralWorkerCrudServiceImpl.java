/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service.crud.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import philaman.cput.limacardealers.model.GeneralWorker;
import philaman.cput.limacardealers.service.crud.GeneralWorkerCrudService;

/**
 *
 * @author phila
 */
public class GeneralWorkerCrudServiceImpl implements GeneralWorkerCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public GeneralWorker find(String id) {
    return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public GeneralWorker persist(GeneralWorker entity) {
    return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public GeneralWorker merge(GeneralWorker entity) {
    return null;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public GeneralWorker remove(GeneralWorker entity) {
    return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<GeneralWorker> findAll() {
    return null;
    }
    
}
