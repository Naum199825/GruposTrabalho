/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package io.github.naum.grupostrabalho;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
    
    //Questão 11 Grupos não ativos
        @Override
        public List<Grupo> GruposNAtivos() {
            Query q = emG.createQuery("SELECT g FROM Grupo g Where g.ativo = false");
            return (List<Grupo>) q.getResultList();
        }
    
   //Questão 12 Lideres e seus Grupos
        @Override
        public List<Grupo> GruposLideres() {
            Query q = emG.createQuery("SELECT g.nome, g.lider FROM Grupo g");
            return (List<Grupo>) q.getResultList();
        }
        
    //Questão 12 Lideres e seus Grupos
        @Override
        public List<Object[]> MembrosDESC() {
            Query q = emG.createQuery("SELECT g.nome, a.pessoa FROM Grupo g, Atuacao a ORDER BY a.pessoa DESC", Object[].class);
            return q.getResultList();
        }
}
