package intecap.caja.service.ServiceMPL;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import intecap.caja.common.commonsvcImpl;
import intecap.caja.models.productosmodels;
import intecap.caja.repository.productosrepository;

import intecap.caja.service.productosService;

@Service
public class productosServiceImpl extends commonsvcImpl<productosmodels, productosrepository> implements productosService {

    @Override
    @Transactional
    public Iterable<productosmodels> findAll() {
        return this.repository.findAll();
    }

    @Override
    @Transactional
    public Optional<productosmodels> findById(int id) {
        return this.repository.findById(id);
    }

    @Override
    @Transactional
    public productosmodels save(productosmodels entity) {
        return this.repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        this.repository.deleteById(id);
    }

    @Override
    @Transactional
    public Iterable<productosmodels> saveAll(Iterable<productosmodels> entities) {
        return this.repository.saveAll(entities);
    }
}
