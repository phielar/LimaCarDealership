/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service.crud.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import philaman.cput.limacardealers.model.SalesPerson;
import philaman.cput.limacardealers.service.crud.SalesPersonCrudService;

/**
 *
 * @author phila
 */
public class SalesPersonCrudServiceImpl implements SalesPersonCrudService {

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public SalesPerson find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public SalesPerson persist(SalesPerson entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public SalesPerson merge(SalesPerson entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public SalesPerson remove(SalesPerson entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<SalesPerson> findAll() {
        return null;
    }
}
