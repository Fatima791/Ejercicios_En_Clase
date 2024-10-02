package intecap.caja.service;

import java.util.Optional;

import intecap.caja.common.commonsvc;
import intecap.caja.models.clientesmodels;


public interface clientesService extends commonsvc<clientesmodels>{
    public Iterable<clientesmodels> findAll();
    public Optional<clientesmodels>  findById(int id);
    public clientesmodels findByNombre(String nombre);
    public intecap.caja.models.clientesmodels save(intecap.caja.models.clientesmodels entity);
    public void deleteById(int id);
    Iterable<intecap.caja.models.clientesmodels> saveAll(Iterable<clientesmodels> entities);
}