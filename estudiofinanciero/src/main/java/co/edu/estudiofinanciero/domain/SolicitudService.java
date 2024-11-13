/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.estudiofinanciero.domain;
import java.util.List;

public interface SolicitudService {

    List<Solicitud> listar();

    Solicitud listarId(int id);

    Solicitud add(Solicitud p);

    Solicitud edit(Solicitud p);

    Solicitud delete(int id);
}