package intecap.caja.repository;

import org.springframework.data.repository.CrudRepository;

import intecap.caja.models.clientesmodels;

public interface clienterepository extends CrudRepository<clientesmodels, Object> {
    clientesmodels findByNombre(String nombre);
}
