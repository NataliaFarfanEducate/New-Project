/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.estudiofinanciero.domain;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface ProductoRepository extends Repository<Producto, Integer> {

    List<Producto> findAll();

    Producto findById(int id);

    Producto save(Producto p);

    void delete(Producto p);
}