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
    public List<Pessoa> nomePessoasTyped() {
        TypedQuery<Pessoa> q = em.createQuery("SELECT p.nome FROM Pessoa p", Pessoa.class);
        return q.getResultList();
    }

    @Override
    public List<Pessoa> nomePessoaNamedQuery() {
        return em.createNamedQuery("Pessoa.nomeALL", Pessoa.class).getResultList();
    }
    
    
    
    
    
}
