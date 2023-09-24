/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package io.github.naum.grupostrabalho.grupo;

import java.time.LocalDate;
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
        
    //Questão 14 Grupos liderados por Beatriz
        @Override
        public List<Grupo> gruposLiderados(String nomeLider) {
        Query q = emG.createQuery("SELECT g FROM Grupo g JOIN g.lider l WHERE l.nome=: nomeLider").setParameter("nomeLider", nomeLider);
        return (List<Grupo>) q.getResultList();
        }
        
    //Questão 15 Grupos liderados por Beatriz    
        @Override
        public List<Object[]> dataIniDatafimCecilia(String nomeMembro) {
        Query q = emG.createQuery("SELECT g.nome,a.inicio,a.termino FROM Grupo g JOIN g.atores a  WHERE a.pessoa.nome=:nomeMembro").setParameter("nomeMembro", nomeMembro);
        return (List<Object[]>) q.getResultList();
    }
        
     //Questão 16 Grupos que contém 'II' 
        @Override
        public List<Grupo> gruposContemII(String str) {
        Query q = emG.createQuery("SELECT g FROM Grupo g WHERE g.nome LIKE :str ").setParameter("str", '%' + str + '%');
        return (List<Grupo>) q.getResultList();
        }
        
     //Questão 17 Grupos com memebros distintos 
        @Override
        public List<Object[]> gruposMembrosDistin() {
        Query q = emG.createNamedQuery("SELECT g.nome,count(DISTINCT a.pessoa) FROM Grupo g JOIN g.atores a GROUP BY g", Object[].class);
        return (List<Object[]>) q.getResultList();
    }
      
    //Questão 18 Grupos com memebros distintos 
        @Override
        public List<Object[]> grupos3MaisMembros(long qtd) {
        Query q = emG.createQuery("SELECT g.nome, COUNT(a.id) FROM Grupo g JOIN g.atores a GROUP BY g HAVING COUNT(a.id) >= :qtd").setParameter("qtd", qtd);
        return (List<Object[]>) q.getResultList();
    }
    //Questão 19 Membros que entram em 2012
        @Override
        public List<Object[]> memebros2012(String nomeGrupo, LocalDate data) {
        Query q = emG.createQuery("SELECT DISTINCT a.pessoa.nome FROM Grupo g JOIN g.atores a WHERE g.nome =:nomeGrupo AND a.inicio>=: data").setParameter("nomeGrupo", nomeGrupo).setParameter("data", data);
        return (List<Object[]>) q.getResultList();
    }
    
    //Questão 20 Info de Membros, grupos e datas de entrada
        @Override
        public List<Object[]> infoMemGrupo(LocalDate data) {
        Query q = emG.createQuery("SELECT g.nome, a.pessoa.nome, a.inicio FROM Grupo g JOIN g.atores a WHERE a.inicio>=:data ORDER BY g.nome").setParameter("data", data);
        return (List<Object[]>) q.getResultList();
    }
    
    //Questão 21 Info de Membros, grupos e datas de entrada
        @Override
         public List<Object[]> semTermino() {
        Query q = emG.createQuery("SELECT g.nome, a.pessoa.nome FROM Grupo g JOIN g.atores a WHERE a.termino IS NULL");
        return (List<Object[]>) q.getResultList();
    }
         
    @Override
    public List<Object[]> questao22() {
        Query q = emG.createQuery("SELECT g.nome, g.lider.nome, a.pessoa.nome FROM Grupo g JOIN g.atores a ORDER BY g.nome, g.lider.nome, a.pessoa.nome");
        return (List<Object[]>) q.getResultList();
    }
}

