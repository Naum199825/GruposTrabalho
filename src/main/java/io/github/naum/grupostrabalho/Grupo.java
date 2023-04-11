
package io.github.naum.grupostrabalho;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Friedrich Naum
 */
@Entity
public class Grupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    @Column(length = 65, nullable = false)
    private String nome;

    @Column(nullable= false)
    private boolean ativo = true;
    
    @ManyToMany
    private List<Atuacao> atuacao;
    
    @ManyToMany
    @JoinColumn(name = "pessoa_id")
    private List<Pessoa> pessoa;
    
    @ManyToOne
    @JoinColumn(name = "lider_id")
    private List<Pessoa> lider;

    public Grupo() {
        atuacao = new ArrayList<>();
        pessoa = new ArrayList<>();
        lider = new ArrayList<>();
    }
    
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
        public Long getId() {
          return id;
      }

      public void setId(Long id) {
          this.id = id;
      }

      public String getNome() {
          return nome;
      }

      public void setNome(String nome) {
          this.nome = nome;
      }

      public boolean isAtivo() {
          return ativo;
      }

      public void setAtivo(boolean ativo) {
          this.ativo = ativo;
      }

      public List<Atuacao> getAtuacao() {
          return atuacao;
      }

      public void setAtuacao(List<Atuacao> atuacao) {
          this.atuacao = atuacao;
      }

      public List<Pessoa> getPessoa() {
          return pessoa;
      }

      public void setPessoa(List<Pessoa> pessoa) {
          this.pessoa = pessoa;
      }

      public List<Pessoa> getLider() {
          return lider;
      }

      public void setLider(List<Pessoa> lider) {
          this.lider = lider;
      }
    
    //</editor-fold>
      
}
