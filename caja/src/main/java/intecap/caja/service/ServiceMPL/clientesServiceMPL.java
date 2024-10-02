package intecap.caja.service.ServiceMPL;
import java.util.Optional;

import org.springframework.stereotype.Service;

import intecap.caja.common.commonsvcImpl;
import intecap.caja.models.clientesmodels;
import intecap.caja.repository.clienterepository;
import intecap.caja.service.clientesService;

@Service
public class clientesServiceMPL extends commonsvcImpl<clientesmodels, clienterepository> implements clientesService {

    @Override
    public void deleteById(int id) {
        if (id == 5) {
            throw  new RuntimeException("No se puede eliminar el cliente con id 5");
        }else{
            this.repository.deleteById(id);
        }
    }

    @Override
    public Iterable<clientesmodels> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Optional<clientesmodels> findById(int id) {
        return this.repository.findById(id);
    }

    @Override
    public clientesmodels save(clientesmodels entity) {
        return this.repository.save(entity);
    }

    @Override
    public Iterable<clientesmodels> saveAll(Iterable<clientesmodels> entities) {
        return this.repository.saveAll(entities);
    }

    @Override
    public clientesmodels findByNombre(String nombre) {
        return this.repository.findByNombre(nombre);
    }
}
