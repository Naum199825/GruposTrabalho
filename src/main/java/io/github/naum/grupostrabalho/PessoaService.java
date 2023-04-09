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
 * @author IFNMG
 */
@Stateless
public class PessoaService implements PessoaServiceLocal {

    @PersistenceContext
    EntityManager em;  // Ctrl + shift + i, importa automaticamente

    @Override
    public void salvar(Pessoa pessoa) {
        em.persist(pessoa);
    }
    
    
    
    
}
