/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service.crud.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import philaman.cput.limacardealers.model.SalesPersonSalHistory;
import philaman.cput.limacardealers.service.crud.SalesPersonSalHistoryCrudService;

/**
 *
 * @author phila
 */
public class SalesPersonSalHistoryCrudServiceImpl implements SalesPersonSalHistoryCrudService {

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public SalesPersonSalHistory find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public SalesPersonSalHistory persist(SalesPersonSalHistory entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public SalesPersonSalHistory merge(SalesPersonSalHistory entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public SalesPersonSalHistory remove(SalesPersonSalHistory entity) {
        return null;
    }

    @Override
    public List<SalesPersonSalHistory> findAll() {
        return null;
    }
}
