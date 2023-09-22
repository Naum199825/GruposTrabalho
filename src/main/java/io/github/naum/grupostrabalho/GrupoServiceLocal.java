/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package io.github.naum.grupostrabalho;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fried
 */
@Local
public interface GrupoServiceLocal {

    void salvar(Grupo grupo);

    public List<Grupo> GruposNAtivos();

    public List<Grupo> GruposLideres();

    public List<Object[]> MembrosDESC();
    
}
