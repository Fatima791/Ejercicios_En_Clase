package intecap.caja.service;

import java.util.Optional;

import intecap.caja.common.commonsvc;
import intecap.caja.models.productosmodels;

public interface productosService extends commonsvc<productosmodels> {
    public Iterable<productosmodels> findAll();
    public Optional<productosmodels> findById(int id);
    public productosmodels save(productosmodels entity);
    public void deleteById(int id);
    Iterable<productosmodels> saveAll(Iterable<productosmodels> entities);
    
    
}