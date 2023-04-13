
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
    EntityManager em;

    @Override
    public void salvar(Grupo grupo) {
        em.persist(grupo);
    }
    
    
}
