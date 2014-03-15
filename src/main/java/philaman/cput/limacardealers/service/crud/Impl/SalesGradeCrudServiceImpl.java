/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service.crud.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import philaman.cput.limacardealers.model.SalesGrade;
import philaman.cput.limacardealers.service.crud.SalesGradeCrudService;

/**
 *
 * @author phila
 */
public class SalesGradeCrudServiceImpl implements SalesGradeCrudService {

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public SalesGrade find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public SalesGrade persist(SalesGrade entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public SalesGrade merge(SalesGrade entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public SalesGrade remove(SalesGrade entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<SalesGrade> findAll() {
        return null;
    }
}
