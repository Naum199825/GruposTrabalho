package io.github.naum.grupostrabalho.pessoa;

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

           //<editor-fold defaultstate="collapsed" desc="Questai 1">
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
//</editor-fold>
    
           //<editor-fold defaultstate="collapsed" desc="Questao 2">
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
//</editor-fold>
    
           //<editor-fold defaultstate="collapsed" desc="Questao 3">
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
        return em.createNamedQuery("Pessoa.nomePessoasTelefonesALL", Object[].class).getResultList();
    }
//</editor-fold>
    
           //<editor-fold defaultstate="collapsed" desc="Questão 4">
     //Questão 4(Nome das Pessoas) que moram em Avenidas
        @Override
        public List<Pessoa> pessoasMAvenidas() {
            Query q = em.createQuery("SELECT p from Pessoa p WHERE p.endereco.tipoLogradouro = 1");
            return (List<Pessoa>) q.getResultList();
        }

        @Override
        public List<Pessoa> pessoasMAvenidaTypedQuery() {
            TypedQuery<Pessoa> q = em.createQuery("SELECT p from Pessoa p WHERE p.endereco.tipoLogradouro = 1", Pessoa.class);
            return q.getResultList();
        }

        @Override
        public List<Pessoa> pessoaMAvenidaNamedQuery(){
            return em.createNamedQuery("Pessoa.pessoasMAvenidaALL", Pessoa.class).getResultList();
        }
//</editor-fold>
    
           //<editor-fold defaultstate="collapsed" desc="Questão 5">
    //Questão 5(Dados das Pessoas) que não moram em Praca
    @Override
    public List<Pessoa> pessoasNMPraca() {
        Query q = em.createQuery("SELECT p from Pessoa p "
                + "WHERE NOT p.endereco.tipoLogradouro = 2");
        return (List<Pessoa>) q.getResultList();
    }
    
    @Override
    public List<Pessoa> pessoasNMPracaTypedQuery() {
        TypedQuery<Pessoa> q = em.createQuery("SELECT p from Pessoa p "
                + "WHERE NOT p.endereco.tipoLogradouro = 2", Pessoa.class);
        return q.getResultList();
    }

    @Override
    public List<Pessoa> pessoasNMPracaNamedQuery(){
        return em.createNamedQuery("Pessoa.pessoasNMPracaALL", Pessoa.class).getResultList();
    }
//</editor-fold>
 
           //<editor-fold defaultstate="collapsed" desc="Questão 6">
       //Questão 6(Nome das Pessoas) e seus respectivos numeros
        @Override
        public List<Pessoa> nomePessoasTelefones() {
            Query q = em.createQuery("SELECT p.nome, p.telefone FROM Pessoa p");
            return (List<Pessoa>) q.getResultList();
        }

        @Override
        public List<Object[]> nomePessoastelefonesTypedQuery() {
            TypedQuery<Object[]> q = em.createQuery("SELECT p.nome, p.telefone FROM Pessoa p", Object[].class);
            return q.getResultList();
        }

        @Override
        public List<Object[]> nomePessoaTelefonesNamedQuery(){
            return em.createNamedQuery("Pessoa.nomePessoasEnderecosALL", Object[].class).getResultList();
        }
//</editor-fold>
 
        
        //Questão 7(Dados das Pessoas) e seus respectivos numeros
        @Override
        public List<Pessoa> PessoasDataNasc() {
            Query q = em.createQuery("SELECT p FROM Pessoa p WHERE p.nascimento BETWEEN '2001-4-1' AND '2004-04-01'");
            return (List<Pessoa>) q.getResultList();
        }

         //Questão 8(Dados das Pessoas) se tiver o dd de parana
        @Override
        public List<Pessoa> PessoasDDDQuery() {
            Query q = em.createQuery("SELECT DISTINCT p FROM Pessoa p, IN (p.telefone) t "
                + "WHERE t.ddd=41 OR t.ddd=42 OR t.ddd=43 OR t.ddd=44 OR t.ddd=45 OR t.ddd=46");
            return (List<Pessoa>) q.getResultList();
        }
        
        //Questão 8B(Dados das Pessoas) 
        @Override
        public List<Pessoa> PessoasDDD2Query() {
            Query q = em.createQuery("SELECT DISTINCT p FROM Pessoa p, IN (p.telefone) t "
                + "WHERE t.ddd=21 OR t.ddd=22 OR t.ddd=24");
            return (List<Pessoa>) q.getResultList();
        }
        
        //Questão 9(Dados das Pessoas) sem Telefones
        @Override
        public List<Pessoa> PessoasSemTelefoneQuery() {
            Query q = em.createQuery("SELECT p FROM Pessoa p WHERE p.telefone IS EMPTY");
            return (List<Pessoa>) q.getResultList();
        } 
        
        //Questão 10(Dados das Pessoas) se tiver o dd de parana(Não sei converter tipos em Expre~ssões SQL)
        @Override
        public List<Pessoa> PessoasQTDTelefonesQuery() {
            Query q = em.createQuery("SELECT p.nome, count(t.id) FROM Pessoa p, IN (p.telefone) t GROUP BY p.nome");
            return (List<Pessoa>) q.getResultList();
        }
        
        //Questao 13 - Membros em Ordem Desc
        @Override
         public List<Pessoa> membrosDescQuery(String nomeGrupo) {
        Query q = em.createQuery("SELECT p.nome FROM Pessoa p JOIN p.atuacoes a WHERE a.grupo.nome =:nomeGrupo ORDER BY p.nome DESC").setParameter("nomeGrupo", nomeGrupo);
        return (List<Pessoa>) q.getResultList();
    }
        
        
        
}
