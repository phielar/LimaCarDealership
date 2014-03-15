/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.service.crud.Impl;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import philaman.cput.limacardealers.model.Address;
import philaman.cput.limacardealers.service.crud.AddressCrudService;

/**
 *
 * @author phila
 */
public class AddressCrudServiceImpl implements AddressCrudService {

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Address find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Address persist(Address entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Address merge(Address entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Address remove(Address entity) {
        return null;
    }

    @Override
    @Transactional(propagation =Propagation.NOT_SUPPORTED)
    public List<Address> findAll() {
        return null;
    }
}
