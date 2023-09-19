/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package io.github.naum.grupostrabalho;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fried
 */
@Stateless
public class GrupoService implements GrupoServiceLocal {

    @PersistenceContext
    private EntityManager emG;

    @Override
    public void salvar(Grupo grupo) {
        emG.persist(grupo);
    }         
            
}
