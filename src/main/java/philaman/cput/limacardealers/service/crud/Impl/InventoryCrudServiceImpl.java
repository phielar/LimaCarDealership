/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service.crud.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import philaman.cput.limacardealers.model.Inventory;
import philaman.cput.limacardealers.service.crud.InventoryCrudService;

/**
 *
 * @author phila
 */
public class InventoryCrudServiceImpl implements InventoryCrudService {

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Inventory find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Inventory persist(Inventory entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Inventory merge(Inventory entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Inventory remove(Inventory entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Inventory> findAll() {
        return null;
    }
}
