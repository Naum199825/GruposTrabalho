
package io.github.naum.grupostrabalho;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author IFNMG
 */
@Entity
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private TipoLogradouro tipoLogradouro;
    
    @Column(length = 150, nullable = false)
    private String logradouro;
    
    @Column(nullable = false)
    private Integer numero;
    
    @Column(nullable = false, length = 25)
    private String bairro;
    
    public enum TipoLogradouro{
        RUA, 
        AVENIDA, 
        PRACA, 
        OUTRO;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getLogradouro() {
            return logradouro;
        }

        public void setLogradouro(String logradouro) {
            this.logradouro = logradouro;
        }

        public Integer getNumero() {
            return numero;
        }

        public void setNumero(Integer numero) {
            this.numero = numero;
        }

        public String getBairro() {
            return bairro;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        public TipoLogradouro getTipoLogradouro() {
            return tipoLogradouro;
        }

        public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
            this.tipoLogradouro = tipoLogradouro;
        }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Equals/Hash/ToString">
            @Override
        public int hashCode() {
            int hash = 5;
            hash = 41 * hash + Objects.hashCode(this.id);
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
            final Endereco other = (Endereco) obj;
            return Objects.equals(this.id, other.id);
        }

        @Override
        public String toString() {
            return "Endereco{" + "id=" + id 
                    + ", tipoLogradouro=" + tipoLogradouro 
                    + ", logradouro=" + logradouro 
                    + ", numero=" + numero 
                    + ", bairro=" + bairro 
                    + '}';
        }
    //</editor-fold>
    
}
