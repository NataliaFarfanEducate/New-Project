/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.estudiofinanciero.infraestructura;
import co.edu.estudiofinanciero.domain.Producto;
import co.edu.estudiofinanciero.domain.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/productorest"})
public class ProductoRest {

    @Autowired
    ProductoService pservice;

    // ProductoRest
    @GetMapping("/producto")
    public List<Producto> listarP() {
        return pservice.listar();
    }

    @PostMapping("/producto/add")
    public Producto agregarP(@RequestBody Producto p) {
        return pservice.add(p);
    }

    @GetMapping("/producto/{id}")
    public Producto listarIdP(@PathVariable("id") int id) {
        return pservice.listarId(id);
    }

    @PutMapping("/producto/{id}")
    public Producto editarP(@RequestBody Producto p, @PathVariable("id") int id) {
        p.setProducto_id(id);
        return pservice.edit(p);
    }

    @DeleteMapping("/producto/{id}")
    public Producto deleteP(@PathVariable("id") int id) {
        return pservice.delete(id);
    }
}