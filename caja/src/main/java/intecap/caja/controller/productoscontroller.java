package intecap.caja.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

import intecap.caja.models.productosmodels;
import intecap.caja.service.productosService;


@RestController
@RequestMapping("/productos")
@CrossOrigin
public class productoscontroller {
        @Autowired
        private productosService pS;
    
        @GetMapping("/listar")
        public Iterable<productosmodels> findAll() {
            return this.pS.findAll();
        }
    
        @GetMapping("/guardar")
        public ResponseEntity<String> saveProducto(@RequestBody productosmodels entity) {
            try {
                this.pS.save(entity);
                return ResponseEntity.ok("Producto Guardado Correctamente");
            } catch (Exception e) {
                return ResponseEntity.badRequest().body("Error en el Servidor");
            }
        }
    
        @DeleteMapping("/eliminar/{idProductos}")
        public ResponseEntity<String> deleteProductos(@PathVariable int idProductos) {
            try {
                this.pS.deleteById(idProductos);
                return ResponseEntity.ok("Producto Eliminado Correctamente");
            } catch (Exception e) {
                    return ResponseEntity.badRequest().body("Error en el Servidor");
            }
        }
    
        @PutMapping("/actualizar/{idProductos}")
        public ResponseEntity<String> updateProductos(@PathVariable int idProductos, @RequestBody productosmodels entity) {
            try {
                Optional<productosmodels> productoOptional = this.pS.findById(idProductos);
    
                if (productoOptional.isPresent()) {
                    productosmodels productoExistente = productoOptional.get();
    
                    productoExistente.setNombre(entity.getNombre());
                    productoExistente.setPrecio(entity.getPrecio());
                    productoExistente.setStock(entity.getStock());
    
                    this.pS.save(productoExistente);
    
                    return ResponseEntity.ok("Producto Actualizado Correctamente");
                } else {
                    return ResponseEntity.badRequest().body("Producto no encontrado");
                }
            } catch (Exception e) {
                return ResponseEntity.badRequest().body("Error en el Servidor");
            }
        }
}
