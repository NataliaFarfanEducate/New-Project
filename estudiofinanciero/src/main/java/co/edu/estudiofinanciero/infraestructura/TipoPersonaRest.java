/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.estudiofinanciero.infraestructura;
import co.edu.estudiofinanciero.domain.TipoPersona;
import co.edu.estudiofinanciero.domain.TipoPersonaService;
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
@RequestMapping({"/tipopersonasrest"})

public class TipoPersonaRest {
    
    @Autowired
    TipoPersonaService tpservice;
    
    @GetMapping("/submit")
    public List<TipoPersona> listarTp(){
    return tpservice.listar();
    }
    
    @PostMapping("/submit")
    public TipoPersona agregar(@RequestBody TipoPersona p){
    return tpservice.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public TipoPersona listarId(@PathVariable("id") int id){
    return tpservice.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public TipoPersona editar(@RequestBody TipoPersona p, @PathVariable("id") int id){
        p.setId_tp(id);
        return tpservice.edit(p);
    }
    
    @DeleteMapping("/submit/{id}")
    public TipoPersona eliminar(@RequestBody TipoPersona p, @PathVariable("id") int id){
        p.setId_tp(id);
        return tpservice.delete(id);
    }
    
}