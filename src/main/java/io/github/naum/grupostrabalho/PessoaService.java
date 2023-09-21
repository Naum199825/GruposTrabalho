package io.github.naum.grupostrabalho;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author IFNMG
 */
@Stateless
public class PessoaService implements PessoaServiceLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void salvar(Pessoa pessoa) {
        em.persist(pessoa);
    }

    
   //Questão 1(Dados Completos)
    @Override
    public List<Pessoa> dadosPessoas() {
        Query q = em.createQuery("SELECT p FROM Pessoa p");
        return (List<Pessoa>) q.getResultList();
    }

    @Override
    public List<Pessoa> dadosPessoaTyped() {
        TypedQuery<Pessoa> q = em.createQuery("SELECT p FROM Pessoa p", Pessoa.class);
        return q.getResultList();
    }

    @Override
    public List<Pessoa> dadosPessoaNamedQuery() {
        return em.createNamedQuery("Pessoa.findALL", Pessoa.class).getResultList();
    }
    
    //Questão 2(Nome das Pessoas)
    @Override
    public List<Pessoa> nomePessoas() {
        Query q = em.createQuery("SELECT p.nome FROM Pessoa p");
        return (List<Pessoa>) q.getResultList();
    }

    @Override
    public List<String> nomePessoasTyped() {
        TypedQuery<String> q = em.createQuery("SELECT p.nome FROM Pessoa p", String.class);
        return q.getResultList();
    }

    @Override
    public List<String> nomePessoaNamedQuery() {
        return em.createNamedQuery("Pessoa.nomeALL", String.class).getResultList();
    }
    
    //Questão 3(Nome das Pessoas) e seus respectivos enderecos(Dados Completos)
    @Override
    public List<Pessoa> nomePessoasEnderecos() {
        Query q = em.createQuery("SELECT p.nome, p.endereco FROM Pessoa p");
        return (List<Pessoa>) q.getResultList();
    }
    
    @Override
    public List<Object[]> nomePessoasEnderecosTypedQuery() {
        TypedQuery<Object[]> q = em.createQuery("SELECT p.nome, p.endereco FROM Pessoa p", Object[].class);
        return q.getResultList();
    }

    @Override
    public List<Object[]> nomePessoaEnderecosNamedQuery(){
        return em.createNamedQuery("Pessoa.nomePessoasEnderecosALL", Object[].class).getResultList();
    }
    
    //Questão 4(Dados das Pessoas) que não moram em Praca
    @Override
    public List<Pessoa> pessoasNMPraca() {
        Query q = em.createQuery("SELECT p FROM Pessoa p, Endereco ed WHERE ed.logradouro != 'PRACA'");
        return (List<Pessoa>) q.getResultList();
    }
    
//    @Override
//    public List<Object[]> nomePessoasEnderecosTypedQuery() {
//        TypedQuery<Object[]> q = em.createQuery("SELECT p.nome, p.endereco FROM Pessoa p", Object[].class);
//        return q.getResultList();
//    }
//
//    @Override
//    public List<Object[]> nomePessoaEnderecosNamedQuery(){
//        return em.createNamedQuery("Pessoa.nomePessoasEnderecosALL", Object[].class).getResultList();
//    }
    
    
}
