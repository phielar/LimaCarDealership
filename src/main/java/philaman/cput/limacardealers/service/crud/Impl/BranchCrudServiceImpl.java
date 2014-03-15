/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service.crud.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import philaman.cput.limacardealers.model.Branch;
import philaman.cput.limacardealers.service.crud.BranchCrudService;

/**
 *
 * @author phila
 */
public class BranchCrudServiceImpl implements BranchCrudService {

    @Override
    @Transactional(propagation= Propagation.SUPPORTS)
    public Branch find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation =Propagation.REQUIRES_NEW)
    public Branch persist(Branch entity) {
     return null;
    }

    @Override
    @Transactional(propagation =Propagation.REQUIRES_NEW)
    public Branch merge(Branch entity) {
    return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Branch remove(Branch entity) {
      return null;
    }

    @Override
    @Transactional(propagation=Propagation.NOT_SUPPORTED)
    public List<Branch> findAll() {
     return null;
    }
    
}
