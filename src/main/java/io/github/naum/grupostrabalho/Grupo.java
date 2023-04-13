
package io.github.naum.grupostrabalho;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "grupo")
    private List<Atuacao> atuacao;
       
    @ManyToOne
    @JoinColumn(name = "lider_id")
    private Pessoa lider;

    public Grupo() {
        atuacao = new ArrayList<>();
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

      public Pessoa getLider() {
          return lider;
      }

      public void setLider(Pessoa lider) {
          this.lider = lider;
      }
    
    //</editor-fold>
      
    //<editor-fold defaultstate="collapsed" desc="Hash//equals/ToString">
      
        @Override
        public int hashCode() {
            int hash = 3;
            hash = 23 * hash + Objects.hashCode(this.id);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Grupo other = (Grupo) obj;
            return Objects.equals(this.id, other.id);
        }

        @Override
        public String toString() {
            return "Grupo{" + "id=" + id 
                    + ", nome=" + nome 
                    + ", ativo=" + ativo 
                    + ", atuacao=" + atuacao 
                    + ", lider=" + lider 
                    + '}';
        }
    //</editor-fold>
    
}
