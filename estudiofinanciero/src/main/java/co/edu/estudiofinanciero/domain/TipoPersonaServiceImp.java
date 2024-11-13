/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.estudiofinanciero.domain;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoPersonaServiceImp implements TipoPersonaService{

 @Autowired
 private TipoPersonaRepository tp_repositorio;
 
 @Override
 public List<TipoPersona> listar() {
 return tp_repositorio.findAll();
 }
 
 @Override
 public TipoPersona listarId(int id) {
 return tp_repositorio.findById(id);
 }
 
 @Override
 public TipoPersona add(TipoPersona p) {
 return tp_repositorio.save(p);
 }
 
 @Override
 public TipoPersona edit(TipoPersona p) {
 return tp_repositorio.save(p);
 }
 
 @Override
 public TipoPersona delete(int id) {
     TipoPersona p = tp_repositorio.findById(id);
     
     if (p != null){
         tp_repositorio.delete(p);
     }
     
     return p;
}
 
}