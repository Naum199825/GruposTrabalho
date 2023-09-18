package io.github.naum.grupostrabalho;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author IFNMG
 */
@Singleton
public class PessoaService implements PessoaServiceLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void salvar(Pessoa Pessoa) {
        em.persist(em);
    }
    
}
